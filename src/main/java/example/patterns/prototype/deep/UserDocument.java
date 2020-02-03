package example.patterns.prototype.deep;

import lombok.Data;

@Data
public class UserDocument extends Document {
    private User user;

    public UserDocument(String documentName, User user) {
        super(documentName);
        this.user = user;
    }


    @Override
    protected Document clone() throws CloneNotSupportedException {
        UserDocument clonedDocument = (UserDocument) super.clone();
        User clonedUser = this.user.clone();
        clonedDocument.setUser(clonedUser);
        return clonedDocument;
    }

    @Override
    public String toString() {
        return "UserDocument{" +
                "user=" + user +
                "} " + super.toString();
    }
}
