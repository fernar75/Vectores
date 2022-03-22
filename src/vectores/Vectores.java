
package vectores;

import java.util.Scanner;


public class Vectores {

  
    public static void main(String[] args) {
        int vector [] = new int [4];
        
        //Asignación (manual)
        //vector[0] = 2;
        //vector[1] = 10;
        //vector[2] = 15;
        //vector[3] = 5;
        
            //Asignación (por teclado)
            Scanner teclado = new Scanner(System.in);
            
            for(int i=0; i<vector.length; i++) {
            System.out.println("Ingrese el valor para el índice: " + i);
            vector[i] = teclado.nextInt();
           
            }
        //Recorrido
        //***********i es índice*******
            for(int i=0; i<vector.length; i++) {
            System.out.println("Estoy en el índice: " + i);
            System.out.println("Tengo guardado un vector " + vector[i]);
            System.out.println("------------------------");
            
         }
    
    }
    
       
    }
