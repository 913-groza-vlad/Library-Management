package Controller.Strategy;

public class PercentageFineStrategy implements FineCalculationStrategy {
    private double finePercentage;
    private int itemValue;

    public PercentageFineStrategy(double finePercentage, int itemValue) {
        this.finePercentage = finePercentage;
        this.itemValue = itemValue;
    }

    @Override
    public double calculateFine(int daysPastDue) {
        return finePercentage * daysPastDue;
    }
}
