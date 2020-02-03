package example.patterns.prototype.deep;

import java.util.HashMap;
import java.util.Map;

public class DocumentManager {
    private static Map<String, Document> documentMap = new HashMap<>();

    static {
        TemplateDocument templateDocument = new TemplateDocument("Template 1");
        documentMap.put("temp", templateDocument);

        UserDocument userDocument = new UserDocument("user", new User("Person"));
        documentMap.put("user", userDocument);
    }

    public static Document getClonedDocument(String type) {
        Document clonedDocument = null;
        try {
            Document document = documentMap.get(type);
            clonedDocument = document.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clonedDocument;
    }
}
