/*
 * LICENSE: GPLv3
 * https://www.gnu.org/licenses/gpl-3.0.pt-br.html
 */

/*
 * Nota;
 * Se já tiver executado este programa anteriormente,
 * delete os arquivos posteriormente criados.
 * Pois a função utilizada irá escrever continuamente no arquivo
 */ 
package hardware;

/*
 *
 * @author
 * Davi, Brenno, Caio, Eduardo Vantini e Guilherme
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class foo {
    
    public static int countsWord[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static List<String[]> col = new ArrayList();
    public static int lineNumber = 0;
    static int time1 = 0;
    static int time2 = 0;
    static int time3 = 0;
    
    
    public static void main(String[] args) throws FileNotFoundException, InterruptedException, IOException{
        
        HardwareInfo.GetAll();
        
        readCSV();
    }
        
    public static void readCSV() throws FileNotFoundException, InterruptedException, IOException{
        /*************************************LEITURA**********************************************/
        //iniciando contagem para leitura dos arquivos;
        long start = System.currentTimeMillis();

        
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\bianc\\Desktop\\Faculdade\\Interdisciplinares01.2021\\SO e OC\\src\\main\\java\\hardware\\dataset_00_sem_virg.csv"));
        
        // Batch size = quantidade de linhas a serem carregadas na memória por vez
        int batchSize = 100000;
        String line = "";
        String cvsSplitBy = ",";
        long totalprocessing = 0;
        
        //Evitar que leia as linhas de cabeçalho
        line = br.readLine(); 
        long elapsed1 = System.currentTimeMillis();
        try {
            while ((line = br.readLine()) != null) { //Leitura linha a linha dos dados do .csv
                String[] colsCSV = line.split(cvsSplitBy);
                col.add(colsCSV);
                lineNumber++;
                if (lineNumber == batchSize-1){
                    /*************************************PROCESSAMENTO***************************************************/
                    //contagem para o processamento dos arquivos;
                    long startprocessing = System.currentTimeMillis();
                    
                    Threadzim threadColumn = new Threadzim();
                    threadColumn.start();
                    long start3 = System.currentTimeMillis();
                    threadColumn.join();
                    writeArqs();
                    //zerando a contagem de linhas, para que sempre seja == batchSize-1
                    lineNumber = 0;
                    //zerando a matriz de strings para que não lote nossa sofrida memória!
                    col.clear();
                    time3 += System.currentTimeMillis() - start3;
                    //contagem para o processamento dos arquivos
                    totalprocessing += System.currentTimeMillis() - startprocessing;
          
                    /*************************************PROCESSAMENTO_FIM**********************************************/
                }
            }
            time1 += System.currentTimeMillis() - elapsed1;
            System.out.println("\nProcessamento completo! ");
            br.close();
            br = null;
        } catch (IOException e) {
            System.out.println("\nException caught: " + e.getMessage());   // Catch any exception here
        }
        
        /*************************************LEITURA_FIM**********************************************/
        System.out.println("TEMPO DE EXECUÇÃO (LEITURA): "+ (time1)/1000d +" s");
        System.out.println("TEMPO DE EXECUÇÃO (PROCESSAMENTO): "+ time2/1000d +" s");
        System.out.println("TEMPO DE EXECUÇÃO (GRAVAÇÃO): "+ time3/1000d +" s");
        
        /***********IMPRIME NO CSV A QUANTIDADE TOTAL DE LINHAS***********/
        /**************************************************************************************************************/
                    
            FileWriter fw = new FileWriter(file0, true);
            BufferedWriter conexao = new BufferedWriter(fw); 
                conexao.write(countsWord[0]);
                conexao.newLine();
            conexao.close();

           /**************************************************************************************************************/
            FileWriter fw1 = new FileWriter(file1, true);
            BufferedWriter conexao1 = new BufferedWriter(fw1);
                conexao1.write(countsWord[1]);
                conexao1.newLine();
            conexao1.close();
            /**************************************************************************************************************/
            FileWriter fw2 = new FileWriter(file2, true);
            BufferedWriter conexao2 = new BufferedWriter(fw2);
                conexao2.write(countsWord[2]);
                conexao2.newLine();
            conexao2.close();

            /**************************************************************************************************************/
            FileWriter fw3 = new FileWriter(file3, true);
            BufferedWriter conexao3 = new BufferedWriter(fw3);
                conexao3.write(countsWord[3]);
                conexao3.newLine();
            conexao3.close();

           /**************************************************************************************************************/
            FileWriter fw4 = new FileWriter(file4, true);
            BufferedWriter conexao4 = new BufferedWriter(fw4);
                conexao4.write(countsWord[4]);
                conexao4.newLine();
            conexao4.close();

           /**************************************************************************************************************/
            FileWriter fw5 = new FileWriter(file5, true);
            BufferedWriter conexao5 = new BufferedWriter(fw5);
                conexao5.write(countsWord[5]);
                conexao5.newLine();
            conexao5.close();

           /**************************************************************************************************************/
            FileWriter fw6 = new FileWriter(file6, true);
            BufferedWriter conexao6 = new BufferedWriter(fw6);
                conexao6.write(countsWord[6]);
                conexao6.newLine();
            conexao6.close();

           /**************************************************************************************************************/
            FileWriter fw7 = new FileWriter(file7, true);
            BufferedWriter conexao7 = new BufferedWriter(fw7);
                conexao7.write(countsWord[7]);
                conexao7.newLine();
            conexao7.close();

           /**************************************************************************************************************/
            FileWriter fw8 = new FileWriter(file8, true);
            BufferedWriter conexao8 = new BufferedWriter(fw8);
                conexao8.write(countsWord[8]);
                conexao8.newLine();
            conexao8.close();

           /**************************************************************************************************************/
            FileWriter fw9 = new FileWriter(file9, true);
            BufferedWriter conexao9 = new BufferedWriter(fw9);  
                conexao9.write(countsWord[9]);
                conexao9.newLine();
            conexao9.close();

           /**************************************************************************************************************/
            FileWriter fw10 = new FileWriter(file10, true);
            BufferedWriter conexao10 = new BufferedWriter(fw10); 
                conexao10.write(countsWord[10]);
                conexao10.newLine();
            conexao10.close();

           /**************************************************************************************************************/
            FileWriter fw11 = new FileWriter(file11, true);
            BufferedWriter conexao11 = new BufferedWriter(fw11);
                conexao11.write(countsWord[11]);
                conexao11.newLine();
            conexao11.close();

           /**************************************************************************************************************/
            FileWriter fw12 = new FileWriter(file12, true);
            BufferedWriter conexao12 = new BufferedWriter(fw12);
                conexao12.write(countsWord[12]);
                conexao12.newLine();
            conexao12.close();

           /**************************************************************************************************************/
            FileWriter fw13 = new FileWriter(file13, true);
            BufferedWriter conexao13 = new BufferedWriter(fw13);  
                conexao13.write(countsWord[13]);
                conexao13.newLine();
            conexao13.close();

           /**************************************************************************************************************/
            FileWriter fw14 = new FileWriter(file14, true);
            BufferedWriter conexao14 = new BufferedWriter(fw14); 
                conexao14.write(countsWord[14]);
                conexao14.newLine();
            conexao14.close();

           /**************************************************************************************************************/
            FileWriter fw15 = new FileWriter(file15, true);
            BufferedWriter conexao15 = new BufferedWriter(fw15); 
                conexao15.write(countsWord[15]);
                conexao15.newLine();
            conexao15.close();

           /**************************************************************************************************************/
            FileWriter fw16 = new FileWriter(file16, true);
            BufferedWriter conexao16 = new BufferedWriter(fw16);
                conexao16.write(countsWord[16]);
                conexao16.newLine();
            conexao16.close();

           /**************************************************************************************************************/
            FileWriter fw17 = new FileWriter(file17, true);
            BufferedWriter conexao17 = new BufferedWriter(fw17); 
                conexao17.write(countsWord[17]);
                conexao17.newLine();
            conexao17.close();

           /**************************************************************************************************************/
            FileWriter fw18 = new FileWriter(file18, true);
            BufferedWriter conexao18 = new BufferedWriter(fw18); 
                conexao18.write(countsWord[18]);
                conexao18.newLine();
            conexao18.close();

           /**************************************************************************************************************/
            FileWriter fw19 = new FileWriter(file19, true);
            BufferedWriter conexao19 = new BufferedWriter(fw19);
                conexao19.write(countsWord[19]);
                conexao19.newLine();
            conexao19.close();

           /**************************************************************************************************************/
            FileWriter fw20 = new FileWriter(file20, true);
            BufferedWriter conexao20 = new BufferedWriter(fw20);
                conexao20.write(countsWord[20]);
                conexao20.newLine();
            conexao20.close();

           /**************************************************************************************************************/
            FileWriter fw21 = new FileWriter(file21, true);
            BufferedWriter conexao21 = new BufferedWriter(fw21); 
                conexao21.write(countsWord[21]);
                conexao21.newLine();
            conexao21.close();

           /**************************************************************************************************************/
            FileWriter fw22 = new FileWriter(file22, true);
            BufferedWriter conexao22 = new BufferedWriter(fw22);  
                conexao22.write(countsWord[22]);
                conexao22.newLine();
            conexao22.close();

           /**************************************************************************************************************/
            FileWriter fw23 = new FileWriter(file23, true);
            BufferedWriter conexao23 = new BufferedWriter(fw23);
                conexao23.write(countsWord[23]);
                conexao23.newLine();
            conexao23.close();

           /**************************************************************************************************************/
            FileWriter fw24 = new FileWriter(file24, true);
            BufferedWriter conexao24 = new BufferedWriter(fw24);
                conexao24.write(countsWord[24]);
                conexao24.newLine();   
            conexao24.close();
            
            /**************************************************************************************************************/
            FileWriter fw25 = new FileWriter(file25, true);
            BufferedWriter conexao25 = new BufferedWriter(fw25);
                conexao25.write(countsWord[25]);
                conexao25.newLine();           
            conexao25.close();
            
           /**************************************************************************************************************/

    }

    public static class Threadzim extends Thread{
        //Utilizado a interface Runnable, porém sem sucesso.
        @Override
        public void run() {
            long start = System.currentTimeMillis();
            for(int i = 0; i < lineNumber; i++){
                for(int j = 0; j < 26; j++){
                    boolean integerOrNot = col.get(i)[j].matches("^\\d+$");
                    if (integerOrNot == false){
                        countsWord[j] += 1;
                    }
                }
            }
            long elapsed = System.currentTimeMillis() - start;
            time2 += elapsed;
        }
    };
    
    
    
    
    
    
    private static String[] arqName = {"idatracacao.txt","cdtup.txt","berco.txt","portoatracacao.txt","ano.txt","mes.txt","tipooperacao.txt","tiponavegacaoatracacao.txt",
                                       "terminal.txt","nacionalidadearmador.txt","tesperaatracacao.txt","tesperacainicioop.txt","toperacao.txt","tesperadesatracacao.txt","tatracado.txt",
                                       "testadia.txt","idcarga.txt", "origem.txt","destino.txt","cdmercadoria.txt","naturezacarga.txt","qtcarga.txt","pesocargabruta.txt","sentido.txt",
                                       "cdmercadoria_cntr.txt","pesocarga_cntr.txt"};

    static File file0 = new File("idatracacao.txt");
    static File file1 = new File("cdtup.txt");
    static File file2 = new File("berco.txt");
    static File file3 = new File("portoatracacao.txt");
    static File file4 = new File("ano.txt");
    static File file5 = new File("mes.txt");
    static File file6 = new File("tipooperacao.txt");
    static File file7 = new File("tiponavegacaoatracacao.txt");
    static File file8 = new File("terminal.txt");
    static File file9 = new File("nacionalidadearmador.txt");
    static File file10 = new File("tesperaatracacao.txt");
    static File file11 = new File("tesperacainicioop.txt");
    static File file12 = new File("toperacao.txt");
    static File file13 = new File("tesperadesatracacao.txt");
    static File file14 = new File("tatracado.txt");
    static File file15 = new File("testadia.txt");
    static File file16 = new File("idcarga.txt");
    static File file17 = new File("origem.txt");
    static File file18 = new File("destino.txt");
    static File file19 = new File("cdmercadoria.txt");
    static File file20 = new File("naturezacarga.txt");
    static File file21 = new File("qtcarga.txt");
    static File file22 = new File("pesocargabruta.txt");
    static File file23 = new File("sentido.txt");
    static File file24 = new File("cdmercadoria_cntr.txt");
    static File file25 = new File("pesocarga_cntr.txt");
    
