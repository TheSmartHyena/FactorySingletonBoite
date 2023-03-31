public class FBoite {
    public static Aboite creerBoite (EBoite type) {
        Aboite result = null;

        switch(type) {
            case CARTON:
                result = new Carton(SBoiteId.getInstance().getUniqueBoiteId());
                break;
            case METAL:
                result = new Metal(SBoiteId.getInstance().getUniqueBoiteId());
                break;
            case PLASTIQUE:
                result = new Plastique(SBoiteId.getInstance().getUniqueBoiteId());
                break;
        }

        return result;
    }
}
