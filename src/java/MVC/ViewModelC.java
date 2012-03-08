/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import MasterControl.Control;
import dao.Producto;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModelArray;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.ListitemRenderer;
import org.zkoss.zul.Window;

/**
 *
 * @author Alejandro.Montes
 */
public class ViewModelC extends GenericForwardComposer {

    private Window winMode;
    private Listbox bebiList;
    private Listbox aliList;
    private Listbox costoPrin;
    private double costo = 0;
    private Label costoTotal;

    public void onCreate$winMode() {
        try {
            winMode.onModal();
        } catch (InterruptedException ex) {
            Logger.getLogger(ViewModelC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void onSelect$bebiList() {
        controlMaestro();
    }

    public void onSelect$aliList() {
        controlMaestro();
    }

    public void controlMaestro() {
        try {
            
            String bebidas = bebiList.getSelectedItem().getLabel();
            String alimentos = aliList.getSelectedItem().getLabel();
            Control maestro = new Control();
            List lista = maestro.busquedaAlimenos(bebidas, alimentos);
            costo = 0;
       
        costoPrin.setItemRenderer(new ListitemRenderer() {

            public void render(Listitem item, Object o) throws Exception {
                if (o == null) {
                    return;
                }
                Producto r = (Producto) o;
                item.appendChild(new Listcell(String.valueOf(r.getCosto() + " pesos")));
                item.appendChild(new Listcell(r.getNombre()));
                item.appendChild(new Listcell(r.getProveedor()));
                costo = costo + r.getCosto();
                costoTotal.setValue(String.valueOf(costo));
            }
        });
         ListModelArray list = new ListModelArray(lista);
         costoPrin.setModel(list);
         costoPrin.setVisible(true);
         
        }
        catch (Exception ex){
        }
   
    }
   
}
