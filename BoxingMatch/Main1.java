package BoksMaci;

public class Main1 {
    public static void main(String[] args) {
            Fighter marc = new Fighter("Marc",25,100,100,0);
            Fighter alex = new Fighter("Alex",45,110,100,0);
            Ring r = new Ring(marc,alex,90,100);
            r.run();
    }
}
