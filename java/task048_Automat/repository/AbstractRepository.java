package task048_Automat.repository;

import java.util.ArrayList;

import task048_Automat.models.AbstractProductSet;

public abstract class AbstractRepository<T extends AbstractProductSet> {
    protected ArrayList<T> list = new ArrayList<>();

    public T GetProductSetById(int id) {
        for (T set : list) {
            if (set.getId() == id) {
                return set;
            }
        }

        return null;
    }

    public boolean AddProductSet(T productSet) {
        if (list.contains(productSet)) {
            return false;
        }
        list.add(productSet);

        return true;
    }

    public ArrayList<T> getList() {
        return list;
    }
}
