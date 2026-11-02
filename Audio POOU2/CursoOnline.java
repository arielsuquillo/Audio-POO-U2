public class CursoOnline extends ContenidoAudiovisual {
    // Atributos específicos de CursoOnline
    private String plataforma;
    private String instructor;

    // Constructor vacío
    public CursoOnline() {
        super();
    }

    // Constructor parametrizado
    public CursoOnline(String titulo, int duracionEnMinutos, String genero, int anioLanzamiento, String plataforma, String instructor) {
        super(titulo, duracionEnMinutos, genero, anioLanzamiento);
        this.plataforma = plataforma;
        this.instructor = instructor;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarDetalles() {
        System.out.println("--- Detalle de Curso Online ---");
        System.out.println(toString());
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Instructor: " + instructor);
    }

    // Getters y Setters
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Plataforma: " + plataforma;
    }
}