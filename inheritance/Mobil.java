package inheritance;

public class Mobil extends Kendaraan {
    String platNo;
    String warna;

    public Mobil(String nama, String type, String merek, String platNo, String warna){
        super(nama, type, merek);

        this.platNo = platNo;
        this.warna = warna;
    }

    @Override
    public String toString(){
        return (super.toString() + "\nPlat No : " +platNo+ " Warna kendaraan : " +warna);
    }
}
