package cursodejava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=1, b=-5, c=6;
        int a2=5, b2=9, c2 = 16;
        double resultado = FormulaGeneral(a,b,c);//15+3 -b+-R(b2-4ac)/2a
        double resultado2 = FormulaGeneral(c2,b2,a2);//15+3 -b+-R(b2-4ac)/2a

        Saludo(1,"Hola mundo",'A');
        
        System.out.println(resultado);
        System.out.println(resultado2);
    }
    
    public static double FormulaGeneral(int a, int b, int c){
        return (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
    }
    
    public static void Saludo(int index, String mensaje, char letra){
        //1 - hola mundo - A
        System.out.println(index+" - "+mensaje+" - "+letra);
    }
    
    
    
}
