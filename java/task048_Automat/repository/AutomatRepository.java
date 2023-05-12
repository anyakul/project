package task048_Automat.repository;

import task048_Automat.models.Automat;
import task048_Automat.repository.interfaces.AutomatRepositoryInterface;

public class AutomatRepository extends AbstractRepository<Automat> implements AutomatRepositoryInterface {
    public Automat GetAutomatByName(String name) {
        for (Automat set : list) {
            if (set.getName() == name) {
                return set;
            }
        }

        return null;
    }
}
