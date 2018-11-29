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
    public static void gravarArquivo(Object objeto, String nomeArquivo) throws ClassNotFoundException {
      File arquivo = new File(nomeArquivo);
     
      ArrayList<Object> Historico = new ArrayList<Object>();
     
      try {
    	 if (arquivo.exists()) {
              ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arquivo));
              Historico = (ArrayList<Object>)objInput.readObject();
              System.out.println(Historico);
           }
    	 else {
    		 arquivo.delete();
    		 arquivo.createNewFile();
    	 }
    	Historico.add(objeto);
    	System.out.println(Historico);
    	ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arquivo));
        objOutput.writeObject(Historico);
        objOutput.close();
      }
    
        catch(IOException erro) {
          System.out.printf("Erro: %s", erro.getMessage());
      }

    }
    
    // desserialização: recuperando os textos gravados no arquivo
    public static   ArrayList<Object> lerArquivo(String nomeArquivo) {
        ArrayList<Object> lista = new ArrayList<Object>();
      try {
        File arquivo = new File(nomeArquivo);
        if (arquivo.exists()) {
           ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arquivo));
           lista = (ArrayList<Object>) objInput.readObject();
           objInput.close();
        }
      } catch(IOException erro1) {
          System.out.printf("Erro: %s", erro1.getMessage());
      } catch(ClassNotFoundException erro2) {
          System.out.printf("Erro: %s", erro2.getMessage());
      }
    
      return(lista);
    }
    
    


    
    
  }