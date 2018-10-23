package sistemaloja;

public class Endereco {

    private String rua;
    private String bairro;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;
    private int numero;

    public void set_Rua(String rua) {
        this.rua = rua;
    }

    public String get_Rua() {
        return (this.rua);
    }

    public void set_Bairro(String bairro) {
        this.bairro = bairro;
    }

    public String get_Bairro() {
        return (this.bairro);
    }

    public void set_Complemento(String complemento) {
        this.complemento = complemento;
    }

    public String get_Complemento() {
        return (this.complemento);
    }

    public void set_Numero(int numero) {
        this.numero = numero;
    }

    public int get_Numero() {
        return (this.numero);
    }

    public void set_CEP(String cep) {
        this.cep = cep;
    }

    public String get_CEP() {
        return (this.cep);
    }

    public void set_Cidade(String cidade) {
        this.cidade = cidade;
    }

    public String get_Cidade() {
        return (this.cidade);
    }

    public void set_Estado(String estado) {
        this.estado = estado;
    }

    public String get_Estado() {
        return (this.estado);
    }
}
