package elektrik;

public class BesYuzilebinArasindakilerKurali implements Kural {
    @Override
    public boolean uygula(Musteri musteri, Musteri musteri2) {
        if((musteri.getBorc() > 500)
                && (musteri.getBorc() < 1000)) {
            return true;
        }
        return false;
    }
}
