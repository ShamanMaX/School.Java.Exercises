/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3cw6;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Mad_Scientist_V3
 */
public class Zad3Cw6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rnd = new Random();
        Scanner zxc = new Scanner(System.in);
        int los = rnd.nextInt(99) +1;
        int a = 0;
        do {
            System.out.println("Podaj liczbę od 0 do 100");
            a = zxc.nextInt();
        } while ( a>100 || a<0);
        
        while (a != los) {
            if (a>los) {
                System.out.println("Liczba za duża.  Podaj kolejną:");
                a = zxc.nextInt();
                
            }
            else {
                System.out.println("Liczba za mała.  Podaj kolejną:");
                a = zxc.nextInt();
            }
        } System.out.println("Trafione");
        
    }
    
}
