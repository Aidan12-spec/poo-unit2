/*
*Class
*/
package uni1a;

public class Pelicula extends ContenidoAudioVisual {
    private String estudio;
    private Actor actor;  // atributo para guardar un actor

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio, String nombreActor) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actor = new Actor(nombreActor);
    }

    public class Actor {
        private String nombre;

        public Actor(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println("Actor: " + actor.getNombre()); 
        System.out.println();
    }
}
