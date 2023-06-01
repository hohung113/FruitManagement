
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Menu {
   
    
    public int getChoice(Object[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i+1) + "-" + options[i]);
            
        }
        System.out.println("Choose 1...." + options.length);
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
        
    }
}
