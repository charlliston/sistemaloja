package sistemaloja;

import java.util.Date;

public class PessoaJuridica implements LojaI {

    private String cnpj;


    public PessoaJuridica() {

    }

    //metodos de acesso as variáveis acima
    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCNPJ() {
        return (this.cnpj);
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
