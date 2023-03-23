public class Main {
    public static void main(String[] args) {
        System.out.println(Authentication.checkLogin("java_skyprv1"));
        System.out.println(Authentication.checkPassword("D_1hWidjxbqjkdb"));
        System.out.println(Authentication.comparePasswordWithConfirmPassword("D_1hWiKjjP_9", "D_1hWiKjj_9"));
    }
}