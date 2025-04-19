package utilities;

import controllers.AritmeticImpl;
import controllers.Description;
import repositories.RepositoryProductsImpl;

public class RunMenu {
    public  static void startMenu(){
//        Description.assignDescriptionClient();
    }

    private static void bucleAdd(){
        boolean turn = true;
        while (turn){
            Description.assignDescriptionProduct();

            RepositoryProductsImpl.getProducts();
            AritmeticImpl.getTotalResumen();
            if (!Description.responseLoop()){
                turn = false;
            }
        }
    }
    private static void bucleRemove(){
        boolean turn = true;
        while (turn){
            System.out.println("Ingrese ID para eliminar");
            Description.assignRemoveProduct();
            RepositoryProductsImpl.getProducts();
            AritmeticImpl.getTotalResumen();
            if (!Description.responseLoop()){
                turn = false;
            }
        }
    }
    private static void bucleUpdate(){}
    private static void bucleFind(){}
}
