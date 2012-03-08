package dataSource;

import dao.Producto;
import java.util.*;


public class DataSourceImpl implements DataSource {

    private List general;
    
    public List getElementsListAlim() {
        List alimInfo = new ArrayList();
        alimInfo.add(new Producto("Hamburguesa", "CarsJunior", 120));
        alimInfo.add(new Producto("Ensalada", "Vips", 45));
        alimInfo.add(new Producto("Chuletas Empanizadas", "Carnitas Mora", 80));
        alimInfo.add(new Producto("Albondigas", "California", 70));
        alimInfo.add(new Producto("Consome de Pollo", "Super Pollo", 50));
        alimInfo.add(new Producto("Corte de Arrachera", "AppleBee's", 220));
        alimInfo.add(new Producto("Casuela de Mariscos", "Fragua", 135));
        alimInfo.add(new Producto("Papas a la Francesa", "MCDonnal's", 35));
        alimInfo.add(new Producto("Pizzas", "Dominos", 85));

        return alimInfo;
    }

    public List getElementsListBebi() {
        List bebidInfo = new ArrayList();

        bebidInfo.add(new Producto("CocaCola", "CocaCola", 8));
        bebidInfo.add(new Producto("Pepsi", "Pepsi", 7));
        bebidInfo.add(new Producto("Fresca", "CocaCola", 8));
        bebidInfo.add(new Producto("Mirinda", "Pepsi", 7));
        bebidInfo.add(new Producto("Sprite", "CocaCola", 8));
        bebidInfo.add(new Producto("Barrilito", "Pascual", 6));
        bebidInfo.add(new Producto("Jugo de Mango", "Del Valle", 9));
        bebidInfo.add(new Producto("Jugo de Naranja", "Del Valle", 9));
        bebidInfo.add(new Producto("Jugo de Manzana", "Del Valle", 9));

        return bebidInfo;

    }
    
    public List todoListas(){
        general = new ArrayList();
        LlenadoGeneral(getElementsListAlim());
        LlenadoGeneral(getElementsListBebi());
        return general;
     }
    
    private List LlenadoGeneral(List lista)
    {
            for(int i=0; i<lista.size(); ++i){
            general.add(lista.get(i));
                  }
            return general;
    }
    
}