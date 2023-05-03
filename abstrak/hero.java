package abstrak;

public class hero extends MobileLegends{
    private String tingkat_kesulitan;

    public hero(String nama_hero, String role_hero, String tingkat_kesulitan){
        super(nama_hero, role_hero);
        this.tingkat_kesulitan = tingkat_kesulitan;
    }

    public String getKesulitan(){
        return tingkat_kesulitan;
    }

    @Override
    public void cetak(){
        System.out.println("Nama hero : " +getNama());
        System.out.println("role hero : " +getRole());
        System.out.println("kesulitan hero : " +getKesulitan());
        System.out.println("================================");
    }
}
