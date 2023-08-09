package bytebank.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bytebank.Model.*;

public class TestOrdenarLista {
    public static void main(String[] args) {
        
        Cuenta cc1 = new CuentaCorriente(123, 94);
        Cliente clientecc1 = new Cliente();
        clientecc1.setNombre("Julio");
        cc1.setTitular(clientecc1);
        cc1.deposita(333);

        Cuenta cc2 = new CuentaAhorros(456, 54);
        Cliente clientecc2 = new Cliente();
        clientecc2.setNombre("Rodrigo");
        cc2.setTitular(clientecc2);
        cc2.deposita(444);

        Cuenta cc3 = new CuentaCorriente(123, 134);
        Cliente clientecc3 = new Cliente();
        clientecc3.setNombre("Astrid");
        cc3.setTitular(clientecc3);
        cc3.deposita(222);

        Cuenta cc4 = new CuentaAhorros(456, 9);
        Cliente clientecc4 = new Cliente();
        clientecc4.setNombre("Carlos");
        cc4.setTitular(clientecc4);
        cc4.deposita(111);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
        /* ordenar cuentas */
        Comparator<Cuenta> comparador = new FuncionOrdenarNumero();
        
        lista.sort(comparador);

        System.out.println("-------------------------------");

        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
        
        System.out.println("-------------------------------");
        
        Comparator<Cuenta> comparator2 = new FuncionOrdenarNombre();
        
        lista.sort(comparator2);
        
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
        
        System.out.println("-------------------------------");
        
        Collections.sort(lista);
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
    }
}

class FuncionOrdenarNumero implements Comparator<Cuenta>{

    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        
        /* if (o1.getNumero()==o2.getNumero()) {
            return 0;
        }else if(o1.getNumero() > o2.getNumero()){
            return -1;
        }else{
            return 1;
        } */
        return o1.getNumero()-o2.getNumero();
    }   
}

class FuncionOrdenarNombre implements Comparator<Cuenta>{

    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
        
    }
    
}