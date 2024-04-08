package Model.Factory;

import Model.Item.ILibraryItem;
import Model.Item.Magazine;

public class MagazineFactory extends Factory {
    @Override
    public ILibraryItem createLibraryItem(Object ...args) {
        return new Magazine((String) args[0], (String) args[1], (Integer) args[2], (Integer) args[3], (Integer) args[4], (Integer) args[5]);
    }
}
