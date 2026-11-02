public class Documental extends ContenidoAudiovisual {
    // Atributos específicos de Documental
    private String temaPrincipal;
    private Investigador investigador; // Relación con la clase Investigador

    // Constructor vacío
    public Documental() {
        super();
    }

    // Constructor parametrizado
    public Documental(String titulo, int duracionEnMinutos, String genero, int anioLanzamiento, String temaPrincipal, Investigador investigador) {
        super(titulo, duracionEnMinutos, genero, anioLanzamiento);
        this.temaPrincipal = temaPrincipal;
        this.investigador = investigador;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarDetalles() {
        System.out.println("--- Detalle de Documental ---");
        System.out.println(toString());
        System.out.println("Tema Principal: " + temaPrincipal);
        if (investigador != null) {
            System.out.println("Investigador Principal: " + investigador.getNombre());
        } else {
            System.out.println("Investigador Principal: No asignado");
        }
    }

    // Getters y Setters
    public String getTemaPrincipal() {
        return temaPrincipal;
    }

    public void setTemaPrincipal(String temaPrincipal) {
        this.temaPrincipal = temaPrincipal;
    }

    public Investigador getInvestigador() {
        return investigador;
    }

    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tema Principal: " + temaPrincipal;
    }
}