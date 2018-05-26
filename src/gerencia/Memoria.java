package gerencia;

public class Memoria {
    
    private final Quadro[] quadros;
    
    public Memoria(int tamanho){
        
        quadros = new Quadro[tamanho];
        
        for(int i = 0; i < quadros.length; i++){
        
            Quadro q = new Quadro();            
            q.setIdQuadro(i);
            
            quadros[i] = q;
        }
    }
    
    public Quadro getQuadro(){
        for(int i = 0; i < quadros.length; i++){
            if(!quadros[i].getEstado()){
                quadros[i].setEstado(true);
                return quadros[i];
            }
        }
        return null;
    }
    
    public void LiberaQuadro(int i){
        quadros[i].setEstado(false);
    }
            
    
    
}