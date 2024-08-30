package cinema.model;

public class Seat {

    private char status;

    public Seat() {
        status = 'S';
    }

    public char getStatus() {
        return status;
    }

    public void changeStatus() {
        if (this.status == 'S') {
            this.status = 'B';
        } else {
            this.status = 'S';
        }
    }

    public boolean isBooked() {
        return status == 'S';
    }
}
