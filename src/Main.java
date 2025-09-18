// Classe principal para controlar o fluxo, sem input do usuário
public class Main {
    public static void main(String[] args) {
        System.out.println("### Iniciando a simulação do Player de Música ###\n");

        // 1. Criar o Player
        Player meuPlayer = new Player();

        // 2. Adicionar músicas à playlist
        System.out.println("--- Adicionando músicas ---");
        meuPlayer.adicionarMusica(new Musica("Bohemian Rhapsody", "Queen"));
        meuPlayer.adicionarMusica(new Musica("Smells Like Teen Spirit", "Nirvana"));
        meuPlayer.adicionarMusica(new Musica("Hotel California", "Eagles"));
        meuPlayer.adicionarMusica(new Musica("Billie Jean", "Michael Jackson"));
        System.out.println("Músicas adicionadas com sucesso!\n");

        // Mostrar a playlist completa
        meuPlayer.mostrarPlaylistCompleta();
        System.out.println("");

        // 3. Simular o uso do Player
        System.out.println("--- Simulando o uso ---");
        meuPlayer.tocar(); // Toca a primeira música

        meuPlayer.proximaMusica(); // Toca a segunda

        meuPlayer.proximaMusica(); // Toca a terceira

        meuPlayer.musicaAnterior(); // Volta para a segunda

        meuPlayer.proximaMusica(); // Vai para a terceira de novo

        meuPlayer.proximaMusica(); // Vai para a quarta

        // Testando a circularidade da lista
        System.out.println("\n--- Testando a funcionalidade circular ---");
        System.out.println("Estamos na última música. A próxima deve ser a primeira.");
        meuPlayer.proximaMusica(); // Toca a primeira novamente

        System.out.println("\nEstamos na primeira música. A anterior deve ser a última.");
        meuPlayer.musicaAnterior(); // Toca a última novamente

        System.out.println("\n### Simulação finalizada. ###");
    }
}
