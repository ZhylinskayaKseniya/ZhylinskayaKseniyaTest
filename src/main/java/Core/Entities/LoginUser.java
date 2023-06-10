package Core.Entities;

public class LoginUser {
    public record UserModel(String password, String userName) {

        public static UserModel loginUser() {
            return new UserModel("Test1234", "kzhylinskaya-he5q@force.com");
        };
    }
}
