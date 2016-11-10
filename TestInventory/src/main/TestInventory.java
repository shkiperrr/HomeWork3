package main;

import inventory.MyInventory;
import products.Product;

import java.util.Scanner;

public class TestInventory {

    public static void main(String[] args) {
        MyInventory inventory = new MyInventory();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input name : ");
            String str = scanner.nextLine();
            if(str.equals("END")) break;
            System.out.println("Input price : ");
            Integer price = scanner.nextInt();
            System.out.println("Input number : ");
            Integer number = scanner.nextInt();

            for (int i = 0; i<number; i++) {
                inventory.addProduct(new Product(str, price));
            }
            inventory.printInfo();
        }
        inventory.printInfo();

        /*inventory.addProduct(new Product("milk", 10));
        inventory.addProduct(new Product("chocolate", 30));
        inventory.addProduct(new Product("apple", 12));
        inventory.addProduct(new Product("apple", 12));
        inventory.addProduct(new Product("milk", 10));
        inventory.addProduct(new Product("milk", 10));*/


    }

}
