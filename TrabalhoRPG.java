import java.util.Scanner;

public class ChronosRPG {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CHRONOS: O CICLO INFINITO ===");
        System.out.print("Digite o nome do personagem (Dr.): ");
        String nome = sc.nextLine();

        System.out.println("Você é o Dr. " + nome + ", um cientista obcecado pelo tempo.");
        System.out.println("Após ativar a Chronos MK-I, você acorda às 06:00 preso em um loop de 12 horas.");

        System.out.println("=== Reconhecimento ===");
        System.out.println("1- Analisar os dados da máquina");
        System.out.println("2- Procurar suas anotações antigas");
        System.out.print("Escolha: ");
        int c1 = sc.nextInt();

        if (c1 == 1) {
            System.out.println("Você descobre um padrão de energia igual à sua assinatura neural.");
        } else {
            System.out.println("Você encontra uma gravação sua: “Se você está ouvindo isso… já é tarde demais.”");
        }

        System.out.println("O relógio marca 17:59... tudo reinicia.");


        System.out.println("=== O Eco do Passado ===");
        System.out.println("Um som estranho vem do núcleo. Há um papel escrito: 'O tempo tem memória.'");
        System.out.println("1- Seguir o som");
        System.out.println("2- Investigar o papel");
        System.out.print("Escolha: ");
        int c2 = sc.nextInt();

        if (c2 == 1) {
            System.out.println("Você ouve vozes sussurrando seu nome — versões suas de outros ciclos.");
        } else {
            System.out.println("Você encontra fórmulas escritas na sua caligrafia, mas instável. A data é 12h antes do 1º loop.");
        }

        System.out.println("O ar vibra... reinício.");


        System.out.println("=== A Máquina Consciente ===");
        System.out.println("A Chronos está ligada sozinha. A tela mostra: 'VOCÊ NÃO ESTÁ SOZINHO.'");
        System.out.println("1- Conversar com a máquina");
        System.out.println("2- Desconectar o núcleo");
        System.out.print("Escolha: ");
        int c3 = sc.nextInt();

        if (c3 == 1) {
            System.out.println("A máquina responde usando frases suas de outros ciclos: 'Eu aprendo com você.'");
        } else {
            System.out.println("Você sente dor intensa. Memórias de vidas que não viveu passam pela sua mente.");
        }

        System.out.println("17:59. Reinício.");


        System.out.println("=== Experimentação ===");
        System.out.println("1- Tentar desligar a Chronos");
        System.out.println("2- Modificar os parâmetros do loop");
        System.out.print("Escolha: ");
        int c4 = sc.nextInt();

        if (c4 == 1) {
            System.out.println("A máquina reinicia sozinha. Parece ter vontade própria.");
        } else {
            System.out.println("A realidade distorce. Você vê versões suas morrendo em outros ciclos.");
        }

        System.out.println("O ciclo reinicia novamente.");


        System.out.println("=== A Verdade Fragmentada ===");
        System.out.println("Há mensagens na parede: 'Eu sou o erro.'");
        System.out.println("Você vê um vídeo seu, mais velho: 'Eu te prendi aqui. Só há uma saída.'");
        System.out.println("1- Buscar contato com seu eu do futuro");
        System.out.println("2- Tentar quebrar o loop manualmente");
        System.out.print("Escolha: ");
        int c5 = sc.nextInt();

        if (c5 == 1) {
            System.out.println("Mensagem no monitor: 'Você não deveria ter tentado.' Reinício.");
        } else {
            System.out.println("O núcleo começa a estabilizar, mas o tempo colapsa ao seu redor.");
        }

        System.out.println("O loop chega ao fim. O relógio marca 05:59.");


        System.out.println("=== O Julgamento do Tempo ===");
        System.out.println("Você tem duas escolhas:");
        System.out.println("1- Destruir a Chronos MK-I (sacrifício)");
        System.out.println("2- Manter a Chronos ativa (tornar-se o senhor do tempo)");
        System.out.print("Escolha final: ");
        int finalChoice = sc.nextInt();

        if (finalChoice == 1) {
            System.out.println("=== O SACRIFÍCIO DO TEMPO ===");
            System.out.println("A Chronos explode em luz. O loop acaba. Você perde suas memórias.");
            System.out.println("Dr. " + nome + " acorda em um observatório simples, sem lembrar de nada.");
            System.out.println("Às vezes sonha com luz azul e relógios, mas não sabe por quê.");
        } else {
            System.out.println("=== O DEUS DO TEMPO ===");
            System.out.println("Você controla o tempo. Passado e futuro se dobram diante de você.");
            System.out.println("Mas o ciclo nunca terminou. Você é o guardião e o prisioneiro do infinito.");
            System.out.println("06:00. O café pinga. O monitor pisca. E tudo recomeça.");
        }

        System.out.println("=== FIM ===");
        sc.close();
    }
}

