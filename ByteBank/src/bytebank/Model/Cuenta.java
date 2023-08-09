package bytebank.Model;

/**
 * Este clase se refiere a una cuenta de banco estandar
 * Tomará el rol de emular la estructura base de una cuenta
 * Del banco Bytebank, con sus métodos y atributos correspondientes.
 * @version 1.0
 * @author Antonio Guerrero
 * @return
 */

public abstract class Cuenta implements Comparable<Cuenta> {

    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;

    public Cuenta() {

    }

    public Cuenta( int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);

        Cuenta.total ++;
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("No tienes saldo");
        }
            this.saldo -= valor;
            
        
    }

    public boolean transfiere(double valor, Cuenta destino) throws SaldoInsuficienteException {
        if(this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }

    @Override
    public String toString() {
    	String cuenta = "Numero: " + this.numero + ", Agencia:" + this.agencia + ", Titular: " + this.titular.getNombre() + ", Saldo: " + this.getSaldo();
    	return cuenta;
    }
    @Override
    public boolean equals(Object ref){

        Cuenta otra = (Cuenta) ref;

        if(this.agencia != otra.agencia){
            return false;
        }

        if(this.numero != otra.numero){
            return false;
        }

        return true;
    }
    @Override
    public int compareTo(Cuenta o) {

        return (int) (this.getSaldo() - o.getSaldo());
    }

}
