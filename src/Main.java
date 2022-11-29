
public class Main {
    public static void main(String[] args) {
        String initialString = """
                 full_name, email, location
                Anita, anita@email.com, California
                Aron, aron@email.com, California
                Aron, aron@email.com, California
                Cosmin, kox@bla.com, Giurgiu
                Crina, gll@test.com, Letcani
                Bogdan, vox@example.com, Resita""";

        Service service = new Service();
        String finalString = service.performOperations(initialString);
        System.out.println(finalString);
    }
}