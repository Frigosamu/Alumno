package Alumno;

/**
 * Alumno.java
 * Definición de la clase Alumno
 * @author Luis José Sánchez
 */

/*He modificado "Nota media" y lo he convertido en "Nota" a la vez que he quitado la inicialización
He añadido sets and gets
*/

public class Alumno {
  private String nombre;
  private double Nota;
  

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the Nota
     */
    public double getNota() {
        return Nota;
    }

    /**
     * @param Nota the Nota to set
     */
    public void setNota(double Nota) {
        this.Nota = Nota;
    }
  
}
