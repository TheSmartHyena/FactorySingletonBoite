public class BoiteId {
    private int idUnique = -1;

    public int getUniqueBoiteId () {
        idUnique++;
        return this.idUnique;
    }
}
