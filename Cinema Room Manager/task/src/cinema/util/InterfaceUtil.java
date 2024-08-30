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

    public static void printTotalIncome(int totalIncome) {
        System.out.println("Total income: $" + totalIncome + "\n");
    }

    public static void printCurrentIncome(int currentIncome) {
        System.out.println("Current income: $" + currentIncome);
    }

    public static void printNumberOfPurchasedTickets(int number) {
        System.out.println("\nNumber of purchased tickets: " + number);
    }

    public static void printPercentage(double percentage) {
        System.out.printf("Percentage: %.2f%%\n", percentage);
    }
}