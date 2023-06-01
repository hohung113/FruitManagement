/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Fruit {
    private int fruitid;
    private String fruitName;
    private double fprice;
    private int fquantity;
    private String forigin;

    public Fruit() {
    }

    public Fruit(int fruitid, String fruitName, double fprice, int fquantity, String forigin) {
        this.fruitid = fruitid;
        this.fruitName = fruitName;
        this.fprice = fprice;
        this.fquantity = fquantity;
        this.forigin = forigin;
    }

    public int getFruitid() {
        return fruitid;
    }

    public void setFruitid(int fruitid) {
        this.fruitid = fruitid;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getFprice() {
        return fprice;
    }

    public void setFprice(double fprice) {
        this.fprice = fprice;
    }

    public int getFquantity() {
        return fquantity;
    }

    public void setFquantity(int fquantity) {
        this.fquantity = fquantity;
    }

    public String getForigin() {
        return forigin;
    }

    public void setForigin(String forigin) {
        this.forigin = forigin;
    }

    @Override
    public String toString() {
        return "Fruit{" + "fruitid=" + fruitid + ", fruitName=" + fruitName + ", fprice=" + fprice + ", fquantity=" + fquantity + ", forigin=" + forigin + '}';
    }
    
}
