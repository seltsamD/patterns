package example.patterns.prototype.deep;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User implements Cloneable {
    private String username;

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}
