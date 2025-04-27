import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static ArrayList<Encomendas> lista_de_encomendas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        welcome_message();
        while (true) {
            menu_action();
        }

    }

    public static void welcome_message() {
        System.out.println("---------------");
        System.out.println("- BEM - VINDA -");
        System.out.println("--  NATÁLIA  --");
        System.out.println("---------------\n");
        System.out.println("O que quer ver?\n");
        System.out.println(" 1 - Abrir fila de encomendas");
        System.out.println(" 2 - Adicionar encomendas");
        System.out.println(" 3 - x ");
        System.out.println(" 4 - Sair\n");
    }

    public static void menu_action() {


        int user_action = scanner.nextInt();

        action(user_action);


    }

    private static void action(int user_action) {

        if (user_action == 1) {

            System.out.println("Listas de encomendas:");
            System.out.println("Obs: Selecione o ID referente ao cliente para entrar em detalhes \n");
            for (Encomendas cliente : lista_de_encomendas) {
                System.out.println(cliente.getId_cliente());
            }




        } else if (user_action == 2 ){
            System.out.println("2 - Cadastrar nova encomenda: \n");
            System.out.println("Tipo da encomenda: ");
            String tipo = scanner.nextLine();
            System.out.println("Nome do cliente: ");
            String nome = scanner.nextLine();
            System.out.println("Valor cobrado: ");
            float valor = scanner.nextFloat();
            System.out.println("Data do pedido: ");
            String data_pedido = scanner.nextLine();
            System.out.println("Data de entrega: ");
            String data_entrega = scanner.nextLine();
            System.out.println("Descrição do pedido: ");
            String descricao = scanner.nextLine();

            Encomendas encomenda = new Encomendas(tipo, nome, valor, data_pedido, data_entrega, descricao, 1);

            lista_de_encomendas.add(encomenda);

            System.out.println("\n Nova encomenda adicionada com sucesso! \n");
            encomenda.apresentar_cliente();

        } else if (user_action == 3 ){
            System.out.println("3");
            menu_action();
        } else if (user_action == 4){
            scanner.close();
            System.exit(0);
        } else {
            System.out.println("Opção inválida! Use apenas números de 1 a 4 para executar uma ação");
        }
    }


}

