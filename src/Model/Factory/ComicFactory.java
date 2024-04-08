package Model.Factory;

import Model.Item.Comic;
import Model.Item.ILibraryItem;

public class ComicFactory extends Factory {
    @Override
    public ILibraryItem createLibraryItem(Object... args) {
        return new Comic((String) args[0], (String) args[1], (Integer) args[2], (String) args[3], (Integer) args[4], (Integer) args[5], (Integer) args[6]);
    }
}
