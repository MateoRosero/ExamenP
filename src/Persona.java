import java.util.List;
public class Persona {
    private int id;
    private static String NombreCompleto;
    private int edad;
    private int prioridad;
    private List<Persona> amigos;
    private Object getActivityLevel;

    public Persona(int id, String nombreCompleto, int edad, int prioridad, List<Persona> amigos) {
        this.id = id;
        this.NombreCompleto = nombreCompleto;
        this.edad = edad;
        this.prioridad = prioridad;
        this.amigos = amigos;
    }

    public Persona() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.NombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public List<Persona> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Persona> amigos) {
        this.amigos = amigos;
    }

    public void setActive(boolean b) {
    }

    public int getActivityLevel() {

        return 0;
    }

}

