import java.util.Scanner;

public class clientes {
    String nome;
    String cpf;
    int saldo;

    public int saque(){
        Scanner in = new Scanner(System.in);
        int saque;
        System.out.print("Digite a qnt do saque: ");
        saque = in.nextInt();
        return saldo = saldo - saque;
    }

    public int deposito(){
        Scanner in = new Scanner(System.in);
        int deposito;
        System.out.print("Digite a qnt do deposito: ");
        deposito = in.nextInt();
        return saldo = saldo + deposito;
    }

    public void consulta(){
        System.out.println("O seu saldo é de " + saldo);
    }
}
