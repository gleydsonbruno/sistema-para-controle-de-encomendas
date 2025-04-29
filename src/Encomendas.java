import java.util.Scanner;

public class Encomendas {
    private int id_cliente;
    private String tipo_encomenda;
    private String cliente;
    private float valor;
    private String data_pedido;
    private String data_entrega;
    private String descricao;
    private String status;
    private String pagou_metade;

    public Encomendas() {
        tipo_encomenda = "";
        cliente = "";
        valor = 0;
        data_pedido = "";
        data_entrega = "";
        descricao = "";
        id_cliente = 0;
        status = "";
        pagou_metade = "";
    }

    public Encomendas(String tipo_encomenda, String cliente, float valor, String data_pedido, String data_entrega, String descricao, int id_cliente) {
        this.tipo_encomenda = tipo_encomenda;
        this.cliente = cliente;
        this.valor = valor;
        this.data_pedido = data_pedido;
        this.data_entrega = data_entrega;
        this.descricao = descricao;
        this.id_cliente = id_cliente;
        this.status = "pendente";
        this.pagou_metade = "não";
    }

    public void setTipo_encomenda(String tipo_encomenda) {
        this.tipo_encomenda = tipo_encomenda;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setData_entrega(String data_entrega) {
        this.data_entrega = data_entrega;
    }

    public void setData_pedido(String data_pedido) {
        this.data_pedido = data_pedido;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPagou_metade(String pagou_metade) {
        this.pagou_metade = pagou_metade;
    }

    public String getTipo_encomenda() {
        return tipo_encomenda;
    }

    public float getValor() {
        return valor;
    }

    public String getCliente() {
        return cliente;
    }

    public String getData_entrega() {
        return data_entrega;
    }

    public String getData_pedido() {
        return data_pedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public String getStatus() {
        return status;
    }

    public String getPagou_metade() {
        return pagou_metade;
    }

    public void apresentar_cliente() {
        System.out.println("Tipo de encomenda: " + tipo_encomenda);
        System.out.println("Nome do cliente: " + cliente);
        System.out.println("Valor do pedido: " + valor);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data de pedido: " + data_pedido);
        System.out.println("Data de entrega: " + data_entrega);
        System.out.println("Status do pedido: " + status);
        System.out.println("Metade do valor paga: " + pagou_metade);
    }

    public void cadastrar_encomenda(String tipo) {
        Scanner scanner = new Scanner(System.in);
        tipo_encomenda = tipo;
        scanner.close();
    }

    public void lista_cliente() {
        System.out.println("ID: " + id_cliente + "| " + cliente + " - Data para entregar: " + data_entrega);
    }
}
