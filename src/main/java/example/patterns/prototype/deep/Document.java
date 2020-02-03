package example.patterns.prototype.deep;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Document implements Cloneable {
    private String name;

    @Override
    protected Document clone() throws CloneNotSupportedException {
        return (Document) super.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Document{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
