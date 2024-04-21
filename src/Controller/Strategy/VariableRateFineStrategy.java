package Controller.Strategy;

public class VariableRateFineStrategy implements FineCalculationStrategy {
    private double initialFineRate;

    public VariableRateFineStrategy(double initialFineRate) {
        this.initialFineRate = initialFineRate;
    }

    @Override
    public double calculateFine(int daysPastDue) {
        for (int i = 0; i < daysPastDue; i++) {
            initialFineRate += 0.3 * initialFineRate;
        }

        return initialFineRate;
    }
}
