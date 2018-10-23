package sistemaloja;

import java.util.Date;

public class Pessoa {

    private String nome;
    private String rg;
    private String cpf;
    private Endereco endereco;
    private String telefone;
    private String sexo;
    private String estado_Civil;
    private Date data_De_Nascimento;
    private String nome_Da_Mae;


    public Pessoa() {

    }

    //metodos de acesso as variáveis acima
    public void set_Nome(String nome) {
        this.nome = nome;
    }

    public String get_Nome() {
        return (this.nome);
    }

    public void set_RG(String rg) {
        this.rg = rg;
    }

    public String get_RG() {
        return (this.rg);
    }

    public boolean set_CPF(String cpf) {
        if ((cpf == null) || (cpf.length() != 11)) {
            return false;
        } else {
            String cpf_Pessoa = cpf.substring(0, 9);
            int soma_Cpf = 0;
            int digito_1;
            int digito_2;
            int aux = 0;

            int digito_Verificador = (int) Integer.valueOf(cpf.substring(9));

            for (int i = 1; i < cpf_Pessoa.length() + 1; i++) {
                soma_Cpf += Integer.valueOf(cpf_Pessoa.substring(i - 1, i)).intValue() * i;
            }

            digito_1 = soma_Cpf % 11;
            cpf_Pessoa += Integer.toString(digito_1);

            soma_Cpf = 0;

            for (int i = 1; i < cpf_Pessoa.length() + 1; i++) {
                soma_Cpf += Integer.valueOf(cpf_Pessoa.substring(i - 1, i)).intValue() * aux;
                aux++;
            }

            digito_2 = soma_Cpf % 11;

            if ((digito_Verificador / 10 == digito_1) && (digito_Verificador % 10 == digito_2)) {
                this.cpf = cpf;
                return true;
            } else {
                return false;
            }
        }
    }

    public String get_CPF() {
        return (this.cpf);
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

    public void set_Sexo(String sexo) {
        this.sexo = sexo;
    }

    public String get_Sexo() {
        return (this.sexo);
    }

    public void set_Estado_Civil(String estado_Civil) {
        this.estado_Civil = estado_Civil;
    }

    public String get_Estado_Civil() {
        return (this.estado_Civil);
    }

    public void set_Data_De_Nascimento(Date data_De_Nascimento) {
        this.data_De_Nascimento = data_De_Nascimento;
    }

    public Date get_Data_De_Nascimento() {
        return (this.data_De_Nascimento);
    }

    public void set_Nome_Da_Mae(String nome_Da_Mae) {
        this.nome_Da_Mae = nome_Da_Mae;
    }

    public String get_Nome_Da_Mae() {
        return (this.nome_Da_Mae);
    }
}
