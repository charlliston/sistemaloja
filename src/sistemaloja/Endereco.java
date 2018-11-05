package sistemaloja;

public class Endereco {

    private String rua;
    private String bairro;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;
    private int numero;

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

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
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
