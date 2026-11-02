# Sistema de Gestión de Contenido Audiovisual (POO)

Proyecto desarrollado para la materia de **Programación Orientada a Objetos (POO)** en la **Universidad Politécnica Salesiana (UPS)**. Consiste en una aplicación en Java que implementa los pilares de la programación orientada a objetos (herencia, polimorfismo, encapsulamiento y abstracción) para administrar un catálogo de contenido multimedia.

---

##  Diagrama de Clases UML

A continuación se muestra el diseño arquitectónico del sistema, reflejando la clase abstracta base, las subclases especializadas, las clases de soporte y sus respectivas relaciones de herencia y asociación:

![Diagrama de Clases POO](Diagrama%20POO.png)

---

##  Estructura del Proyecto

El sistema está compuesto por una clase abstracta principal, múltiples subclases y clases de soporte:

### 1. Clase Abstracta Base
* **`ContenidoAudiovisual`**: Define los atributos comunes (`titulo`, `genero`), constructores, métodos de encapsulamiento (Getters/Setters) y el método abstracto `mostrarDetalles()`.

### 2. Subclases (Herencia)
Heredan de `ContenidoAudiovisual` e implementan el método `mostrarDetalles()`:
* **`Pelicula`**: Gestiona el estudio cinematográfico y estado de streaming.
* **`SerieDeTV`**: Controla el número de temporadas y episodios.
* **`Documental`**: Incluye el tema principal y la relación con un investigador.
* **`VideoYouTube`**: Almacena el canal y las reproducciones.
* **`CursoOnline`**: Administra la plataforma y el instructor.
* **`TransmisionEnVivo`**: Maneja la plataforma y los espectadores actuales.

### 3. Clases de Soporte y Relaciones
* **`Actor`**: Contiene nombre, personaje y su relación de participación/interpretación.
* **`Temporada`**: Administra los episodios y su agregación/composición con las series.
* **`Investigador`**: Detalla el nombre y la especialidad vinculada al documental.

---

##  Ejecución del Proyecto

1. Clona este repositorio o descarga los archivos fuente en tu entorno de desarrollo (como Visual Studio Code).
2. Asegúrate de compilar todos los archivos `.java` en la misma carpeta:
   ```bash
   javac *.java
