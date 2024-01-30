/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursodejava;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoja una opcion");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicacion");
        System.out.println("4.- Division");
        
        int opcion = sc.nextInt();
        if(opcion==1){
            System.out.println("Suma");
        }else if(opcion==2){
            System.out.println("Resta");
        }else if(opcion==3){
            System.out.println("Multiplicacion");
        }else if(opcion==4){
            System.out.println("Division");
        }
        
    }
    
}
