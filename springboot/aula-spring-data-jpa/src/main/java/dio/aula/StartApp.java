package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        //Setando usuário
        User user = new User();
        user.setName("Rafael");
        user.setUsername("rafaelbispo");
        user.setPassword("senha123");

        //salvando no BD
        repository.save(user);

        //Mostrando os usuários do BD
        for (User user1: repository.findAll()) {
            System.out.println(user1);
        }
    }
}
