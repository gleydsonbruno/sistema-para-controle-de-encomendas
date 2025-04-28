import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static boolean syst = true;
    static ArrayList<Encomendas> lista_de_encomendas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int id_cli = 1;

    public static void main(String[] args) {

        welcome_message();
        while (syst) {
            menu_action();
        }

    }

    public static void welcome_message() {
        System.out.println("---------------");
        System.out.println("- BEM - VINDA -");
        System.out.println("--  NATÁLIA  --");
        System.out.println("---------------\n");
        System.out.println("O que quer fazer?\n");
        System.out.println(" 1 - Abrir fila de encomendas");
        System.out.println(" 2 - Adicionar encomendas");
        System.out.println(" 3 - Printar lista_encomendas ");
        System.out.println(" 4 - Sair\n");
    }

    public static void menu() {
        System.out.println(" 1 - Abrir fila de encomendas");
        System.out.println(" 2 - Adicionar encomendas");
        System.out.println(" 3 - Printar lista_encomendas ");
        System.out.println(" 4 - Sair\n");
    }

    public static void menu_action() {


        int user_action = scanner.nextInt();
        scanner.nextLine();

        action(user_action);


    }

    private static void action(int user_action) {

        if (user_action == 1) {

            if (!lista_de_encomendas.isEmpty()) {
                System.out.println("Listas de encomendas:");
                System.out.println("Obs: Selecione o ID referente ao cliente para entrar em detalhes \n");
                for (Encomendas cliente : lista_de_encomendas) {
                    System.out.println("ID: " + cliente.getId_cliente() + "| " + cliente.getCliente() + " - Data para entregar: " + cliente.getData_entrega());
                }

                searchClient();


            } else {
                System.out.println("Ainda não há encomendas.");
            }


        } else if (user_action == 2 ){
            for (int cc = 1; cc < 50; cc++) {
                System.out.println();
            }
            System.out.println("2 - Cadastrar nova encomenda: \n");
            for (int cc = 1; cc < 6; cc++) {
                System.out.println();
            }
            System.out.println("Tipo da encomenda: ");
            String tipo = scanner.nextLine();
            System.out.println("Nome do cliente: ");
            String nome = scanner.nextLine();
            System.out.println("Valor cobrado: ");

            float valor;
            while (true) {
                if (scanner.hasNextFloat()) {
                    valor = scanner.nextFloat();
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Valor inválido! Digite apenas números para definir o valor.");
                    scanner.nextLine();
                }
            }


            System.out.println("Data do pedido: ");
            String data_pedido = scanner.nextLine();
            System.out.println("Data de entrega: ");
            String data_entrega = scanner.nextLine();
            System.out.println("Descrição do pedido: ");
            String descricao = scanner.nextLine();

            Encomendas encomenda = new Encomendas(tipo, nome, valor, data_pedido, data_entrega, descricao, id_cli++);

            lista_de_encomendas.add(encomenda);

            System.out.println("\n Nova encomenda adicionada com sucesso! \n");
            encomenda.apresentar_cliente();

        } else if (user_action == 3 ){
            System.out.println(lista_de_encomendas);
            System.out.println(lista_de_encomendas.get(0).getId_cliente());

        } else if (user_action == 4){

            try {
                scanner.close();
                System.out.println("Encerrando scanner . . .\n");
                Thread.sleep(500);
                System.out.println("Desligando o sistema . . .\n");
                Thread.sleep(500);
                System.out.println("Sistema encerrado.\n");
                System.exit(0);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            syst = false;


        } else {
            System.out.println("Opção inválida! Use apenas números de 1 a 4 para executar uma ação");
        }

        backToMenu();
        menu();

    }

    private static void searchClient() {
        System.out.println("\nDeseja acessar algum cliente? Digite o ID");
        System.out.println("Caso contrário, pressione enter para voltar ao menu\n");
        int access_cli = scanner.nextInt();
        scanner.nextLine();

        boolean client_found = false;
        for (Encomendas cliente : lista_de_encomendas) {
            if (cliente.getId_cliente() == access_cli) {
                cliente.apresentar_cliente();
                client_found = true;

                System.out.println("\nO que deseja fazer?");
                System.out.println("1 - Deletar pedido | 2 - Finalizar pedido | 3 - Atualizar pedido (not implemented)");
                System.out.println("4 - Menu\n");
                int cli_options = scanner.nextInt();

                if (cli_options == 1) {
                    break;
                } else if (cli_options == 2) {
                    cliente.setStatus("finalizado");
                    System.out.println("Pedido nº " + access_cli + "finalizado!\n");
                } else if (cli_options == 3) {
                    break;
                } else if (cli_options == 4) {
                    break;
                } else {
                    break;
                }

            }
        }

        if (!client_found) {
            System.out.println("ID Inválido");
        }
    }

    private static void backToMenu() {
        System.out.println("\nPressione enter para voltar ao menu");
        String back_to_menu = scanner.nextLine();
        while (!back_to_menu.isEmpty()) {
            System.out.println("Tipo de entrada errado");
            System.out.println("Pressione enter para voltar ao menu\n");
            back_to_menu = scanner.nextLine();
        }
    }




}

