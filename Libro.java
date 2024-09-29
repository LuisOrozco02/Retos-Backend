public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private String genero;
    private double costo;

    public Libro(String titulo, String autor, int paginas, String genero, double costo) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.genero = genero;
        this.costo = costo;
    }

    public void leer() {
        System.out.println("Estas leyendo " + titulo + " de " + autor);

    }

    public int tiempoLectura(int paginasPorHora) {
        return paginas / paginasPorHora;

    }

    public boolean esDelGenero(String generoBuscado) {
        return genero.equalsIgnoreCase(generoBuscado);
    }

}
