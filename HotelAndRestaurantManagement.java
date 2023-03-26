    import java.util.Scanner;

public class HotelAndRestaurantManagement {
    public static void bookRoom() {
        Scanner input = new Scanner(System.in);
        System.out.print("ROOM/S\n");
        System.out.print("1.) Reserved\n2.)\n3.)\n4.) Reserved\n5.)\n");
        System.out.print("Choose Room number(#) : ");
        String roomNum = input.nextLine();

        if (roomNum.equals("1") || roomNum.equals("4")) {
            System.out.print("\nROOM UNAVAILABLE!");
        } else if (roomNum.equals("2") || roomNum.equals("3") || roomNum.equals("5")) {
            System.out.print("Room Number (" + roomNum + ") is successfully reserved");
        } else {
            System.out.print("\n\nINVALID ROOM NUMBER(#)"); 
        }
    }

    public static void restaurant() {
        Scanner input = new Scanner(System.in);
        int price[] = { 180, 190, 200 };
        boolean order = true;
        int totalDue = 0;

        while (order) {
            System.out.print("FOODS :\n");
            System.out.print("1.) Cordon Bleu\n2.) Sizzling Sisig\n3.) Burger Steak\n");
            System.out.print("Enter choice : ");
            int foodChoice = input.nextInt();

            System.out.print("Enter quantity : ");
            int quantity = input.nextInt();
            input.nextLine(); // consume the newline character left by input.nextInt()

            totalDue += price[foodChoice - 1] * quantity;

            System.out.print("Do you want to buy again? (y/n) : ");
            String orderAgain = input.nextLine();

            if (orderAgain.equalsIgnoreCase("n")) {
                order = false;

                System.out.print("Total price : P " + totalDue + "\n");
                System.out.print("Enter payment : P ");
                int payment = input.nextInt();

                int change = payment - totalDue;

                System.out.print("Change : P " + change);

                System.out.print("\nTHANK YOU!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Welcome to Bacani`s Hotel and Restaurant!\n");
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();

        System.out.print("Username : ");
        String username = input.nextLine();

        System.out.print("Password : ");
        String password = input.nextLine();

        System.out.print("1.) Book a Room\n2.)Go to Restaurant\n3.) Exit\n");
        System.out.print("Enter choice : ");
        String choice = input.nextLine();

        switch(choice){
            case "1":
                bookRoom();
                break;
            case "2":
                restaurant();   
                break;
            case "3":
                System.out.print("\nTHANK YOU!");
                break;
            
            
            default:
                System.out.println("Invalid choice.");
        }
    }
}
