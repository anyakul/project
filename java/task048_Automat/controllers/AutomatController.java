package task048_Automat.controllers;

import java.util.Scanner;

import task048_Automat.models.Automat;
import task048_Automat.services.AutomatService;

public class AutomatController {
    private AutomatService automatService;
    private Automat automat;

    public AutomatController(AutomatService automatService) {
        this.automatService = automatService;
    }

    public Automat GetUserChoice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите один из следующих торговых аппаратов: \n");
        automatService.GetProductSets();
        int automatNum = 1;
        automat = automatService.GetById(automatNum);

        while (automat == null) {
            System.out.println("Выберите другой торговый автомат");
            automatNum = scan.nextInt();
            automat = automatService.GetById(automatNum);
        }
        automatService.GetProductList(automat);

        scan.close();

        return automat;
    }
}
