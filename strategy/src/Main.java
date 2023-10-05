import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        Scanner scanner = new Scanner(System.in);
        String basket = "";
        int choose;

        while (true) {
            System.out.println("Select an item to purchase.\n1)Microwave\n2)TV\n3)vacuum cleaner\n4)go to payment");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    basket += "[Microwave] ";
                    break;
                case 2:
                    basket += "[TV] ";
                    break;
                case 3:
                    basket += "[vacuum cleaner] ";
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }

            if (choose == 4) {
                break;
            }
        }

        System.out.println("Choose a payment method.\n1)PayPal\n2)Kaspi\n3)Halyk");
        choose = scanner.nextInt();

        switch (choose) {
            case 1:
                payment.payBy(new PayPayPal());
                payment.payOut();
                System.out.println("Products:\n" + basket + "Paid successfully.");
                break;
            case 2:
                payment.payBy(new PayKaspi());
                payment.payOut();
                System.out.println("Products:\n" + basket + "Paid successfully.");
                break;
            case 3:
                payment.payBy(new PayHalyk());
                payment.payOut();
                System.out.println("Products:\n" + basket + "Paid successfully.");
                break;
            default:
                System.out.println("Invalid payment method.");
        }
    }
}
