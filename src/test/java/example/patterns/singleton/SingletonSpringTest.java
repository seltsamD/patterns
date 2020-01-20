package example.patterns.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Slf4j
class SingletonSpringTest {

    @Resource(name =  "user1")
    private User user;

    @Resource(name = "user1")
    private User user1;

    @Resource(name = "user2")
    private User user2;

    @Test
    void test(){
        log.info("Bean user: {}", user.getName());
        log.info("Bean user1: {}", user1.getName());
        log.info("Bean user2: {}", user2.getName());

        log.info("Bean user == user1 => {}", user == user1);
        log.info("Bean user == user2 => {}", user == user2);
    }
}
