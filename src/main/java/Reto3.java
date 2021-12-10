import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 
   Kelly Julieth Arango Henao
   Juan Camilo Rivera Avendaño
 */
public class Reto3 {

      public static void Punto1() {
        String set = "";
        double sum = 0;
        double promedio = 0;
        double elementos = 0;
        double sumDesviacion = 0;
        double desviacion = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las notas (entre 0 y 5) separadas por comas: ");
        set = leer.nextLine();
        String[] numbers = set.split(",");
        double[] values = new double[numbers.length];
        for(int i=0;i<values.length;i++){
            values[i] = Double.parseDouble(numbers[i]);
        }
        for(int i=0;i<values.length;i++){
            sum += values[i];
        }
        elementos = values.length;
        promedio = sum / elementos;
        double mayor = values[0];
        for(int i=1;i<values.length;i++){
            if(values[i] > mayor){
                mayor = values[i];
            }
        }
        double menor = values[0];
        for(int i=1;i<values.length;i++){
            if(values[i] < menor){
                menor = values[i];
            }
        }
        for(int i=1;i<values.length;i++){
            sumDesviacion = sumDesviacion + Math.pow(values[i] - promedio,2);
        }
        desviacion = Math.sqrt(sumDesviacion / elementos);
        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);
        System.out.println("Promedio de las notas: " + promedio);
        System.out.println("Desviación estándar del conjunto: " + desviacion);
    }
    public static void Punto2(){
        int n;
        int m;
        boolean sw = true;
        double product = 0;
        double[] vectorA;
        double[] vectorB;
        Scanner leer = new Scanner(System.in);
        while(sw){
            System.out.println("Ingrese el número de elementos del Vector A: ");
            n = leer.nextInt();
            vectorA = new double[n];
            System.out.println("Ingrese el número de elementos del Vector B: ");
            m = leer.nextInt();
            vectorB = new double[m];
            if(n!=m){
                System.out.println("Los vectores no tienen la misma dimension");
            }
            else{
                for(int i=0;i<vectorA.length;i++){
                    System.out.println("Ingrese el elemento [" + i +"] del Vector A: ");
                    vectorA[i] = leer.nextDouble();
                }
                for(int i=0;i<vectorB.length;i++){
                    System.out.println("Ingrese el elemento [" + i +"] del Vector B: ");
                    vectorB[i] = leer.nextDouble();
                }
                for(int i=0;i<vectorA.length;i++){
                    product = product + (vectorA[i] * vectorB[i]);
                }
                System.out.println("VectorA * VectorB = " + product);
                sw = false;
            }
        }    
            
    }    
    
      public static void Punto3(){
        int n;
        int m;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número para las filas de la matriz: ");
        n = leer.nextInt();
        System.out.println("Ingrese otro número para las columnas de la matriz: ");
        m = leer.nextInt();
        double matrix[][] = new double[n][m];
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.println("Ingrese el elemento [" + i + "," + j + "]: ");
                matrix[i][j] = leer.nextInt();
            }
        }
        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                System.out.println("[" + i + "," + j + "]:  " + matrix[i][j]);
            }
        }
    }

    public static void main(String[] args) {
       int option;
       Scanner leer = new Scanner(System.in);
       boolean sw = true;
       while(sw){
           System.out.println("         Ingrese el número correspondiente al punto a desarrollar:         ");
           System.out.println("1. Punto 1.");
           System.out.println("2. Punto 2.");
           System.out.println("3. Punto 3.");
           System.out.println("4. Salir");
           try{
                option = leer.nextInt();
                switch(option){
                   case 1: 
                       Punto1();
                       break;
                   case 2: 
                       Punto2();
                       break;
                   case 3: 
                       Punto3();
                       break;
                   case 4: 
                       sw = false;
                   break;
                   default:
                       System.out.println("Ingrese una opcón válida (Número entre 1 y 4)");
                  
                }
           }catch(InputMismatchException e){
               System.out.println("Debe ingresar un número entero");
               leer.next();
           }     
       }
        
    }  
}
