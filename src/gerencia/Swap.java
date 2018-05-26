/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerencia;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fernandes
 */
public class Swap {
    
    ArrayList<Integer> paginas = new ArrayList<>();
    
    
    public Swap()
    {
    
    }
    
    /*public void addPg(Pagina p)
    {
        int i;
        for(i = 0; i < paginas.size(); i++)
        {
            if(paginas.get(i).getIdPagina() == p.getIdPagina())
                break;
        }
        if(i == paginas.size())
            paginas.add(p);
    }*/
    
    public void addPg(int valor)
    {
        int i;
        for(i = 0; i < paginas.size(); i++)
        {
            if(paginas.get(i) == valor)
                break;
        }
        if(i == paginas.size())
            paginas.add(valor);
    }
    
    public Pagina getPg(Pagina p)
    {
        for(int i = 0; i < paginas.size(); i++)
        {
            if(paginas.get(i) == p.getIdPagina())
                return p;
        }
        return null;
    }
    
    public void removePg(Pagina p, DefaultTableModel tabelaSwap)
    {
        for(int i = 0; i < paginas.size(); i++)
        {
            if(paginas.get(i) == p.getIdPagina())
            {
               tabelaSwap.removeRow(i);
               paginas.remove(i);
            }
               
        }
    }
    
    public void limpa()
    {
        paginas.clear();
    }
   
}
