import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        
        String  path = "c:\\temp\\in.txt";

        FileReader fr = null;//serve para ler uma Streaming de dados
        BufferedReader br = null;//gerencia a mémoria usada para leitura

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr); //para otimizar a leitura

            String line = br.readLine();//para ler de linha em linha
            while (line != null) {//enquanto a linha não estiver nula
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();//para imprimir todo o caminho do erro
            }
            
        }
    }
}
