# Sistema de Gestión de Contenido Audiovisual (POO)

Proyecto desarrollado para la materia de **Programación Orientada a Objetos (POO)** en la **Universidad Politécnica Salesiana (UPS)**. Consiste en una aplicación en Java que implementa los pilares de la programación orientada a objetos (herencia, polimorfismo, encapsulamiento y abstracción) para administrar un catálogo de contenido multimedia.

---

## 🛠️ Estructura del Proyecto

El sistema está compuesto por una clase abstracta principal, múltiples subclases especializadas y clases de soporte que establecen relaciones de agregación y asociación:

### 1. Clase Abstracta Base
* **`ContenidoAudiovisual`**: Define los atributos comunes (`titulo`, `duracionEnMinutos`, `genero`, `anioLanzamiento`), constructores, métodos de encapsulamiento (Getters/Setters) y el método abstracto `mostrarDetalles()`.

### 2. Subclases (Herencia)
Cada una hereda de `ContenidoAudiovisual` e implementa obligatoriamente el método `mostrarDetalles()`:
* **`Pelicula`**: Añade atributos como estudio cinematográfico y disponibilidad en streaming.
* **`SerieDeTV`**: Gestiona temporadas y episodios por temporada.
* **`Documental`**: Incluye el tema principal y una relación directa con un investigador.
* **`VideoYouTube`**: Almacena información sobre el canal y las reproducciones.
* **`CursoOnline`**: Controla la plataforma de difusión y el instructor a cargo.
* **`TransmisionEnVivo`**: Maneja la plataforma de transmisión y la cantidad de espectadores actuales.

### 3. Clases de Soporte y Relaciones
* **`Actor`**: Contiene datos sobre el elenco (nombre, edad, nacionalidad, personaje).
* **`Temporada`**: Administra la estructura de las series (número de temporada, cantidad de episodios, fecha de estreno).
* **`Investigador`**: Detalla la información de expertos científicos o académicos (nombre, especialidad, años de experiencia).

---

## 🚀 Ejecución del Proyecto

1. Clona este repositorio o descarga los archivos fuente en tu entorno de desarrollo (como Visual Studio Code).
2. Asegúrate de compilar todos los archivos `.java` en la misma carpeta o paquete:
   ```bash
   javac *.java
