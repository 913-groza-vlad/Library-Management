package Controller.Strategy;

public class PercentageFineStrategy implements FineCalculationStrategy {
    private double finePercentage;
    private double fine;

    public PercentageFineStrategy(double finePercentage, double fine) {
        this.finePercentage = finePercentage;
        this.fine = fine;
    }

    @Override
    public double calculateFine(int daysPastDue) {
        for (int i = 0; i < daysPastDue; i++) {
            fine += fine * finePercentage / 100;
        }

        return fine;
    }
}
