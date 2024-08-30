package cinema.service;

public class PriceService {

    private final HallService hallService;

    public PriceService(HallService hallService) {
        this.hallService = hallService;
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

    public int getTotalIncome() {
        int totalProfit = 0;

        for (int i = 1; i <= hallService.getRows(); i++) {
            int rowCost = calculateCostOfTicket(i);
            totalProfit += rowCost * hallService.getCols();
        }

        return totalProfit;
    }

    public int getCurrentIncome() {
        int currentProfit = 0;

        for (int i = 1; i <= hallService.getRows(); i++) {
            int rowCost = calculateCostOfTicket(i);
            for (int j = 1; j <= hallService.getCols(); j++) {
                if (!hallService.isSeatAvailable(i, j))
                    currentProfit += rowCost;
            }
        }

        return currentProfit;
    }
}
