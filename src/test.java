/**
 * Created by: Daniels
 * Date: 10/12/2020
 * Description:
 */
public class test {
    public static void main(String[] args) {
        Computer c1 = new Computer("PC de Miguel", 8, 100, null);
        OperatingSystem os1 = new OperatingSystem("@guela", "6.0", "64x", true, 20, 4);
        Software s1 = new Software("Counter Strike", "2.0", 15, 3);
        Software s2 = new Software("Utorrent", "1.4.12", 5, 2);

        System.out.println("Instalando Sistema Operativo @guela");
        System.out.println(" ");
        c1.setHardDisk(c1.getHardDisk()-os1.getOsSpaceRequirement());
        c1.setRamMemory(c1.getRamMemory()-os1.getOsRamRequirement());
        c1.setOs(os1.getOsName());
        ensenarOrdenador(c1);
        System.out.println("Ahora vamos a instalar Aplicacinoes");
        os1.instalarSoftware(s1,c1);
        os1.instalarSoftware(s2,c1);
        ensenarOrdenador(c1);
        System.out.println("Lista de apps: ");

        for (int i=0;i<os1.getOsSoftware().size();i++) {

            System.out.println(os1.getOsSoftware().get(i));
        }
    }
    public static void ensenarOrdenador (Computer pc){
        System.out.println("Nombre del PC:  " + pc.getName());
        System.out.println("Memoria Ram libre:  " + pc.getRamMemory() + " GB");
        System.out.println("Espacio libre del disco duro:  " + pc.getHardDisk() + " GB");
        System.out.println("Sistema Operativo:  " + pc.getOs());
        System.out.println(" ");
    }
}
