public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);                // list() przekazuje rezultat działania do argumentu wywołania - System.out
        System.out.println(System.getProperty("user.name"));
        System.out.println(
                System.getProperty("java.library.path")
        );
    }
}
