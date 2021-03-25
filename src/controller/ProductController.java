
package controller;

import entities.ProductEntity;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ProductController {

    //Definindo Array
    public static ArrayList<ProductEntity> listOfProducts = null;


    public static void saveProduct() {

        String name;
        Double price = null;
        String description;
        int quantity = 0;
        String category;

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        name = sc.nextLine();

        // Captura Exceção caso usuario insira texto invés de número
        try {
            System.out.print("Price: ");
            price = sc.nextDouble();
        } catch (InputMismatchException i) {
            System.out.println("Only number are valids!");
            saveProduct();
        }

        System.out.print("Description: ");
        sc.nextLine();
        description = sc.nextLine();

        // Captura Exceção caso usuario insira texto invés de número
        try {
            System.out.print("Quantity in stock: ");
            quantity = sc.nextInt();
        } catch (InputMismatchException i) {
            System.out.println("Only number are valids!");
            saveProduct();
        }

        System.out.print("Category: ");
        category = sc.next();

        //Cria um produto
        ProductEntity product = new ProductEntity(name, price, description, quantity, category);
        //Adiciona produto na lista
        listOfProducts.add(product);

        System.out.println("");
        System.out.println("Product " + name + " registered successfully!");

    }


    //Percorrendo lista de produtos e imprimindo o nome
    public static void listProducts() {

        for (int i = 0; i < listOfProducts.size(); i++) {
            System.out.println(listOfProducts.get(i).name);
        }
    }

    //Percorrendo lista de produtos e verificando se possui um produto com o nome passado pelo o usuario
    public static void searchProduct(String nameOfProduct) {

        for (int i = 0; i < listOfProducts.size(); i++) {
            if (listOfProducts.get(i).getName().equals(nameOfProduct)) {
                System.out.println("");
                System.out.println("Price: " + listOfProducts.get(i).getPrice());
                System.out.println("Description: " + listOfProducts.get(i).getDescription());

            }

        }
    }
}