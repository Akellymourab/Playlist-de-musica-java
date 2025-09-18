// Classe simples para representar uma música
public class Musica {
    String titulo;
    String artista;

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Música: " + titulo + " - Artista: " + artista;
    }
}
