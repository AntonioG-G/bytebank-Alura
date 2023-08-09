package bytebank.Model;

public class GuardaCuentas {


    Cuenta[] cuentas = new Cuenta[10];
    int indice  = 0;

    public void agregar(Cuenta cc) {
        cuentas[indice] = cc;
        indice++;
    }

    public Cuenta obtener(int indice){
        return cuentas[indice];
    }
    
}
