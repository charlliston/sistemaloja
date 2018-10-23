package sistemaloja;

public class Produto {

    private String nome;
    private String descricao;
    private double valor;
    private double icms;
    //Variáveis auxiliares para a estrutura de dados "Árvore AVL".
    protected int codigo;
    protected int fb;
    protected Produto pai;
    protected Produto esquerdo;
    protected Produto direito;

    public Produto(int codigo, Produto esquerdo, Produto direito, Produto pai) {
        this.codigo = codigo;
        this.fb = 0;
        this.esquerdo = esquerdo;
        this.direito = direito;
    }

    public void set_Nome(String nome) {
        this.nome = nome;
    }

    public String get_Nome() {
        return (this.nome);
    }

    public void set_Descricao(String descricao) {
        this.descricao = descricao;
    }

    public String get_Descricao() {
        return (this.descricao);
    }

    public void set_Valor(Double valor) {
        this.valor = valor;
    }

    public Double get_Valor() {
        return (this.valor);
    }

    public void set_Icms(double icms) {
        this.icms = icms;
    }

    public Double get_Icms() {
        return (this.icms);
    }
}
