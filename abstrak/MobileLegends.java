package abstrak;

abstract class MobileLegends {
    private String nama_hero;
    private String role_hero;

    public MobileLegends(String nama_hero, String role_hero){
        this.nama_hero = nama_hero;
        this.role_hero = role_hero;
    }

    public String getNama(){
        return nama_hero;
    }

    public String getRole(){
        return role_hero;
    }

    public abstract void cetak();
}
