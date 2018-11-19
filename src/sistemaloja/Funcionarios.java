package sistemaloja;

import java.util.Date;

public class Funcionarios extends PessoaFisica {
    String codigoFunc;
    String cargo;
    double salario;
    String dataAdm;
    String email;
    
    public Funcionarios ( String codigoFun, String cargo, double salario, String rg, String cpf, Endereco endereco, 
    		String telefone, String sexo, String estadoCivil, String dataDeNascimento, String email    		) {
    	this.codigoFunc = codigoFun;
    	this.cargo = cargo;
    	this.salario = salario;

    	this.rg = rg;
    	this.cpf = cpf;
    	this.endereco = endereco;
    	this.telefone = telefone;
    	this.sexo = sexo;
    	this.estadoCivil = estadoCivil;
    	this.dataDeNascimento = dataDeNascimento;
    	this.email = email;
    }
    
    public String getCodigoFun() {
    	return codigoFunc;
    }
    
    public void setSalario(double salario) {
    	this.salario = salario;
    }
    
    public double getSalario() {
    	return salario;
    }
    
    
    public String getDataAdm() {
    	return dataAdm;
    }
    
    
    
    public void cadastrarProd() {
        
    }
    
    public void excluirProd() {
        
    }
}
