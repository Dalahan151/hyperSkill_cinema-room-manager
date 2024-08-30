package cinema;

import cinema.model.Hall;
import cinema.service.HallService;
import cinema.service.PriceService;
import cinema.util.InterfaceUtil;

import java.util.Scanner;

public class Cinema {

    private static final int SHOW_SEATS = 1;
    private static final int BUY_TICKET = 2;
    private static final int SHOW_STATISTICS = 3;
    private static final int EXIT = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int cols = sc.nextInt();

        HallService hallService = new HallService(new Hall(rows, cols));
        PriceService priceService = new PriceService(hallService);

        startInterface(sc, hallService, priceService);

        sc.close();
    }

    private static void startInterface(Scanner sc, HallService hallService, PriceService priceService) {
        int userInput;
        do {
            InterfaceUtil.printInterface();
            userInput = sc.nextInt();

            switch (userInput) {
                case SHOW_SEATS:
                    hallService.printSeatsState();
                    break;
                case BUY_TICKET:
                    buyTicket(sc, hallService, priceService);
                    break;
                case SHOW_STATISTICS:
                    show_statistics(hallService, priceService);
                    break;
            }

        } while (userInput != EXIT);
    }

    private static void buyTicket(Scanner sc, HallService hallService, PriceService priceService) {
        int row, col;
        do {
            InterfaceUtil.printEnterRow();
            row = sc.nextInt();
            InterfaceUtil.printEnterSeat();
            col = sc.nextInt();

            if ((row < 1 || row > hallService.getRows()) || (col < 1 || col > hallService.getCols())) {
                InterfaceUtil.printWrongInput();
                continue;
            }
            if (hallService.buyTicket(row, col)) {
                priceService.printPriceOfTicket(row);
                break;
            } else {
                InterfaceUtil.printTicketHasAlreadyBeenPurchased();
            }
        } while (true);
    }

    private static void show_statistics(HallService hallService, PriceService priceService) {

    }
}