public static void writeArqs() throws FileNotFoundException, IOException{
                
                //gravação dos arqivos no disco;
                
                
                /*****************************************************/
                /******************Infelizmente terá de ser um a um, pois não há template strings no java :(***********************************/
                File file0 = new File(arqName[0]);
                File file1 = new File(arqName[1]);
                File file2 = new File(arqName[2]);
                File file3 = new File(arqName[3]);
                File file4 = new File(arqName[4]);
                File file5 = new File(arqName[5]);
                File file6 = new File(arqName[6]);
                File file7 = new File(arqName[7]);
                File file8 = new File(arqName[8]);
                File file9 = new File(arqName[9]);
                File file10 = new File(arqName[10]);
                File file11 = new File(arqName[11]);
                File file12 = new File(arqName[12]);
                File file13 = new File(arqName[13]);
                File file14 = new File(arqName[14]);
                File file15 = new File(arqName[15]);
                File file16 = new File(arqName[16]);
                File file17 = new File(arqName[17]);
                File file18 = new File(arqName[18]);
                File file19 = new File(arqName[19]);
                File file20 = new File(arqName[20]);
                File file21 = new File(arqName[21]);
                File file22 = new File(arqName[22]);
                File file23 = new File(arqName[23]);
                File file24 = new File(arqName[24]);
                File file25 = new File(arqName[25]);

        /**************************************************************************************************************/
                    
            FileWriter fw = new FileWriter(file0, true);
            BufferedWriter conexao = new BufferedWriter(fw);
            for(int i = 0; i < lineNumber; i++){   
                conexao.write(col.get(i)[0]);
                conexao.newLine();
            }
            conexao.close();

           /**************************************************************************************************************/
            FileWriter fw1 = new FileWriter(file1, true);
            BufferedWriter conexao1 = new BufferedWriter(fw1);
            for(int i = 0; i < lineNumber; i++){   
                conexao1.write(col.get(i)[1]);
                conexao1.newLine();
            }
            conexao1.close();
            /**************************************************************************************************************/
            FileWriter fw2 = new FileWriter(file2, true);
            BufferedWriter conexao2 = new BufferedWriter(fw2);
            for(int i = 0; i < lineNumber; i++){   
                conexao2.write(col.get(i)[2]);
                conexao2.newLine();
            }
            conexao2.close();

            /**************************************************************************************************************/
            FileWriter fw3 = new FileWriter(file3, true);
            BufferedWriter conexao3 = new BufferedWriter(fw3);
            for(int i = 0; i < lineNumber; i++){   
                conexao3.write(col.get(i)[3]);
                conexao3.newLine();
            }
            conexao3.close();

           /**************************************************************************************************************/
            FileWriter fw4 = new FileWriter(file4, true);
            BufferedWriter conexao4 = new BufferedWriter(fw4);
            for(int i = 0; i < lineNumber; i++){   
                conexao4.write(col.get(i)[4]);
                conexao4.newLine();
            }
            conexao4.close();

           /**************************************************************************************************************/
            FileWriter fw5 = new FileWriter(file5, true);
            BufferedWriter conexao5 = new BufferedWriter(fw5);
            for(int i = 0; i < lineNumber; i++){   
                conexao5.write(col.get(i)[5]);
                conexao5.newLine();
            }
            conexao5.close();

           /**************************************************************************************************************/
            FileWriter fw6 = new FileWriter(file6, true);
            BufferedWriter conexao6 = new BufferedWriter(fw6);
            for(int i = 0; i < lineNumber; i++){   
                conexao6.write(col.get(i)[6]);
                conexao6.newLine();
            }
            conexao6.close();

           /**************************************************************************************************************/
            FileWriter fw7 = new FileWriter(file7, true);
            BufferedWriter conexao7 = new BufferedWriter(fw7);
            for(int i = 0; i < lineNumber; i++){   
                conexao7.write(col.get(i)[7]);
                conexao7.newLine();
            }
            conexao7.close();

           /**************************************************************************************************************/
            FileWriter fw8 = new FileWriter(file8, true);
            BufferedWriter conexao8 = new BufferedWriter(fw8);
            for(int i = 0; i < lineNumber; i++){   
                conexao8.write(col.get(i)[8]);
                conexao8.newLine();
            }
            conexao8.close();

           /**************************************************************************************************************/
            FileWriter fw9 = new FileWriter(file9, true);
            BufferedWriter conexao9 = new BufferedWriter(fw9);
            for(int i = 0; i < lineNumber; i++){   
                conexao9.write(col.get(i)[9]);
                conexao9.newLine();
            }
            conexao9.close();

           /**************************************************************************************************************/
            FileWriter fw10 = new FileWriter(file10, true);
            BufferedWriter conexao10 = new BufferedWriter(fw10);
            for(int i = 0; i < lineNumber; i++){   
                conexao10.write(col.get(i)[10]);
                conexao10.newLine();
            }
            conexao10.close();

           /**************************************************************************************************************/
            FileWriter fw11 = new FileWriter(file11, true);
            BufferedWriter conexao11 = new BufferedWriter(fw11);
            for(int i = 0; i < lineNumber; i++){   
                conexao11.write(col.get(i)[11]);
                conexao11.newLine();
            }
            conexao11.close();

           /**************************************************************************************************************/
            FileWriter fw12 = new FileWriter(file12, true);
            BufferedWriter conexao12 = new BufferedWriter(fw12);
            for(int i = 0; i < lineNumber; i++){   
                conexao12.write(col.get(i)[12]);
                conexao12.newLine();
            }
            conexao12.close();

           /**************************************************************************************************************/
            FileWriter fw13 = new FileWriter(file13, true);
            BufferedWriter conexao13 = new BufferedWriter(fw13);
            for(int i = 0; i < lineNumber; i++){   
                conexao13.write(col.get(i)[13]);
                conexao13.newLine();
            }
            conexao13.close();

           /**************************************************************************************************************/
            FileWriter fw14 = new FileWriter(file14, true);
            BufferedWriter conexao14 = new BufferedWriter(fw14);
            for(int i = 0; i < lineNumber; i++){   
                conexao14.write(col.get(i)[14]);
                conexao14.newLine();
            }
            conexao14.close();

           /**************************************************************************************************************/
            FileWriter fw15 = new FileWriter(file15, true);
            BufferedWriter conexao15 = new BufferedWriter(fw15);
            for(int i = 0; i < lineNumber; i++){   
                conexao15.write(col.get(i)[15]);
                conexao15.newLine();
            }
            conexao15.close();

           /**************************************************************************************************************/
            FileWriter fw16 = new FileWriter(file16, true);
            BufferedWriter conexao16 = new BufferedWriter(fw16);
            for(int i = 0; i < lineNumber; i++){   
                conexao16.write(col.get(i)[16]);
                conexao16.newLine();
            }
            conexao16.close();

           /**************************************************************************************************************/
            FileWriter fw17 = new FileWriter(file17, true);
            BufferedWriter conexao17 = new BufferedWriter(fw17);
            for(int i = 0; i < lineNumber; i++){   
                conexao17.write(col.get(i)[17]);
                conexao17.newLine();
            }
            conexao17.close();

           /**************************************************************************************************************/
            FileWriter fw18 = new FileWriter(file18, true);
            BufferedWriter conexao18 = new BufferedWriter(fw18);
            for(int i = 0; i < lineNumber; i++){   
                conexao18.write(col.get(i)[18]);
                conexao18.newLine();
            }
            conexao18.close();

           /**************************************************************************************************************/
            FileWriter fw19 = new FileWriter(file19, true);
            BufferedWriter conexao19 = new BufferedWriter(fw19);
            for(int i = 0; i < lineNumber; i++){   
                conexao19.write(col.get(i)[19]);
                conexao19.newLine();
            }
            conexao19.close();

           /**************************************************************************************************************/
            FileWriter fw20 = new FileWriter(file20, true);
            BufferedWriter conexao20 = new BufferedWriter(fw20);
            for(int i = 0; i < lineNumber; i++){   
                conexao20.write(col.get(i)[20]);
                conexao20.newLine();
            }
            conexao20.close();

           /**************************************************************************************************************/
            FileWriter fw21 = new FileWriter(file21, true);
            BufferedWriter conexao21 = new BufferedWriter(fw21);
            for(int i = 0; i < lineNumber; i++){   
                conexao21.write(col.get(i)[21]);
                conexao21.newLine();
            }
            conexao21.close();

           /**************************************************************************************************************/
            FileWriter fw22 = new FileWriter(file22, true);
            BufferedWriter conexao22 = new BufferedWriter(fw22);
            for(int i = 0; i < lineNumber; i++){   
                conexao22.write(col.get(i)[22]);
                conexao22.newLine();
            }
            conexao22.close();

           /**************************************************************************************************************/
            FileWriter fw23 = new FileWriter(file23, true);
            BufferedWriter conexao23 = new BufferedWriter(fw23);
            for(int i = 0; i < lineNumber; i++){   
                conexao23.write(col.get(i)[23]);
                conexao23.newLine();
            }
            conexao23.close();

           /**************************************************************************************************************/
            FileWriter fw24 = new FileWriter(file24, true);
            BufferedWriter conexao24 = new BufferedWriter(fw24);
            for(int i = 0; i < lineNumber; i++){   
                conexao24.write(col.get(i)[24]);
                conexao24.newLine();
            }
            conexao24.close();
            
            /**************************************************************************************************************/
            FileWriter fw25 = new FileWriter(file25, true);
            BufferedWriter conexao25 = new BufferedWriter(fw25);
            for(int i = 0; i < lineNumber; i++){   
                conexao25.write(col.get(i)[25]);
                conexao25.newLine();
            }
            conexao25.close();
            
           /**************************************************************************************************************/
       }
}