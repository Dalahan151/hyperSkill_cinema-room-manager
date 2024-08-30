package cinema.service;

import cinema.model.Hall;
import cinema.model.Seat;

public class HallService {

    private final Hall hall;

    public HallService(Hall hall) {
        this.hall = hall;
    }

    public void printSeatsState() {
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int j = 1; j <= hall.getCols(); j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < hall.getRows(); i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < hall.getCols(); j++) {
                Seat seat = hall.getSeat(i + 1, j + 1);
                System.out.print(seat.getStatus() + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void buyTicket(int row, int col) {
        hall.getSeat(row, col).changeStatus();
    }

    int getNumberOfSeats() {
        return hall.getNumberOfSeats();
    }

    int getRows() {
        return hall.getRows();
    }

    int getCols() {
        return hall.getCols();
    }
}
