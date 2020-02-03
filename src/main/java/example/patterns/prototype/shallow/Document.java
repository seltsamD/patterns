package example.patterns.prototype.shallow;

import example.patterns.singleton.User;
import lombok.Data;

@Data
public class Document implements Cloneable {
    private int id = 2;
    private String name = "I am document";
    private User user = new User("User name");

    @Override
    protected Document clone() throws CloneNotSupportedException {
        return (Document) super.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clon{");
        sb.append("count=").append(id);
        sb.append(", someString='").append(name).append('\'');
        sb.append(", user=").append(user);
        sb.append('}');
        return sb.toString();
    }

}
