package sistemaloja;

import java.io.Serializable;

public class Fornecedores extends PessoaJuridica implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String prazo;
    Produtos produto;
    String empresa;
    String nome;
    String categoriaProduto;
    String email;
  
    String prodVendidos;

    public Fornecedores ( String cnpj, String prazo, String nome, String empresa, String categoriaProduto, Endereco endereco, 
    		String telefone, String email) {
    	this.cnpj = cnpj;
    	this.prazo = prazo;
    	
    	this.empresa = empresa;
    	this.categoriaProduto = categoriaProduto;
    	this.telefone =telefone;
    	this.email = email;
    	this.nome = nome;
    	this.endereco = endereco;
    			}
     
    //metodos de acesso as variáveis acima
    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public String getPrazo() {
        return (this.prazo);
    }
    
    public String getCategoria() {
        return (this.categoriaProduto);
    }

    public String getEmail() {
        return (this.email);
    }
    
    public String getEmpresa() {
        return (this.empresa);
    }
    public String getNome() {
        return (this.nome);
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
