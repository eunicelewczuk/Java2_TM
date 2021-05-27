package practica;

public class Libro {

    private String titulo;
    private String isbn;
    private String autor;
    private boolean prestado;

    public Libro(){
        this.setPrestado(false);
    }

    public Libro(String titulo, String isbn, String autor){
        this.setTitulo(titulo);
        this.setIsbn(isbn);
        this.setAutor(autor);
        this.setPrestado(false);
    }

    public void prestamo(){
        this.setPrestado(true);
    }

    public void devolucion(){
        this.setPrestado(false);
    }

    @Override
    public String toString(){
        return titulo + ", " + isbn + ", " + autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

}
