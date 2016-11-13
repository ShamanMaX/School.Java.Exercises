/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3cw8;
import java.util.Scanner;
/**
 *
 * @author Mad_Scientist_V3
 */
public class Zad3Cw8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner zxc = new Scanner (System.in);
        System.out.println("Podaj liczbę: ");
        int a = zxc.nextInt();
        System.out.println("Dzielniki to: ");
           for (int i = 1; i<=a; i++) {
            
            if (a%i == 0) {
                System.out.println(i);
            }
        }
      
    }
    
}
