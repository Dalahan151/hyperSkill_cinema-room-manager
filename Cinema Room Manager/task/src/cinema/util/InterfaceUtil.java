package cinema.util;

public class InterfaceUtil {

    public static void printInterface() {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
    }

    public static void printTicketHasAlreadyBeenPurchased() {
        System.out.println("\nThat ticket has already been purchased!\n");
    }

    public static void printWrongInput() {
        System.out.println("\nWrong input!\n");
    }

    public static void printEnterRow() {
        System.out.println("Enter a row number:");
    }

    public static void printEnterSeat() {
        System.out.println("Enter a seat number in that row:");
    }
}