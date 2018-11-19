package sistemaloja;

import java.util.Date;

public abstract class PessoaFisica implements LojaI {

     String rg;
     String cpf;
     Endereco endereco;
     String telefone;
     String sexo;
     String estadoCivil;
     String dataDeNascimento;


    //metodos de acesso as variáveis acima
    public void setRG(String rg) {
        this.rg = rg;
    }

    public String getRG() {
        return (this.rg);
    }

    public boolean setCPF(String cpf) {
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

    public String getCPF() {
        return (this.cpf);
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return (this.endereco);
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return (this.telefone);
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return (this.sexo);
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCivil() {
        return (this.estadoCivil);
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getDataDeNascimento() {
        return (this.dataDeNascimento);
    }

    @Override
    public void comprar() {
        
    }
    
    @Override
    public void vender() {
        
    }

    @Override
    public void emitirNF() {
        
    }
}
