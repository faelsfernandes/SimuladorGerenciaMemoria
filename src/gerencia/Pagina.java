package gerencia;

public class Pagina {
    
    private int idPagina;
    private final int tamanho = 4; //4KB
 
    public void setIdPagina(int id){
        idPagina = id;
    }
    
    public int getIdPagina(){
        return idPagina;
    }
    
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString(){
        return "PG " + idPagina;
    }
    
}
