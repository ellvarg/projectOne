package application;

import controller.ProductController;
import java.util.Scanner;
import entities.ProductEntity;
import java.io.IOException;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) throws IOException {

        //Instanciando ArrayList
        ProductController.listOfProducts = new ArrayList<ProductEntity>();

        //Leitor
        Scanner sc = new Scanner(System.in);


        //MENU
        int opcao = 0;
        while(opcao!=4){
            menu();
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Enter product data: ");
                    ProductController.saveProduct();
                    break;

                case 2:
                    System.out.println("List of products: ");
                    ProductController.listProducts();
                    break;

                case 3:
                    System.out.println("Enter the product name:  ");
                    String nameOfProduct = sc.next();
                    ProductController.searchProduct(nameOfProduct);
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Choose a valid option");
            }
        }
        System.out.println("You're leaving, bye!");

        sc.close();
    }

    public static void menu(){

        System.out.println("");
        System.out.println("1 - for save a new product");
        System.out.println("2 - for list all products");
        System.out.println("3 - search a specific product");
        System.out.println("4 - for exit");
    }

}