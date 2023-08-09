package bytebank.Test;

import bytebank.Model.*;
public class TestCuenta2 {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(123, 456);
        cuenta.deposita(200);
        try {
            cuenta.saca(220);
        } catch (SaldoInsuficienteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(cuenta.getSaldo());
    }
}
