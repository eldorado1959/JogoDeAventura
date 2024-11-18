
import java.util.Scanner;

public class JogoDeAventura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo de Aventuras!");
        System.out.print("Qual será o nome do seu personagem? ");
        String nome = scanner.nextLine();

        System.out.println("Escolha sua classe: ");
        System.out.println("1) Guerreiro");
        System.out.println("2) Mago");
        System.out.println("3) Arqueiro");
        int escolha = scanner.nextInt();

        Personagem personagem;
        switch (escolha) {
            case 1 -> personagem = new Guerreiro(nome);
            case 2 -> personagem = new Mago(nome);  // Crie a classe `Mago`.
            case 3 -> personagem = new Arqueiro(nome);  // Crie a classe `Arqueiro`.
            default -> {
                System.out.println("Opção inválida. Criando um Guerreiro por padrão.");
                personagem = new Guerreiro(nome);
            }
        }

        System.out.println("Bem-vindo, " + nome + "! Sua aventura começa agora!");

        // Exemplo de combate
        while (personagem.getVida() > 0) {
            System.out.println("\nVocê encontrou um monstro! O que deseja fazer?");
            System.out.println("1) Atacar");
            System.out.println("2) Fugir");
            int acao = scanner.nextInt();

            if (acao == 1) {
                personagem.atacar();
                int danoRecebido = Dados.rolarVarios(2, 6);
                personagem.setVida(personagem.getVida() - danoRecebido);
                System.out.println("Você sofreu " + danoRecebido + " de dano. Vida restante: " + personagem.getVida());
            } else if (acao == 2) {
                personagem.fugir();
                break;
            } else {
                System.out.println("Ação inválida!");
            }
        }

        if (personagem.getVida() <= 0) {
            System.out.println("Você foi derrotado. Fim de jogo!");
        } else {
            System.out.println("Você escapou! Sua aventura continua...");
        }

        scanner.close();
    }
}

