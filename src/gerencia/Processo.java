package gerencia;

import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Random;

public class Processo {
    //private static final int limite = 1000;
    private int idProcesso;
    private int tDuracao; 
    private int qtPaginas;
    private int tChegada;
    public static int seqPg = 0;
    //private static int variacao = 0;
    public boolean acabou = false;
    private int indSeq = 0;
    private Pagina[] paginas;
    private Pagina[] sequencia;
    private Random random = new Random();
    //pageTable tabela = new pageTable();
    
    public Processo(int idProcesso){  
        int tamanho = random.nextInt(24)+1;
        
        if(tamanho % 4 == 0)
            qtPaginas = tamanho / 4;
        else
            qtPaginas = (tamanho / 4)+1;        
        
        paginas = new Pagina[qtPaginas];
        
        for(int i = 0; i < qtPaginas; i++){
            Pagina p = new Pagina();
            p.setIdPagina(seqPg);
            paginas[i] = p;
            seqPg++;
        }
                
        this.tDuracao = qtPaginas + random.nextInt(4);
        sequencia = new Pagina[tDuracao];
        
        for(int i = 0; i < tDuracao; i++){
            int x = random.nextInt(qtPaginas);
            sequencia[i] = paginas[x];
        }
        
        //garantir que tenha pelo menos um vez de cada
        for(int i = 0; i < qtPaginas; i++){
            //int x = random.nextInt(qtPaginas);
            sequencia[i] = paginas[i];
        }
        
        this.idProcesso = idProcesso;
    }
    
    public int getIdProcesso() {
        return idProcesso;
    }
    
    public int getDuracao() {
        return tDuracao;
    }
    
    public void setIdPg(int indice, int valor)
    {
        sequencia[indice].setIdPagina(valor);
    }
    
    public void setIndice(int valor)
    {
        indSeq = valor;
    }
   
    public void setAcabou(boolean valor)
    {
        acabou = valor;
    }
    public Pagina[] getPaginas(){
        return sequencia;
    }
    
    public void incrementaIndice()
    {
        indSeq++;
    }
    
    public int getIndice()
    {
        return indSeq;
    }
    
    @Override
    public String toString(){
        String a = "Processo " + idProcesso + "\tDuracao " + tDuracao + "\n";
        for(int i = 0; i < paginas.length; i++){
           a = a + paginas[i].toString()+ " ";   
        }
        
        a = a + "\n"; 
        
        for(int i = 0; i < sequencia.length; i++){
            a = a + sequencia[i].toString() + " ";
        }
        
        return a;
    }
    
}