package uni1a;

public class Youtube extends ContenidoAudioVisual{
    private Fecha fecha;  
    private String tema;
    private String nombre;

    public Youtube(String titulo, int duracionEnMinutos, String genero,String autor ,String diaFecha, String tema){
            super(titulo, duracionEnMinutos, genero);
            this.nombre = autor;
            this.fecha = new Fecha(diaFecha);
            this.tema = tema;
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
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
 @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del video:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en segundos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Autor: " + nombre);
        System.out.println("Tema del video: " + tema);
        System.out.println("Fecha: " + fecha.getDia());
        System.out.println();
    }
}
