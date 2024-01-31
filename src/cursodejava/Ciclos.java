/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursodejava;

/**
 *
 * @author USER
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ciclos
        //For, While, Do While
        
        //Ciclo for es cuando sabemos el numero de iteraciones
        
        //Ciclo While es cuando no sabemos el numero de iteraciones
        
//        for(int i = 1; i<10; i=i+2){
//            System.out.println("Iteracion "+i);
//        }
//        String tipo;
//        int edad = 18;
//        if(edad<18){
//            tipo = "Menor de edad";
//        }else{
//            tipo = "Mayor de edad";
//        }
//        
//        System.out.println(tipo);


        int factorial = 5;
        int resultado;
        resultado = 1;
        for (int i = 1; i <= factorial; i++) {
            resultado = resultado*i;
             System.out.println(resultado);
        }
        
       
        
//        int i = 0;
//        while(i < 100){
//            System.out.println(i);
//            i += 5;
//        }
//        //5*4*3*2*1
    }
    
}
