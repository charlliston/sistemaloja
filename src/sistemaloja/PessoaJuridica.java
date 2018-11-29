package sistemaloja;

import java.util.Date;

public abstract class PessoaJuridica implements LojaI {

    String cnpj;
    Endereco endereco;
    String telefone;
    
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
    
  

    //metodos de acesso as variáveis acima
    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCNPJ() {
        return (this.cnpj);
    }



    @Override
    public void emitirNF() {
        
    }
}
