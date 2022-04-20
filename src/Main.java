import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    //Homepage
    public static void main(String[] args) {

        PiggyBank bank = new PiggyBank();
        
        int choice;



        do{ //prompts the user to make a selection
            System.out.println("1. Show total in bank.");
            System.out.println("2. Add a penny.");
            System.out.println("3. Add a nickel.");
            System.out.println("4. Add a dime.");
            System.out.println("5. Add a quarter.");
            System.out.println("6. Take money out of bank.");
            System.out.println("Enter 0 to quit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            
            switch (choice) {
                case 0 -> {}
                case 1 -> {
                    //display Total
                    bank.showTotal();
                }
                case 2, 3, 4, 5 -> {
                    //add balance
                    bank.addBank(choice);
                }
                case 6 -> {
                    //empty piggy bank
                    bank.balance = 0;
                    clearScreen();
                }
            }
           
        }while (choice != 0);
        input.close();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
