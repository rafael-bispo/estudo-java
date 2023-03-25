package one.digitalinnovation.labpadroesprojetospring.service.impl;

import one.digitalinnovation.labpadroesprojetospring.model.Cliente;
import one.digitalinnovation.labpadroesprojetospring.model.Endereco;
import one.digitalinnovation.labpadroesprojetospring.model.RepositoryCliente;
import one.digitalinnovation.labpadroesprojetospring.model.RepositoryEndereco;
import one.digitalinnovation.labpadroesprojetospring.service.ServiceCliente;
import one.digitalinnovation.labpadroesprojetospring.service.ServiceViaCep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceClienteImpl implements ServiceCliente {

    @Autowired
    private RepositoryCliente repositoryCliente;

    @Autowired
    private RepositoryEndereco repositoryEndereco;

    @Autowired
    private ServiceViaCep serviceViaCep;

    //Usa o método findAll de Iterable.
    @Override
    public Iterable<Cliente> buscarTodos() {

        return repositoryCliente.findAll();
    }

    //Buscando cliente por id, com Optional pois pode existir ou não
    //O iideal é além do que foi feito criar uma regra para quando não existir
    @Override
    public Cliente buscarPorId(Long id) {

        Optional<Cliente> cliente = repositoryCliente.findById(id);
        return cliente.get();
    }

    //
    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        //verificase o id existe
        Optional<Cliente> clienteBd = repositoryCliente.findById(id);
        if(clienteBd.isPresent()){
            salvarClienteComCep(cliente);
        }
        else {
            System.out.println("Não existe cliente cadastrado com este id.");
        }

    }

    @Override
    public void deletar(Long id) {
        repositoryCliente.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();

        //Aqui verifica se o endereco do cliente já existe,se não existir
        //É feito o cadastro, retornando novoEndereco para a variável endereco
        Endereco endereco = repositoryEndereco.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = serviceViaCep.consultarCep(cep);
            repositoryEndereco.save(novoEndereco);
            return novoEndereco;
        });

        //atribui o endereço ao cliente
        cliente.setEndereco(endereco);

        //insere o cliente
        repositoryCliente.save(cliente);
    }
}
