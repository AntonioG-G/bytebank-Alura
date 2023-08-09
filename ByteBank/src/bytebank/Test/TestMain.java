package bytebank.Test;

public class TestMain {
    public static void main(String[] args) {
        int[] edades = new int[5];
        edades[2] = 30;
        System.out.println(edades[2]);
        System.out.println(edades[0]);

        /* System.out.println(edades[5]); */
        int tamanoArray = edades.length;
        System.out.println(tamanoArray);

        for (int i = 0; i < edades.length; i++) {
            System.out.println("Posición "+ i + " del array: "+edades[i]);
        }
    }
}
