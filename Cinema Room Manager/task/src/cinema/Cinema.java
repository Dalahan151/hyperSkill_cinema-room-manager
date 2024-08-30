package cinema;

import cinema.model.Hall;
import cinema.service.HallService;
import cinema.service.PriceService;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int cols = sc.nextInt();

        HallService hallService = new HallService(new Hall(rows, cols));
        PriceService priceService = new PriceService(hallService);

        hallService.printSeatsState();

        System.out.println("Enter a row number:");
        int row = sc.nextInt();
        System.out.println("Enter a seat number in that row:");
        int col = sc.nextInt();

        priceService.printPriceOfTicket(row);
        hallService.buyTicket(row, col);

        hallService.printSeatsState();
    }
}