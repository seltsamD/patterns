package example.patterns.prototype.shallow;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@Slf4j
public class DocumentTest {
    @Test
    void test() throws CloneNotSupportedException {
        Document original = new Document();
        Document clon = original.clone();
        log.info("\n\n*******************");
        log.info("Original object: " + original);
        log.info("Cloned object: " + clon) ;

        clon.getUser().setName("Changed name");

        log.info("Changed user name in clon " + clon);
        log.info("Original object: " + original);
        log.info("\n\n*******************");
    }
}
