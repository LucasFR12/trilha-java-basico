import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: "Conhecer e importar a classe Scanner"
        //TODO: "Exibir as mensagens para o nosso usuário"
        //TODO: "Obter pela scanner os valores digitados no terminal"
        //TODO: "Exibir a mensagem conta criada"

        // Criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Declarando as variáveis
        int numero;
        String agencia, nome;
        double saldo;

        // Exibindo as mensagens para o usuário e obtendo os valores digitados no terminal
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.next();
        System.out.println("Por favor, digite o número da conta!");
        numero = scanner.nextInt();
        // Consumir a nova linha pendente
        scanner.nextLine();
        System.out.println("Por favor, digite o nome!");
        nome = scanner.nextLine();
        System.out.println("Por favor, digite o saldo da conta!");
        saldo = scanner.nextDouble();

        // Exibindo as mensagens para o usuário
        System.out.println("Conta criada com sucesso!");
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d " +
                "e seu saldo R$ %.2f já está disponível para saque.", nome, agencia, numero, saldo));

        // Fechando o scanner
        scanner.close();

    }
}