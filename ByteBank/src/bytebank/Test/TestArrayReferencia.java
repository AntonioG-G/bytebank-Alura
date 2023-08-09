package bytebank.Test;

import bytebank.Model.*;

public class TestArrayReferencia {
    public static void main(String[] args) {

        /* Cliente clienteNormal = new Cliente();
        clienteNormal.setNombre("Flavio");

        Cliente clienteVip = new Cliente();
        clienteVip.setNombre("Romulo");

        Object[] refs = new Object[5];
        refs[0]  = clienteNormal;
        refs[1]  = clienteVip;

        System.out.println(((Cliente) refs[1]).getNombre()); */

        CuentaCorriente cc = new CuentaCorriente(123, 456);

        CuentaAhorros ca = new CuentaAhorros(30, 60);

        Cuenta[] ccArray = new Cuenta[5];
        ccArray[1] = cc;
        ccArray[0] = ca;

        //Cast
        CuentaCorriente cc2 = (CuentaCorriente) ccArray[0];

        cc.deposita(400);
        for (int i = 0; i < ccArray.length; i++) {
            System.out.println("Cuenta " + i + " = "+ccArray[i]);
        }
        System.out.println(cc2);
    }
}
