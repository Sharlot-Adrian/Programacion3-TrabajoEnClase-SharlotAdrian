import java.util.ArrayList;
import java.util.Scanner;
public class HolaMundo {

    public static void main (String [] args){
        
        System.out.println("Hola mundo");
 
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <Visitante> lista = new ArrayList<>();
        
        for (int i = 0; i < 5; i++){
            
            System.out.printf("Ingrese el nombre del visitante %d : ", i + 1);
            String nombre = scanner.nextLine();

            System.out.printf("Ingrese el cedula del visitante %d: ", i + 1);
            String cedula = scanner.nextLine();

            System.out.printf("Ingrese el edad del visitante %d: ", i + 1);
            int edad =  scanner.nextInt();

            lista.add(new Visitante(edad, nombre, cedula));
            scanner.nextLine();

        }

        for (int i = 0; i < 5; i++){
            System.out.println("\n------------------------");
            System.out.printf("\nINFO DE VISITANTE %d", i + 1);
            System.out.println("\n------------------------");
            System.out.printf("Nombre: %s\n", lista.get(i).getNombre());
            System.out.printf("Cedula: %s\n", lista.get(i).getCedula());
            System.out.printf("Edad: %s\n", lista.get(i).getEdad());

        }

        scanner.close();
    }
}
