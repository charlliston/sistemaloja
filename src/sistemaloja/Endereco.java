package sistemaloja;

import java.io.Serializable;

public class Endereco implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String rua;
    private String bairro;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;
    private String numero;
    public Endereco (String rua, String bairro, String complemento, String cidade, String estado, String numero, String cep) {
    	this.rua = rua;
    	this.bairro = bairro;
    	this.complemento = complemento;
    	this.cidade = cidade;
    	this.estado = estado;
    	this.numero = numero;
    	this.cep = cep;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getRua() {
        return (this.rua);
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBairro() {
        return (this.bairro);
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return (this.complemento);
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return (this.numero);
    }

    public void setCEP(String cep) {
        this.cep = cep;
    }

    public String getCEP() {
        return (this.cep);
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return (this.cidade);
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return (this.estado);
    }
}
