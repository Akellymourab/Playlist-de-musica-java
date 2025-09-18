// A implementação da estrutura de dados
public class ListaCircularDuplamenteEncadeada {
    private No cabeca; // Usaremos 'cabeça' para marcar o início (e fim) da lista
    private int tamanho;

    public ListaCircularDuplamenteEncadeada() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void adicionar(Musica musica) {
        No novoNo = new No(musica);
        if (estaVazia()) {
            cabeca = novoNo;
            cabeca.proximo = cabeca; // Aponta para si mesmo
            cabeca.anterior = cabeca; // Aponta para si mesmo
        } else {
            No cauda = cabeca.anterior; // O último elemento é o anterior da cabeça
            cauda.proximo = novoNo;
            novoNo.anterior = cauda;
            novoNo.proximo = cabeca;
            cabeca.anterior = novoNo;
        }
        tamanho++;
    }

    // Retorna o nó inicial para o player começar a tocar
    public No getCabeca() {
        return this.cabeca;
    }

    public void imprimirLista() {
        if (estaVazia()) {
            System.out.println("A playlist está vazia.");
            return;
        }
        No atual = cabeca;
        System.out.println("---- Playlist Completa ----");
        do {
            System.out.println(atual.musica);
            atual = atual.proximo;
        } while (atual != cabeca);
        System.out.println("-------------------------");
    }
}
