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
public class Selectivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Selectivas = Decisiones
        
        //if = Si
        //else = Si no
        //else if = si no, si
        
        int premio = 3;
        int opcion = 4;
        
//        i

        
        //Operadores Logicos
        // < menor que
        // > Mayor que
        // == Igual que
        // != diferente de
        // <= menor o igual que
        // >= mayor o igual que
        // ! negacion
        
        // || Or o significa uno u otro
        //El or se usa cuando queremos que se aplique la condicion 
        //Siempre y cuando uno de los valores a evaluar sea verdadero
        
        // && And Y significa uno y otro
        //El and se usa cuando queremos que se aplique la condicion 
        //Siempre y cuando ambos valores a evaluar sean verdaderos
        
        //Ejemplo
        
        String color1 = "rojo";
        String color2 = "azul";
        
        if(color1 == "azul" || color2 == "azul"){
            System.out.println("Verdadero");
        }else {
            System.out.println("Falso");
        }
        
        if(color1 == "rojo" && color2 == "azul"){
            System.out.println("Verdadero");
        }else {
            System.out.println("Falso");
        }
          
        
        
        
        //Crea una selectiva que imprima
        // si la persona es mayor de edad
        // o menor de edad
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Ingrese la edad");
//        int edad = sc.nextInt();
//        
//        if(edad < 18){
//            System.out.println("Es menor de edad");
//        }else{
//            System.out.println("Es Mayor de edad");
//        }
//        
        
    }
    
}
