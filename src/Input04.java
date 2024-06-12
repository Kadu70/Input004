import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.err;
import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        
          Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        //Edit these lines to advance the scanner
        sc.nextLine();
        System.out.println(sc.nextLine());
        //endereço do arquivo
        String url = "C:\\Users\\ALUNO\\Documents\\NetBeansProjects\\Carlos Eduardo Castro Pinheiro\\Input04\\src\\";
        //nome do arquivo
        String fileName = url +"input04text.txt";
        //area que pode conter erros (excessao)
        //abre um arquivo
        try (BufferedReader br = new BufferedReader (new FileReader (fileName))){
            String line;// variavel para linha
            //enquando a line não chegar no final do arquivo 
            //fica lendo um linha por vez
            while ((line = br.readLine())!=null){
                //se a linha contiver a palavra chave
                if (line.contains ("BlueBumper")){
                    //divide a linha usando como delimitador o espaço em brnaco
                    String[] parts = line.split("\\s+");
                    //pega o 4 valor
                    int xPositon = Integer.parseInt(parts[3]);
                    //pega o 5 valor
                    int yPositon = Integer.parseInt(parts[4]);
                    //exibe os valores encontrado
                    System.out.println("Coordenadas do BlueBumper : xPositon = " + xPositon + ", yPositon = " + yPositon);
                    break; //finaliza o loop (while)
                }
            }
        }catch (IOException e){ //caso tenha erro de IO
            //mostra a mensagem de erro
        System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        
        
    }
        
        
        //Does this line contain "BlueBumper"?
        System.out.println(sc.findInLine("BlueBumper"));
        //Store the next two numbers as xPosition and yPosition
        //Print these positions
      
          System.out.println(sc.nextLine());
          System.out.println(sc.findInLine("BlueBumper"));
          System.out.println(" X: "        +", Y: "        );
          System.out.println(sc.nextLine());
          sc.close();
    }    
}
