package abstrak;

public class app {
    public static void main(String[] args) {
        MobileLegends hero1 = new hero("zilong", "fighter", "mudah");

        MobileLegends hero2 = new hero("fanny", "assasin", "sangat sulit");

        MobileLegends hero3 = new hero("claude", "marksman", "sulit");

        hero1.cetak();
        hero2.cetak();
        hero3.cetak();
    }
}
