package bytebank.Model;

public class Gerente extends Funcionario implements Autenticable {

    @Override
    public double getBonificacion() {
        System.out.println("Llamando metodo del Gerente");
        return 1000;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setClave(String clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setClave'");
    }

}