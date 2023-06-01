
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class FruitManagement {

    private ArrayList<Fruit> fruitList;
    private Hashtable<String, ArrayList<Fruit>> hashTable;

    public FruitManagement() {
        fruitList = new ArrayList<>();
        hashTable = new Hashtable<>();
    }

    CheckValid data = new CheckValid();

    public void createFruit() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String nameF = data.getName("Enter Name Fruit: ");
            int idF = data.getInt("Enter Id Fruit: ");
            double priceF = data.getDouble("Enter Price Fruit:  ");
            int quantityF = data.getInt("Enter Quantity Fruit: ");
            String originF = data.getOrigin("Enter Origin Fruit: ");

            Fruit py = new Fruit(idF, nameF, priceF, quantityF, originF);
            fruitList.add(py);

            System.out.println("Do you want to continue (Y/N)? User chooses Y to continues, if you chooses N");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                continue;
            } else {
                break;
            }
        }
    }

    public void shopping() {
        ArrayList<Fruit> listBought = new ArrayList<>();
        exportFruit();
        while (true) {
            int selected = data.getInt("To order, customer selects Item : ");

            Fruit selectedFruit = null;
            for (Fruit fruit : fruitList) {
                if (fruit.getFruitid() == selected) {
                    selectedFruit = fruit;
                    System.out.println("Your Selected: " + fruit.getFruitName());
                    break;
                }
            }
            if (selectedFruit != null) {
                int quantity = data.getInt("Please input quantity: ");
                selectedFruit.setFquantity(quantity);
                listBought.add(selectedFruit);
            }
            String op = data.getOrigin("Do you want continute Buying? yes or no ");
            if (op.equalsIgnoreCase("N")) {
                break;
            }

        }
        if (!listBought.isEmpty()) {
            System.out.println("Product | Quantity | Price | Amount");
            double total = 0;
            for (Fruit fruit : listBought) {
                double amount = fruit.getFquantity() * fruit.getFprice();
                System.out.printf("|%-10s| %-12s|%-15s|%-10s \n",
                        fruit.getFruitName(),
                        fruit.getFquantity(),
                        fruit.getFprice() + "$",
                        amount + "$");
                total += amount;
            }
            System.out.println("Total: " + total);

            String nameCustomer = data.getName("Please Input Your Name: ");
            hashTable.put(nameCustomer, listBought);
            System.out.println();
            System.out.println("Input Successfull");
        }
    }

    public void exportFruit() {
        System.out.println("List of Fruit");
        System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ |  ");
        for (Fruit fruit : fruitList) {
            System.out.printf("|%-10s | %-15s | %-12s | %-12s| \n",
                    fruit.getFruitid(),
                    fruit.getFruitName(),
                    fruit.getForigin(),
                    fruit.getFprice() + "$");
        }
    }

    public void viewOrder() {
        for (String nameCustomer : hashTable.keySet()) {
            System.out.println("Customer: " + nameCustomer);
            System.out.println("Product | Quantity | Price | Amount");
            double total = 0;
            for (Fruit f : hashTable.get(nameCustomer)) {
                System.out.printf("%-10s | %-12s | %-15s | %-10s \n",
                        f.getFruitName(),
                        f.getFquantity(),
                        f.getFprice(),
                        f.getFquantity() * f.getFprice() + "$");
                        total += f.getFquantity() * f.getFprice();
            }
            System.out.println("Toal: " + total);
        }

    }
}
