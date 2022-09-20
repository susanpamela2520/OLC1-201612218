
package arbol;
import java.util.ArrayList;


public class Nodo {
    
    public String Etiqueta;
    public ArrayList<Nodo> hijos = new ArrayList <>();  //arreglo de hijos
    public String valor;  //valor de cada nodo 
    public int Id;    //identificador de cada nodo 

    public String getEtiqueta() {
        return Etiqueta;
    }

    public void setEtiqueta(String Etiqueta) {
        this.Etiqueta = Etiqueta;
    }

    public  void AddHijos (Nodo hijo) {
        hijos.add(hijo);
    }
    public ArrayList<Nodo> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Nodo> hijos) {
        this.hijos = hijos;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    
};
