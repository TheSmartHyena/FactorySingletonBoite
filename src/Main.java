public class Main {
    public static void main(String[] args) {
        Metal metal = (Metal) FBoite.creerBoite(EBoite.METAL);
        Carton carton = (Carton) FBoite.creerBoite(EBoite.CARTON);
        Plastique plastique = (Plastique) FBoite.creerBoite(EBoite.PLASTIQUE);

        System.out.println(metal.getId());
        System.out.println(carton.getId());
        System.out.println(plastique.getId());
        System.out.println(SBoiteId.getInstance().getUniqueBoiteId());

    }
}