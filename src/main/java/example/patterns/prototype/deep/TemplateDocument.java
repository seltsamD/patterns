package example.patterns.prototype.deep;

import lombok.Data;

@Data
public class TemplateDocument extends Document {
    public TemplateDocument(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "TemplateDocument{} " + super.toString();
    }
}
