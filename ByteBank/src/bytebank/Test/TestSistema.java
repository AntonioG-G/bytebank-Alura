package bytebank.Test;

import bytebank.Model.*;

public class TestSistema {

    public static void main(String[] args) {
        
        SistemaInterno sistema = new SistemaInterno();

        Gerente gerenteTest = new Gerente();

        Administrador adminTest = new Administrador();

        sistema.autentica(gerenteTest);
        sistema.autentica(adminTest);
    }
}