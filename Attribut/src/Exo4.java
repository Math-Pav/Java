public class Exo4 {
    public static void main(String[] args) {
        Compte compte1 = new Compte();
        System.out.println("Nombre total de comptes créés : " + Compte.getNombreDeComptes());
        Compte compte2 = new Compte();
        System.out.println("Nombre total de comptes créés : " + Compte.getNombreDeComptes());
        Compte compte3 = new Compte();
        System.out.println("Nombre total de comptes créés : " + Compte.getNombreDeComptes());
    }
}
