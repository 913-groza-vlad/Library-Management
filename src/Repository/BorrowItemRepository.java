package Repository;

import Model.Customer.Customer;
import Model.Item.ILibraryItem;
import Model.ItemBorrow;

import java.util.ArrayList;
import java.util.List;

public class BorrowItemRepository implements IRepository<ItemBorrow> {

    private List<ItemBorrow> borrowedItems;

    public BorrowItemRepository() {
        this.borrowedItems = new ArrayList<>();
    }

    @Override
    public void addElem(ItemBorrow item) {
        borrowedItems.add(item);
    }

    @Override
    public void removeElem(ItemBorrow item) {
        borrowedItems.remove(item);
    }

    @Override
    public ItemBorrow getElem(int id) {
        return null;
    }

    public ItemBorrow getBorrowedItem(Customer customer, ILibraryItem item) {
        for (ItemBorrow borrowedItem : borrowedItems) {
            if (borrowedItem.getCustomer().equals(customer) && borrowedItem.getItem().equals(item)) {
                return borrowedItem;
            }
        }
        return null;
    }

    @Override
    public List<ItemBorrow> getElems() {
        return borrowedItems;
    }
}
