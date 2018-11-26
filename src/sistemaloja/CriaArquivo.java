package sistemaloja;

    
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


  public class CriaArquivo {
    
    // serialização: gravando o textos no arquivo
    public static <E> void gravarArquivo(ArrayList<E> texto, String nomeArquivo) {
      File arquivo = new File(nomeArquivo);
      try {
        arquivo.delete();
        arquivo.createNewFile();
    
        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arquivo));
        objOutput.writeObject(texto);
        objOutput.close();
    
      } catch(IOException erro) {
          System.out.printf("Erro: %s", erro.getMessage());
      }
    }
    
    // desserialização: recuperando os textos gravados no arquivo
    public static <E> ArrayList<E> lerArquivo(String nomeArquivo) {
      ArrayList<E> texto = new ArrayList();
      try {
        File arquivo = new File(nomeArquivo);
        if (arquivo.exists()) {
           ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arquivo));
           texto = (ArrayList<E>)objInput.readObject();
           objInput.close();
        }
      } catch(IOException erro1) {
          System.out.printf("Erro: %s", erro1.getMessage());
      } catch(ClassNotFoundException erro2) {
          System.out.printf("Erro: %s", erro2.getMessage());
      }
    
      return(texto);
    }
    
    public static <E> void criaObjetosFunc(String nomearquivo) {
    	ArrayList<E> arquivo = new ArrayList<E>();
    	arquivo = lerArquivo(nomearquivo);
    	ArrayList<String> infoArquivo = new ArrayList<String>();
    	ArrayList<Funcionarios> todosFunc = new ArrayList<Funcionarios>();
    	for (int i=0; i < arquivo.size(); i++) {
    		infoArquivo = (ArrayList<String>) arquivo.get(i);
    		Endereco enderecoFunc = new Endereco(infoArquivo.get(0), infoArquivo.get(1), infoArquivo.get(2), infoArquivo.get(3), infoArquivo.get(4), infoArquivo.get(5)); 
    		Funcionarios Func = new Funcionarios(infoArquivo.get(6), infoArquivo.get(7), Double.parseDouble(infoArquivo.get(8)), infoArquivo.get(9), infoArquivo.get(10), enderecoFunc, 
    			infoArquivo.get(11),infoArquivo.get(12), infoArquivo.get(13), infoArquivo.get(14), infoArquivo.get(15));
    		todosFunc.add(Func);
    	}
    	
    }
    
  }
