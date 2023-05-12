package task048_Automat;

import task048_Automat.controllers.AutomatController;
import task048_Automat.controllers.BestProductController;
import task048_Automat.controllers.OrderController;
import task048_Automat.models.Automat;
import task048_Automat.models.automats.DrinkSnackAutomat;
import task048_Automat.models.automats.GameAutomat;
import task048_Automat.models.automats.HotDrinkAutomat;
import task048_Automat.models.products.Drink;
import task048_Automat.models.products.Game;
import task048_Automat.models.products.HotDrink;
import task048_Automat.models.products.Snack;
import task048_Automat.services.AutomatService;

public class Main {
    public static void main(String[] args) {
        DrinkSnackAutomat drinkSnackAutomat = new DrinkSnackAutomat("Торговый автомат напитков и закусок", 10);
        HotDrinkAutomat hotDrinkAutomat = new HotDrinkAutomat("Торговый автомат горячих напитков", 10);
        GameAutomat gameAutomat = new GameAutomat("Торговый автомат игрушек", 10);

        Drink stillWater = new Drink("Вода негазированная", 40, 0.5);
        Drink sparklingWater = new Drink("Вода газированная", 50, 0.5);
        Snack chips = new Snack("Чипсы", 100, 0.2);
        Snack mars = new Snack("Mars", 110, 0.2);

        HotDrink cappuccino = new HotDrink("Кофе каппучино", 110, 0.5, 50);
        HotDrink espresso = new HotDrink("Кофе эспрессо", 125, 0.5, 55);
        HotDrink blackTea = new HotDrink("Чай черный", 95, 0.5, 90);
        HotDrink greenTea = new HotDrink("Чай зелёный", 105, 0.5, 80);

        Game smallTeddyBear = new Game("Маленький плюшевый мишка", 500);
        Game bigTeddyBear = new Game("Большой плюшевый мишка", 1000);
        Game girl = new Game("Кукла девочка", 1100);
        Game boy = new Game("Кукла мальчик", 1200);

        drinkSnackAutomat.AddProduct(stillWater, 3);
        drinkSnackAutomat.AddProduct(sparklingWater, 3);
        drinkSnackAutomat.AddProduct(chips, 3);
        drinkSnackAutomat.AddProduct(mars, 3);

        gameAutomat.AddProduct(smallTeddyBear, 3);
        gameAutomat.AddProduct(bigTeddyBear, 3);
        gameAutomat.AddProduct(boy, 3);
        gameAutomat.AddProduct(girl, 3);

        hotDrinkAutomat.AddProduct(cappuccino, 1);
        hotDrinkAutomat.AddProduct(espresso, 1);
        hotDrinkAutomat.AddProduct(blackTea, 1);
        hotDrinkAutomat.AddProduct(greenTea, 1);

        AutomatService automatService = new AutomatService();
        automatService.AddInRepository(drinkSnackAutomat);
        automatService.AddInRepository(hotDrinkAutomat);
        automatService.AddInRepository(gameAutomat);

        AutomatController automatController = new AutomatController(automatService);
        Automat automat = automatController.GetUserChoice();

        BestProductController bestProductController = new BestProductController(automat);
        bestProductController.CompareTwoProducts(smallTeddyBear, bigTeddyBear);
        bestProductController.GetBestProductInAutomat();

        OrderController orderController = new OrderController(automat);
        orderController.DoOrder();
    }
}
