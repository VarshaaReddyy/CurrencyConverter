import java. util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        System.out.println("Helloo!! here are currency you can change and know");
        System.out.println("\n1:Ruppe");
        System.out.println("\n2:Dollar");
        System.out.println("\n3:Euro");
        Scanner s = new Scanner(System.in);
        System. out.println("Choose the currency");
        int choice = s.nextInt();
        System.out.println("Enter the amount: ");
        double amount = s.nextDouble();
        switch (choice) {
            case 1:
                Ruppe(amount);
                break;
            case 2:
                Dollar(amount);
                break;
            case 3:
                Euro(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

public static void Ruppe(double amt) {
    System.out.println("1 Ruppe = " + 0.013 + " Dollar");
    System.out.println();

    System.out.println(amt+" Ruppe = " + (amt*0.013) + " Dollar");
    System.out.println();

    System.out.println("1 Ruppe = " + 0.012 + " Euro");
    System.out.println();
    System.out.println(amt+" Ruppe = " + (amt*0.012) + " Euro");
    System.out.println();

}
    

public static void Dollar(double amt) {
    System.out.println("1 Dollar = " + 79.37 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Dollar = " + (amt*79.37) + " Ruppe");
    System.out.println();

    System.out.println("1 Dollar= " + 0.98 + " Euro");
    System.out.println();

    System.out.println(amt+" Dollar = " + (amt*0.98) + " Euro");
}

    

public static void Euro(double amt){
    System.out.println("1 Euro = " + 80.85 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Euro = " + (amt*80.85) + " Ruppe");
    System.out.println();

    System.out.println("1 Euro = " + 1.02 + " Dollar");
    System.out.println();

    System.out.println(amt+" Euro = " + (amt*1.02) + " Dollar");
}
}