
public class Ogre {
    boolean hungry;
    boolean angry;
    int energy;

    void revenge(Knight knight) {
        if (energy > knight.energy)
            knight.energy = (int) (0.9 * knight.energy);
    }
}
