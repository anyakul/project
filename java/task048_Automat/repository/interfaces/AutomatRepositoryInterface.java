package task048_Automat.repository.interfaces;

import task048_Automat.models.Automat;

public interface AutomatRepositoryInterface {
    public Automat GetAutomatByName(String name);
}
