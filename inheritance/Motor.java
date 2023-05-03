package inheritance;

public class Motor extends Kendaraan {
    String platNo;
    String warna;

    public Motor(String nama, String type, String merek, String platNo, String warna){
        super(nama, type, merek);

        this.platNo = platNo;
        this.warna = warna;
    }

    @Override
    public String toString(){
        return (super.toString() + "\nPlat No : " +platNo+ " Warna kendaraan : " +warna);
    }
}
