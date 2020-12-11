import java.util.Scanner;

public class main {

    OperatingSystem os1 = new OperatingSystem("os1", "6.0", "64x", true, 20, 2);
    Computer c1 = new Computer("c1", 4, 100, null);
    int espacioRestante = c1.getHardDisk() - os1.getOsSpaceRequirement();
    int ramRestante = c1.getRamMemory() - os1.getOsRamRequirement();
    String nombreSystem = os1.getOsName();
    Computer c2 = new Computer("c1", ramRestante, espacioRestante, os1.getOsName());

    private void ordenata() {

        System.out.println("Bienvenido a Computer Simulator!");

        Computer c1 = new Computer("c1", 4, 100, null);

        System.out.println("Primero que nada este es tu ordenador");
        enseñarOrdenador(c1);
        instalarSO();

    }
    public void instalarSO (){
        Scanner issc = new Scanner(System.in);
        System.out.println("Deseas instalar un Sistema Operativo ");
        System.out.println("  1.Si ");
        System.out.println("  2.No ");
        int op = issc.nextInt();
        boolean continuar = true;
        while (continuar) {
            switch (op) {
                case 1:
                    añadirSo();
                    break;
                case 2:
                    System.out.println("Pues no instalamos nada");
                    continuar = false;
                    break;
                default:
                    System.out.println("Fin de la aplicación");
                    exit();
                    break;
            }

        }
    }



    private void añadirSo () {
        Scanner assc = new Scanner(System.in);
        System.out.println("¿Que Sistema Operativo deseas instalar?");
        System.out.println("  1.os1 ");
        System.out.println("  2.Buscar mas sistemas operativos ");
        System.out.println("  3.Atras ");
        int opcion = assc.nextInt();
        int salir = 0;
        while (salir == 0) {
            switch (opcion) {
                case 1:
                    añadirSoOs1();
                    break;
                case 2:
                    System.out.println("No se encuentran mas Sistemas Operativos");
                    añadirSo();
                    break;
                case 3:
                    instalarSO();
                    break;
                default:
                    System.out.println("Selecciona una opción del 1 al 3");
                    salir = 1;
                    break;
            }

        }

    }
    private void añadirSoOs1 () {
        Scanner aso1sc = new Scanner(System.in);
        enseñarOrdenador(c2);
        System.out.println("¿Quieres instalar aplicaciones?");
        System.out.println("  1.Si ");
        System.out.println("  2.No ");
        int op = aso1sc.nextInt();
        boolean continuar = true;
        while (continuar == true) {
            switch (op) {
                case 1:
                    añadirApps();
                    break;
                case 2:
                    System.out.println("Pues no instalamos nada");
                    continuar = false;
                    break;
                default:
                    System.out.println("Fin de la aplicación");
                    exit();
                    break;
            }

        }

    }
    public void añadirApps(){

        Scanner apsc = new Scanner(System.in);
        System.out.println("Okey, pues vamos a empezar instalando aplicaciones");
        Software s1 = new Software("s1", "2.0", 5, 2);
        Software s2 = new Software("s2", "1.4.12", 2, 1);
        System.out.println("  1.Lista de aplicacinoes");
        System.out.println("  2.Instalar 's1' ");
        System.out.println("  3.Instalar 's2' ");
        System.out.println("  4.Atras");
        int op = apsc.nextInt();
        int continuar = 1;
        while (continuar == 1) {
            switch (op) {
                case 1:
                    enseñarApp(s1);
                    enseñarApp(s2);
                    continuar = 0;
                    break;
                case 2:
                    System.out.println("Especificacinoes de s1");
                    enseñarApp(s1);
                    int espacioRestanteOsS1 = c1.getHardDisk() - os1.getOsSpaceRequirement();
                    int espacioRestanteAppS1 = espacioRestanteOsS1 - s1.getSoftwareSpaceRequirement();
                    int ramRestanteOsS1 = c1.getRamMemory() - os1.getOsRamRequirement();
                    int ramRestanteAppS1 = ramRestanteOsS1 - s1.getSoftwareRamRequirement();
                    if (ramRestanteAppS1 < 0) {
                        System.out.println("No te da la ram");
                        System.out.println("No se puede instalar la app");
                        añadirApps();
                    }
                    Computer c3 = new Computer("c1", ramRestanteAppS1, espacioRestanteAppS1, os1.getOsName());
                    enseñarOrdenador(c3);
                    //Array
                    continuar = 0;
                    break;
                case 3:
                    System.out.println("Especificacinoes de s2");
                    enseñarApp(s2);
                    int espacioRestanteOsS2 = c1.getHardDisk() - os1.getOsSpaceRequirement();
                    int espacioRestanteAppS2 = espacioRestanteOsS2 - s1.getSoftwareSpaceRequirement();
                    int ramRestanteOsS2 = c1.getRamMemory() - os1.getOsRamRequirement();
                    int ramRestanteAppS2 = ramRestanteOsS2 - s1.getSoftwareRamRequirement();
                    if (ramRestanteAppS2 < 0) {
                        System.out.println("No te da la ram");
                        System.out.println("No se puede instalar la app");
                        añadirApps();
                    }
                    Computer c4 = new Computer("c1", ramRestanteAppS2, espacioRestanteAppS2, os1.getOsName());
                    enseñarOrdenador(c4);
                    //Array
                    continuar = 0;
                    break;
                case 4:
                    System.out.println("Pues no instalamos nada");
                    continuar = 0;
                    break;
                default:
                    System.out.println("Fin de la aplicación");
                    exit();
                    break;
            }

        }
    }

    public static void main(String[] args) {
        main ui = new main();
        ui.ordenata();
    }
    public static void enseñarOrdenador (Computer c1){
        System.out.println("Nombre del PC:    " + c1.getName());
        System.out.println("Memoria Ram libre:   " + c1.getRamMemory() + " GB");
        System.out.println("Espacio libre del disco duro: " + c1.getHardDisk() + " GB");
        System.out.println("Sistema Operativo:   " + c1.getOs());
        System.out.println(" ");
    }
    public static void enseñarApp (Software app){
        System.out.println("Nombre de la apliación: "+ app.getSoftwareName());
        System.out.println("Version del software: "+ app.getSoftwareVersion());
        System.out.println("Uso de ram de la app: "+ app.getSoftwareRamRequirement());
        System.out.println("Espacio necesario: "+ app.getSoftwareSpaceRequirement());
        System.out.println(" ");
    }

    private void exit (){
        System.out.println("Adios!");
    }
}
