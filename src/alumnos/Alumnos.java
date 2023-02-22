package alumnos;
import Alumno.Alumno;
import java.util.Scanner;

public class Alumnos {
    
    public static void Media(Alumno[] alum) {
        /* He modificado el mensaje mostrado de "Alumno " 
            He quitado esto del código prinicipal y lo he convertido en una función.
         */
        Scanner entrada = new Scanner(System.in);
        String nombreIntroducido;
        double notaIntroducida;
        
        for (int i = 0; i < 5; i++) {
            alum[i] = new Alumno();
            System.out.println("Alumno " + i + "\nNombre:");
            nombreIntroducido = entrada.nextLine();
            (alum[i]).setNombre(nombreIntroducido);
            System.out.print("Nota media: ");
            notaIntroducida = Double.parseDouble(entrada.nextLine());
            alum[i].setNota(notaIntroducida);
        } // for i
    }

  public static void main(String[] args) {
    
    // Define la estructura, un array de 5 alumnos
    // pero no crea los objetos
    Alumno[] alum = new Alumno[5];
    

    // Pide los datos de los alumnos /////////////////////////////////
        
    System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");
    Media(alum);
    // Muestra los datos de los alumnos /////////////////////////////////
    
    System.out.println("Los datos introducidos son los siguientes:");

    double  sumaDeMedias = 0;
    
    /* He modificado el texto que representa el resultado de la nota media
    */
    for(int i = 0; i < 5; i++) {
      System.out.println("Alumno " + i + "\nNombre: " + alum[i].getNombre() + "\nNota media: " + alum[i].getNota() + "\n----------------------------");  
      sumaDeMedias += alum[i].getNota();
    } // for i
    
    System.out.println("La media global de la clase es " + sumaDeMedias / 5);
  }
}
