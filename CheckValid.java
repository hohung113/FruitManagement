
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author candy bar
 */
public class CheckValid {
//    Scanner sc = new Scanner(System.in);
    private Scanner sc;

    public CheckValid() {
    sc = new Scanner(System.in);
    }
    
    public int getInt(String mess) {
        while (true) {            
            try {
                System.out.println(mess);
                int intput = sc.nextInt();
                if(intput >= 0 && String.valueOf(intput).length() <=6) {
                    return intput;
                }
                else {
                    System.out.println("Vui Long Nhap Lai ! ");
                }
            } catch (Exception e) {
                System.out.println("Vui Long Nhap Dung Du Lieu . Hay Nhap Lai !");
                sc.nextLine();
            }
        }
    }
    public String getName(String mess) {
            while (true) {        
                System.out.println(mess);
                String input = sc.nextLine();
                try {
                    if(input.matches("[a-zA-Z]+") && input != null) {
                        return input;
                    }
                } catch (Exception e) {
                    System.out.println("Vui Long Nhap Dung Du Lieu . Hay Nhap Lai !");
                    sc.nextLine();
                }
        }
            
    }
    public double getDouble(String mess) {
        while (true) {       
            try {
                System.out.println(mess);
            double doubput = sc.nextDouble();
            if(doubput >= 0  && String.valueOf(doubput).length() <= 6) {
                return doubput;
            } else {
                System.out.println("Vui Long Nhap Lai ");
            }
            } catch (Exception e) {
                System.out.println("Vui Long Nhap Dung Du Lieu . Hay Nhap Lai !");
                    sc.nextLine();
            }
            
            
        }
    }
      public String getOrigin(String mess) {
                 
                System.out.println(mess);
                sc.nextLine();
                String input = sc.nextLine();
                   while(input.isEmpty()){
                       System.out.println("Vui Long Nhap Lai");
                       input = sc.nextLine();
                   }
                   return input;
    
}

}