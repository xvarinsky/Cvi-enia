public class BigBadOgre extends BadOgre{
    void revenge(Knight knight){
        if(angry){
            knight.energy = (int) (knight.energy*0.5);
        }
    }
}
