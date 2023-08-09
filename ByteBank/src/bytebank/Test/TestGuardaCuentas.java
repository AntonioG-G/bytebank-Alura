package bytebank.Test;

import bytebank.Model.*;

public class TestGuardaCuentas {
    public static void main(String[] args) {
        
        GuardaCuentas gc = new GuardaCuentas();

        Cuenta cc = new CuentaCorriente(11, 120);
        gc.agregar(cc);
        
        Cuenta cc2 = new CuentaCorriente(22,    40);
        gc.agregar(cc2);

        System.out.println(gc.obtener(0));
        System.out.println(gc.obtener(1));
    }
}
