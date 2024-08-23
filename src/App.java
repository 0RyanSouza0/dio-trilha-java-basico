import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();
        Random random = new Random();
        System.out.println("");

        System.out.println("Digite o numero da conta: ");
        contaTerminal.setNumero(ler.nextInt());

        System.out.println("Digite o nome da agência: ");
        contaTerminal.setAgencia(ler.next());

        System.out.println("Digite o seu nome: ");
        contaTerminal.setNomeCliente(ler.next());

        // O SALDO DA CONTA SERA ALEATORIO, PARA TER MAIS 'SENTIDO'

        contaTerminal.setSaldo(random.nextInt(100));

        System.out.println("Ola " + contaTerminal.getNomeCliente()
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaTerminal.getAgencia());
        System.out.println("Conta: " + contaTerminal.getNumero() + " e seu saldo: " + contaTerminal.getSaldo()
                + "R$ ja esta disponivel para saque.");
    }

}
