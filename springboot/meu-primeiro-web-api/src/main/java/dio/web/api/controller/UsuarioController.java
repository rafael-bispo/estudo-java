package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    //método que lista usuários
    @GetMapping("/users")
    public List<Usuario> getUsers(){
        return repository.findAll();
    }

    //Método que encotra pelo nome
    /*
    * Neste método, o URI será recebido como parâmetro
    * ou seja, digitando lá na URI o nome que quero encontrar
    * Estarei invocando o método e passando o parêmtro necessário
    * para que ele faça a busca e retorne. No caso, essa é uma Path
    * variable, ou variável de caminho
    * */
    //GetMapping, pois é um método get, para obter
    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    //Deletar um usuário pelo id
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    //Cadastradno usuário
    @PostMapping("/users")
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

    //Fazendo operação de put
    @PutMapping()
    public void putUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
