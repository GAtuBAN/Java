package Boks;
public class Main {
    public static void main(String[] args) {
        Fighter mercik = new Fighter("Mercik", 15, 10, 93,91);
        Fighter nohut = new Fighter("Nohut", 17,8,92,90);
        Match r = new Match(mercik, nohut,85,110);
        r.fight();
    }
}