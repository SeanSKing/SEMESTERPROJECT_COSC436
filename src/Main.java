import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter your First Name: ");
        Scanner scanner = new Scanner(System.in);
        String F_name = scanner.nextLine();
        System.out.println("Enter Last Name");
        String L_name = scanner.nextLine();

        //create invoker and commands
        Invoker invokes = new Invoker(new Aggregator());
        SystemInterface go = new SystemInterface();
        go.setInvoker(invokes);
        go.run();





    }
}