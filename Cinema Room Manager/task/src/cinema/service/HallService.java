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

    public boolean buyTicket(int row, int col) {
        Seat seat = hall.getSeat(row, col);
        if (seat.isBooked()) {
            return false;
        } else {
            hall.getSeat(row, col).changeStatus();
            return true;
        }
    }

    int getNumberOfSeats() {
        return hall.getNumberOfSeats();
    }

    public int getRows() {
        return hall.getRows();
    }

    public int getCols() {
        return hall.getCols();
    }
}
