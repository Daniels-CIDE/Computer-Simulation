import java.util.Scanner;

public class main {
    Scanner sc = new Scanner(System.in);



    private void ordenata() {

        System.out.println("Bienvenido a Computer Simulator!");

        Computer c1 = new Computer("c1", 4, 100);

        OperatingSystem os1 = new OperatingSystem("os1", "6.0", "64x", true, 20, 4);

        Software s1 = new Software("s1", "2.0", 5, 2);
        Software s2 = new Software("s2", "1.4.12", 2, 1);

        System.out.println("Primero que nada este es tu ordenador");
        enseñarOrdenador(c1);

        System.out.println("Deseas instalar un Sistema Operativo ");
        System.out.println("  1.Si ");
        System.out.println("  2.No ");
        int op = this.sc.nextInt();
        boolean continuar = true;
        while (continuar == true) {
            switch (op) {
                case 1:
                    this.añadirSo();
                    break;
                case 2:
                    System.out.println("Pues no instalamos nada");
                    continuar = false;
                default:
                    System.out.println("Fin de la aplicación");
                    continuar = false;
            }

        }

    }

    public static void enseñarOrdenador (Computer c1){
        System.out.println("Nombre del PC:    " + c1.getName());
        System.out.println("Memoria Ram:   " + c1.getRamMemory() + " GB");
        System.out.println("Espacio del disco duro: " + c1.getHardDisk() + " GB");
        System.out.println("Sistema Operativo:   " + c1.getOs());
        System.out.println();
    }

    private void añadirSo () {
    }


    public static void main(String[] args) {
        main ui = new main();
        ui.ordenata();
    }
}
