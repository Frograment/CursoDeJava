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
public class Tiempos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una opcion");
        System.out.println("1.- Segundos");
        System.out.println("2.- Minutos");
        System.out.println("3.- Horas");
        int opcion = sc.nextInt();
        System.out.println("Ingrese la cantidad:");
        if(opcion==1){
            ConvertirTiempo(sc.nextInt(),0 , 0);
        }else
        if(opcion==2){
            ConvertirTiempo(0,sc.nextInt() , 0);
        }else
        if(opcion==3){
            ConvertirTiempo(0 , 0,sc.nextInt());
        }
    }
    
    public static void ConvertirTiempo(int seg, int min, int horas){
        int total = seg+(min*60)+(horas*3600);
        
        horas = total/3600;
        total = total%3600;
        min = total/60;
        seg = total%60;
        if(horas>0)
            System.out.print(horas+" Horas ");
        if(min>0)
            System.out.print(min+" Minutos ");
        if(seg>0)
            System.out.print(seg+" Segundos ");
        
    }
}
