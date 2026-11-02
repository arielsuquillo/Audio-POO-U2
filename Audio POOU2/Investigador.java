public class Investigador {
    private String nombre;
    private String especialidad;
    private int anosExperiencia;

    public Investigador() {
    }

    public Investigador(String nombre, String especialidad, int anosExperiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.anosExperiencia = anosExperiencia;
    }

    public void mostrarDetalles() {
        System.out.println("--- Detalle del Investigador ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Años de Experiencia: " + anosExperiencia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Investigador: " + nombre + " (" + especialidad + ")";
    }
}