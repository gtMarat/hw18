public class Authentication implements AuthService {
    public static boolean checkLogin(String login) {
        try {


            if (login.length() > 20) {
                throw new WrongLoginException("Логин должен быть не более 20 символов" +
                        ", а введено " + login.length());
            }
            if (!login.matches("^[a-zA-Z0-9_]*$")) {
                throw new WrongLoginException("Логин должен содержать только " +
                        "латинские буквы, цифры и знак подчеркивания");
            }
            return true;
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean checkPassword(String password) {
        try {

            if (password.length() >= 20) {
                throw new WrongPasswordException("Пароль должен быть строго меньше 20 символов" +
                        ", а введено " + password.length());
            }
            if (!password.matches("^[a-zA-Z0-9_]*$")) {
                throw new WrongPasswordException("Пароль должен содержать только " +
                        "латинские буквы, цифры и знак подчеркивания");
            }
            return true;
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean comparePasswordWithConfirmPassword(String password, String confirmPassword) {
        try {

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Параметры password и confirmPassword " +
                        "должны быть равны");
            }
            return true;
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public String operationAuth(String login, String password, String confirmPassword) {
        return null;
    }
}

