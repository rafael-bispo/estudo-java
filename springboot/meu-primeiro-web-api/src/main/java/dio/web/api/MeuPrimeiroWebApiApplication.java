/*
* Para que est eprograma pudesse funcionar, foi necessário mudar,
* no pom, a versão do java para 1.8, a versão do springboot para 2.5.5
* e a versão do swagger para 2.9.2
* Sem isso só ocorreram erros
* */

package dio.web.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeuPrimeiroWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroWebApiApplication.class, args);
	}

}
