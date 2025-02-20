import java.util.Scanner;

public class clientesMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        clientes c = new clientes();
        boolean cont = true;
        int option;

        System.out.print("Digite o nome do cliente: ");
        c.nome = entrada();

        System.out.print("Digite o cpf do cliente: ");
        c.cpf = entrada();

        System.out.print("Digite o saldo do cliente: ");
        c.saldo = Integer.parseInt(entrada());

        while (cont) {
            System.out.print("Digite 1 para saque, 2 para deposito, 3 para consulta e 4 para parar: ");
            option = in.nextInt();
            if(option == 1){
                c.saque();
            }

            if(option == 2){
                c.deposito();;
            }

            if(option == 3){
                c.consulta();;
            }

            if(option == 4){
                cont = false;
            }
        }
        in.close();
    }

    public static String entrada(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
