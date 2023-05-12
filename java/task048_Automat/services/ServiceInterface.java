package task048_Automat.services;

import task048_Automat.models.AbstractProductSet;
import task048_Automat.repository.AbstractRepository;

public interface ServiceInterface<T extends AbstractProductSet, S extends AbstractRepository<T>> {

    public abstract void GetProductSets();

    public abstract void GetProductList(T productSet);

    public abstract void AddInRepository(T productsSet);

    public abstract T GetById(int num);
}
