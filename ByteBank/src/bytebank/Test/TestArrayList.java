package bytebank.Test;

import java.util.LinkedList;
import java.util.List;

import bytebank.Model.*;

public class TestArrayList {
    public static void main(String[] args){

        List<Cuenta> lista = new LinkedList<Cuenta>();
    
        Cuenta cc1 = new CuentaCorriente(22, 22);
        Cuenta cc2 = new CuentaCorriente(22, 22);
        Cuenta cc3 = new CuentaCorriente(40, 60);
    
        lista.add(cc1);
        lista.add(cc3);
    
        boolean existe = lista.contains(cc2); //nuevo
    
        System.out.println("Ya existe? " + existe);
    
        for(Cuenta cuenta : lista){
            System.out.println(cuenta);
        }

        Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);

    }
}
