package sistemaloja;

import java.util.Date;

public abstract class PessoaJuridica implements LojaI {

    String cnpj;



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
