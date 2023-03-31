public class SBoiteId {
    private static BoiteId instance = null;

    private SBoiteId() {}

    public static BoiteId getInstance() {
        if (instance == null) {
            instance = new BoiteId();
        }

        return instance;
    }
}
