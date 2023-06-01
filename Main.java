
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Menu a = new  Menu();
        Scanner sc = new Scanner(System.in);
        String[] options = {"Create Fruit", "View Order", "Shopping(for Buyer)","Exit"};
        int choice;
        FruitManagement boss = new  FruitManagement();
        do {            
            System.out.println("------MENU-----");
            choice = a.getChoice(options);
            switch (choice) {
                case 1:
                    boss.createFruit();
                    break;
                case 2:
                    boss.viewOrder();
                    break;
                case 3:
                    boss.shopping();
                    break;
                case 4:
                    System.out.println();
                default:
                    throw new AssertionError();
            }
        } while (true);
    }
}
