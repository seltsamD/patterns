package example.patterns.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SingletonSpring {

    public static void main(String[] args) {
        SpringApplication.run(SingletonSpring.class, args);
    }
    @Bean(name = "user1")
    public User user1() {
        return new User("Test User 1");
    }

    @Bean(name = "user2")
    public User user2() {
        return new User("Test User 3");
    }
}
