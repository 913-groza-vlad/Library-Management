package Model.Customer;

import Controller.Strategy.FineCalculationStrategy;

public class CustomerFineManager {
    private Customer customer;
    private FineCalculationStrategy fineCalculationStrategy;

    public CustomerFineManager(Customer customer) {
        this.customer = customer;
    }

    public void setFineCalculationStrategy(FineCalculationStrategy fineCalculationStrategy) {
        this.fineCalculationStrategy = fineCalculationStrategy;
    }

    public double calculateFine(int daysPastDue) {
        if (fineCalculationStrategy == null) {
            throw new IllegalStateException("Fine calculation strategy not set");
        }
        return fineCalculationStrategy.calculateFine(daysPastDue);
    }

}
