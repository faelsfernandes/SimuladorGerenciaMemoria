package gerencia;

public class Quadro {

    private int idQuadro;
    private boolean estado = false;
    private final int tamanho = 4; // 4KB 

    public void setIdQuadro(int id){
        idQuadro = id;
    }
    
    public int getTamanho() {
        return tamanho;
    }
 
    public int getIdQuadro(){
        return idQuadro;
    }
    
    @Override
    public String toString(){
       return "QD" + idQuadro;
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }
}
