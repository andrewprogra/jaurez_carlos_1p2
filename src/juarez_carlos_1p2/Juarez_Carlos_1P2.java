
package juarez_carlos_1p2;
import java.util.Scanner;
import java.util.Random;
public class Juarez_Carlos_1P2 {

  
    public static void main(String[] args) {
        //llamamos scanner
        Scanner lea=new Scanner(System.in);
       //llamamos a random
        Random random=new Random();
        
       //creamos el arreglo ed las palabras
        String palabras[ ] = { "radar", "level", "world", "civic", "java", "deified", "python", "rotor", "language", "madam", "refer", "stats", "noon", "hello", "moon", "wow", "racecar", "kayak", "apple", "deed" };
        System.out.println("lista de palabras:");
        for(int i=0;i<palabras.length;i++){
            System.out.println("\n["+i+"]"+palabras[i]);
            
     }
        
   
         System.out.print("\ningrese el tamanio de los arreglos:");
         int tamanio=lea.nextInt();
        
      
      do {
          
            if (tamanio > palabras.length) {
                System.out.println("El tamanio es mayor que la cantidad de palabras disponibles. Intente nuevamente.");
            }
        } while (tamanio>palabras.length);
         
         String[]A=new String[tamanio];
         String[]B=new String[tamanio];
       

        System.out.println("\nLista palabras Palindromas arreglo A");
       for (int i = 0; i < A.length; i++) {
            int palabrasRandomA = random.nextInt(palabras.length);
            A[i] = palabras[palabrasRandomA];
        }
    
       
       for(int j=0;j<A.length;j++){
           
           System.out.println(palabras[j]);
       }
       
       
       System.out.println("\nLista palabras Palindromas arreglo B");
       for (int k = 0; k < B.length; k++) {
            int palabrasRandomB = random.nextInt(palabras.length);
            B[k] = palabras[palabrasRandomB];
        }
    
       
       for(int L=0;L<B.length;L++){
           
           System.out.println(palabras[L]);
       }
       
       
       }  
       
    }
    

