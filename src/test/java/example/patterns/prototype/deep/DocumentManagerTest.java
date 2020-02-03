package example.patterns.prototype.deep;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@Slf4j
public class DocumentManagerTest {
    @Test
    void test() throws CloneNotSupportedException {
        log.info("\n\n*******************");
        log.info("User document");
        Document userDocument = DocumentManager.getClonedDocument("user").clone();
        log.info("First cloned: " + userDocument.toString());

        Document userDocument2 = DocumentManager.getClonedDocument("user").clone();
        userDocument2.setName("New name");
        log.info("Second cloned: " + userDocument2.toString());
        log.info("First cloned: " + userDocument.toString());

        log.info("*******************");
        log.info("Template document");
        Document templateDocument = DocumentManager.getClonedDocument("temp").clone();
        log.info("First cloned: " + templateDocument.toString());

        Document templateDocument2 = DocumentManager.getClonedDocument("temp").clone();
        templateDocument2.setName("Changed template name");
        log.info("Second cloned: " + templateDocument2.toString());
        log.info("First cloned: " + templateDocument.toString());
        log.info("\n\n*******************");
    }
}
