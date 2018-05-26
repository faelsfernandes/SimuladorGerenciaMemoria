package gerencia;

public class PageTable {

    private int[] pg;
    private boolean[] validade;
    private int[] qd;
    private Memoria memoria;
    
    
    public PageTable(int tmv, int tmf){
        
        pg = new int[tmv];
        qd = new int[tmv];
        for(int i = 0; i < tmv; i++){
            pg[i] = -1;
            qd[i] = -1;
        }
        validade = new boolean[tmv];
        memoria = new Memoria(tmf);
    }
    
    public boolean put(Pagina p){
        
        boolean flag = false;
        
        for(int i = 0; i < pg.length; i++){
            if(p.getIdPagina() == pg[i]){
                flag = true;
            }
        }
        
        if(flag == false){
            for(int i = 0; i < pg.length; i++){
                if(validade[i] == false){
                    validade[i] = true;
                    pg[i] = p.getIdPagina();
                    qd[i] = memoria.getQuadro().getIdQuadro();
                    break;
                }
            }
        }
        return flag;
    }
    
    public void setPgIndice(int indice, int valor)
    {
        pg[indice] = valor;
    }
    public void liberaProc(Pagina p){
        
        for(int i = 0; i < pg.length; i++){
            if(p.getIdPagina() == pg[i]){
                
                memoria.LiberaQuadro(qd[i]);
                
                validade[i] = false;
                pg[i] = -1;
                qd[i] = -1;
                
            }
        } 
        
    }
    
    public void removePg(int indice)
    {                
        memoria.LiberaQuadro(qd[indice]);

        validade[indice] = false;
        pg[indice] = -1;
        qd[indice] = -1;            
     }
    
    public boolean estaCheia()
    {
        for(int i = 0; i < pg.length; i++)
        {
            if(pg[i] == -1)
                return false;
        }
        return true;
    }
 
    public int getPg(int i)
    {
        return pg[i];
    }
    
    public int getQd(int i)
    {
        return qd[i];
    }
    
    public int getPgTam()
    {
        return pg.length;
    }
    public void printTable(){
        
        System.out.println("----------------------------------------------");
        for(int i = 0; i < pg.length; i++){
            System.out.println(validade[i] + " " + pg[i] + " " + qd[i]);
        }
        
    }
    
    
}
