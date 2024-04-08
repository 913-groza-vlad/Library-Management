package Repository;

import Model.Item.ILibraryItem;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository implements IRepository<ILibraryItem> {
    private List<ILibraryItem> items;

    public ItemRepository() {
        items = new ArrayList<>();
    }

    public void addElem(ILibraryItem item) {
        items.add(item);
    }

    public void removeElem(ILibraryItem item) {
        items.remove(item);
    }

    @Override
    public ILibraryItem getElem(int id) {
        return items.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
    }

    public List<ILibraryItem> getElems() {
        return items;
    }
}
