package cinema.service;

public class PriceService {

    private final HallService hallService;

    public PriceService(HallService hallService) {
        this.hallService = hallService;
    }

    public void printProfit() {
        System.out.println("Total income:");
        System.out.println("$" + calculateTotalProfit());
    }

    public void printPriceOfTicket(int row) {
        System.out.println("\nTicket price: $" + calculateCostOfTicket(row) + "\n");
    }

    private int calculateCostOfTicket(int row) {
        int totalNumberOfSeats = hallService.getNumberOfSeats();
        int numberOfRows = hallService.getRows();

        if (totalNumberOfSeats <= 60) {
            return 10;
        } else {
            int frontHalfRows = numberOfRows / 2;
            if (row <= frontHalfRows) {
                return 10;
            } else {
                return 8;
            }
        }
    }

    private int calculateTotalProfit() {
        int totalProfit = 0;

        for (int i = 1; i <= hallService.getRows(); i++) {
            for (int j = 1; j <= hallService.getCols(); j++) {
                totalProfit += calculateCostOfTicket(i);
            }
        }

        return totalProfit;
    }
}
