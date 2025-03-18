public class Marcador {
    private String url;
    private String titulo;
    private String categoria;


    public Marcador() {
        this.url = "";
        this.titulo = "";
        this.categoria = "";
    }


    public Marcador(String url, String titulo, String categoria) {
        this.url = url;
        this.titulo = titulo;
        this.categoria = categoria;
    }


    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    @Override
    public String toString() {
        return "URL: " + url + "\nNombre: " + titulo + "\nCategoría: " + categoria;
    }
}

