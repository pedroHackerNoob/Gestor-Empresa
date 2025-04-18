package utilities;

import controllers.AritmeticImpl;
import controllers.Description;
import repositories.RepositoryProductsImpl;

public class RunMenu {
    public  static void startMenu(){
        Description.assignDescriptionClient();
        bucleAdd();
        Menu.getResumen();
    }

    private static void bucleAdd(){
        boolean turn = true;
        while (turn){
            Description.assignDescriptionProduct();
            RepositoryProductsImpl.getProducts();
            AritmeticImpl.totalResumen();
            if (!Description.responseLoop()){
                turn = false;
            }
        }
    }
}
