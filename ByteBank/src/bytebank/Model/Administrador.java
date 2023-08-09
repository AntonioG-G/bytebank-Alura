package bytebank.Model;

public class Administrador extends Funcionario implements Autenticable{
    
    private String clave;

    @Override
    public double getBonificacion() {

        return this.getSalario();
    }

    @Override
    public boolean iniciarSesion(String clave) {
        if (this.clave == clave) {
            return true;
        }
            return false;
    }

    @Override
    public void setClave(String clave) {
        this.clave = clave;
    }
}
