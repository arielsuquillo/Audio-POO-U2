public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE CONTENIDO AUDIOVISUAL ===\n");

        // 1. Crear objetos para las relaciones
        Investigador investigador1 = new Investigador("Dra. Elena Vargas", "Biología Marina", 15);
        Temporada temporada1 = new Temporada(1, 8, "2023-01-15");

        // 2. Crear objetos de las clases (pasando los valores directamente en orden)
        Pelicula pelicula = new Pelicula("Matrix", 136, "Ciencia Ficción", 1999, "Warner Bros", true);
        
        SerieDeTV serie = new SerieDeTV("The Last of Us", 60, "Drama/Post-apocalíptico", 2023, 1, 9);
        
        Documental documental = new Documental("Mundos Submarinos", 90, "Documental", 2021, "Ecosistemas de la Fosa de las Marianas", investigador1);

        VideoYouTube videoYT = new VideoYouTube("Tutorial de Java POO", 25, "Educativo", 2024, "CodeAcademy", 154000L);

        CursoOnline curso = new CursoOnline("Programación Orientada a Objetos", 40, "Tecnología", 2026, "Udemy", "Ing. Juan Pérez");

        TransmisionEnVivo stream = new TransmisionEnVivo("Clase en VIVO - POO", 120, "Educación", 2026, "YouTube Live", 450);

        // 3. Mostrar los detalles de cada contenido utilizando polimorfismo
        System.out.println("--- PRUEBA DE CLASES Y DETALLES ---\n");
        
        pelicula.mostrarDetalles();
        System.out.println();

        serie.mostrarDetalles();
        System.out.println("Temporada asociada: " + temporada1);
        System.out.println();

        documental.mostrarDetalles();
        System.out.println();

        videoYT.mostrarDetalles();
        System.out.println();

        curso.mostrarDetalles();
        System.out.println();

        stream.mostrarDetalles();
    }
}