package sistemaloja;

public class Fornecedor {

    private String nome;
    private String cnpj;
    private Endereco endereco;
    private String telefone;
    private Produto produtos;
    //Variáveis auxiliares para a estrutura de dados "Árvore AVL".
    protected int codigo;
    protected int fb;
    protected Fornecedor pai;
    protected Fornecedor esquerdo;
    protected Fornecedor direito;

    public Fornecedor(int codigo, Fornecedor esquerdo, Fornecedor direito, Fornecedor pai) {
        this.fb = 0;
        this.codigo = codigo;
        this.pai = pai;
        this.esquerdo = esquerdo;
        this.direito = direito;
    }

    //metodos de acesso as variáveis acima
    public void set_Nome(String nome) {
        this.nome = nome;
    }

    public String get_Nome() {
        return (this.nome);
    }

    public void set_Cnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String get_cnpj() {
        return (this.cnpj);
    }

    public void set_Endereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco get_Endereco() {
        return (this.endereco);
    }

    public void set_Telefone(String telefone) {
        this.telefone = telefone;
    }

    public String get_Telefone() {
        return (this.telefone);
    }

    public void set_Produtos(Produto produtos) {
        this.produtos = produtos;
    }

    public Produto get_Produtos() {
        return (this.produtos);
    }
}
