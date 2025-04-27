import java.util.Scanner;

public class Encomendas {
    private int id_cliente;
    private String tipo_encomenda;
    private String cliente;
    private float valor;
    private String data_pedido;
    private String data_entrega;
    private String descricao;

    public Encomendas() {
        tipo_encomenda = "";
        cliente = "";
        valor = 0;
        data_pedido = "";
        data_entrega = "";
        descricao = "";
        id_cliente = 0;
    }

    public Encomendas(String tipo_encomenda, String cliente, float valor, String data_pedido, String data_entrega, String descricao, int id_cliente) {
        this.tipo_encomenda = tipo_encomenda;
        this.cliente = cliente;
        this.valor = valor;
        this.data_pedido = data_pedido;
        this.data_entrega = data_entrega;
        this.descricao = descricao;
        this.id_cliente = id_cliente;
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

    public void apresentar_cliente() {
        System.out.println("ID: " + id_cliente);
        System.out.println("Nome do cliente: " + cliente);
        System.out.println("Valor do pedido: " + valor);
        System.out.println("Data de entrega: " + data_entrega);
    }

    public void cadastrar_encomenda(String tipo) {
        Scanner scanner = new Scanner(System.in);
        tipo_encomenda = tipo;
        scanner.close();
    }
}
