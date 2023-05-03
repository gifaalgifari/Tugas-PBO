package inheritance;

public class Kendaraan {
    String nama;
    String type;
    String merek;

    public Kendaraan(String nama, String type, String merek){
        this.nama = nama;
        this.type = type;
        this.merek = merek;
        
    }

    // methode untuk print
    public String toString(){
        System.out.println("Informasi kendaraan");
        return ("Nama kendaraan :" +nama+ "\nType kendaraan :" +type+ "\nMerek kendaraan :" +merek);
    }
    
}
