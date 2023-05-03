package inheritance;

public class test {
    public static void main(String[] args) {
       Mobil mbl = new Mobil("Fortuner", "G", "Toyota", "B 1 AZ", "Hitam");
       System.out.println(mbl.toString());
       
       Motor mtr = new Motor("KLX", "trail", "Kawasaki", "F 567 GG", "MERAH");
       System.out.println(mtr.toString());
    }
}
