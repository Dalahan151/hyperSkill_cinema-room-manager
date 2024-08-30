package cinema.model;

public class Hall {
    private final Seat[][] seats;
    private final int rows;
    private final int cols;

    public Hall(int numRows, int numCols) {
        this.rows = numRows;
        this.cols = numCols;
        seats = new Seat[rows][cols];
        initSeats();
    }

    public int getNumberOfSeats() {
        return seats.length * seats[0].length;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Seat getSeat(int row, int col) {
        return seats[row - 1][col - 1];
    }

    private void initSeats() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = new Seat();
            }
        }
    }
}
