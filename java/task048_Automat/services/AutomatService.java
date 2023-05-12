package task048_Automat.services;

import task048_Automat.models.Automat;
import task048_Automat.repository.AutomatRepository;
import task048_Automat.view.AutomatView;

public class AutomatService implements ServiceInterface<Automat, AutomatRepository> {
    private AutomatRepository repository;

    public AutomatService() {
        this.repository = new AutomatRepository();
    }

    public void AddInRepository(Automat productsSet) {
        if (!productsSet.getProductsList().isEmpty()) {
            repository.AddProductSet(productsSet);
        } else {
            System.out.println("Торговый аппарат пустой");
        }
    }

    public Automat GetById(int num) {
        Automat productSet = repository.GetProductSetById(num);
        if (productSet != null) {
            return productSet;
        } else {
            System.out.println("Торговый аппарат не найден");
            return null;
        }
    }

    public void GetProductSets() {
        if (repository.getList().isEmpty()) {
            AutomatView automatView = new AutomatView(true, "Репозиторий торговых автоматов пустой");
            automatView.PrintSetList(null);
        }
        AutomatView automatView = new AutomatView(false, null);
        automatView.PrintSetList(repository.getList());
    }

    public void GetProductList(Automat productSet) {
        if (productSet.getProductsList().isEmpty()) {
            AutomatView automatView = new AutomatView(true, "В торговом автомате нет товаров. Добавьте");
            automatView.PrintProductList(null);
        }

        AutomatView automatView = new AutomatView(false, null);
        automatView.PrintProductList(productSet.getProductsList());
    }
}
