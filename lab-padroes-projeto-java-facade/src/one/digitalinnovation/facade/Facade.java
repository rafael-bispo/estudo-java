package one.digitalinnovation.facade;

import one.digitalinnovation.facade.subsistema1.crm.CrmService;
import one.digitalinnovation.facade.subsistema2.cep.CepApi;

public class Facade {
    public void  migrarCliente(String nome, String cep){

        //recuperando cidade
        String cidade = CepApi.getInstancia().recuperarCidade(cep);

        //recuperando estado
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        //Gravando o cliente usando os dados de parâmentro e os dados recuperados em cepapi
        CrmService.gravarCliente(nome, cep, cidade, estado);

        //Logo, foi realizada a integração entre apis
    }
}
