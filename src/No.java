// O Nó da nossa lista, que armazena a música e as referências
public class No {
    Musica musica;
    No proximo;
    No anterior;

    public No(Musica musica) {
        this.musica = musica;
        this.proximo = null; // Inicialmente nulos
        this.anterior = null;
    }
}
