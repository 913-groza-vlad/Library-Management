package Repository;

import Model.Customer.CustomerFineManager;
import Model.ItemBorrow;

import java.util.ArrayList;
import java.util.List;

public class FineManagerRepository implements IRepository<CustomerFineManager> {
    private List<CustomerFineManager> fineManagers;

    public FineManagerRepository() {
        this.fineManagers = new ArrayList<>();
    }

    @Override
    public void addElem(CustomerFineManager item) {
        fineManagers.add(item);
    }

    @Override
    public void removeElem(CustomerFineManager item) {
        fineManagers.remove(item);
    }

    @Override
    public CustomerFineManager getElem(int id) {
        for (CustomerFineManager fineManager : fineManagers) {
            if (fineManager.getCustomer().getId() == id) {
                return fineManager;
            }
        }

        return null;
    }



    @Override
    public List<CustomerFineManager> getElems() {
        return fineManagers;
    }
}
