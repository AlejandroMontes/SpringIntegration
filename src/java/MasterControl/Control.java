/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterControl;

import dao.Producto;
import dataSource.DataSourceImpl;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Alejandro.Montes
 */
public class Control {
private List list = new ArrayList();

public List busquedaAlimenos(String bebida, String comida) {
     DataSourceImpl listas = new DataSourceImpl();
     List lista = listas.todoListas();
     busqueda(lista, bebida);
     busqueda(lista, comida);
     return list;
   }
public void busqueda(List lista, String objeto){
 Object x;
 Producto bd = new Producto();
 for (int i = 0; i < lista.size(); ++i) {
            x = lista.get(i);
            Producto r = (Producto) x;
            if (r.getNombre().equals(objeto)) {
                bd = new Producto(r.getNombre(), r.getProveedor(), r.getCosto());
                list.add(bd);
            }
        }
}

}