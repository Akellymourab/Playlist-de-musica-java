// Classe que controla a lógica da playlist
public class Player {
    private ListaCircularDuplamenteEncadeada playlist;
    private No musicaAtual;

    public Player() {
        this.playlist = new ListaCircularDuplamenteEncadeada();
    }

    public void adicionarMusica(Musica musica) {
        playlist.adicionar(musica);
        // Se a música atual for nula, define como a primeira da lista
        if (musicaAtual == null) {
            musicaAtual = playlist.getCabeca();
        }
    }

    public void tocar() {
        if (musicaAtual != null) {
            System.out.println("Tocando agora: " + musicaAtual.musica);
        } else {
            System.out.println("Nenhuma música na playlist.");
        }
    }

    public void proximaMusica() {
        if (musicaAtual != null) {
            musicaAtual = musicaAtual.proximo;
            System.out.println("Avançando para a próxima música...");
            tocar();
        }
    }

    public void musicaAnterior() {
        if (musicaAtual != null) {
            musicaAtual = musicaAtual.anterior;
            System.out.println("Voltando para a música anterior...");
            tocar();
        }
    }

    public void mostrarPlaylistCompleta() {
        playlist.imprimirLista();
    }
}
