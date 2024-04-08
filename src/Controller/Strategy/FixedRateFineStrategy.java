package Controller.Strategy;

public class FixedRateFineStrategy implements FineCalculationStrategy {
    private double fineRate;

    public FixedRateFineStrategy(double fineRate) {
        this.fineRate = fineRate;
    }

    @Override
    public double calculateFine(int daysPastDue) {
        return fineRate * daysPastDue;
    }
}
