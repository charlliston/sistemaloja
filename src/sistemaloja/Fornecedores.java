package sistemaloja;

public class Fornecedores extends PessoaJuridica {

    private String prazo;
    private Produtos produto;
    private String prodVendidos;


    //metodos de acesso as variáveis acima
    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public String getPrazo() {
        return (this.prazo);
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }

    public Produtos getProduto() {
        return (this.produto);
    }

    public void setProdVendidos(String prodVendidos) {
        this.prodVendidos = prodVendidos;
    }

    public String getProdVendidos() {
        return (this.prodVendidos);
    }
}
