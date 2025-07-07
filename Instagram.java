package uni1a;

public class Instagram extends ContenidoAudioVisual {
    private String tema;
    private String nombre;
    private Fecha fecha;  
    private Contenido contenido;

   public Instagram(String titulo, int duracionEnMinutos, String genero, String autor, String diaFecha, String tema){
        super(titulo, duracionEnMinutos, genero); 
        this.contenido = new Contenido(genero);
        this.nombre = autor;
        this.fecha = new Fecha(diaFecha);
        this.tema = tema;
    }

    public class Contenido {
        private String genero;

        public Contenido(String genero) {
            this.genero = genero;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }
    }
    public class Fecha{
        private String dia;
        
        public Fecha(String dia){
            this.dia = dia;
        }

        public String getDia() {
            return dia;
        }

        public void setDia(String dia) {
            this.dia = dia;
        }
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Publicacion:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Contenido: " + contenido.getGenero());
        System.out.println("Autor: " + nombre);
        System.out.println("Tema de la publicacion: " + tema);
        System.out.println("Fecha: " + fecha.getDia());
        System.out.println();
    }
}
