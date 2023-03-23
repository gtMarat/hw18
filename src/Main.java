public class Main {
    public static void main(String[] args) {
        System.out.println(Authentication.checkLogin("java_skhayprogo"));
        System.out.println(Authentication.checkPassword("D_1Adjxbqjkdb"));
        System.out.println(Authentication.comparePasswordWithConfirmPassword("D_1hWiKjj_9", "D_1hWiKjjP_9"));
    }
}