package Repository;

import java.util.List;

public interface IRepository<T> {
    void addElem(T item);
    void removeElem(T item);
    T getElem(int id);
    List<T> getElems();
}
