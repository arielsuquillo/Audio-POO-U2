public class Actor {
    // Atributos de la clase Actor
    private String nombre;
    private int edad;
    private String nacionalidad;
    private String personaje;

    // Constructor vacío
    public Actor() {
    }

    // Constructor parametrizado
    public Actor(String nombre, int edad, String nacionalidad, String personaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.personaje = personaje;
    }

    // Método para mostrar los detalles del actor
    public void mostrarDetalles() {
        System.out.println("--- Detalle del Actor ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Personaje: " + personaje);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        return "Actor: " + nombre + " (Personaje: " + personaje + ")";
    }
}