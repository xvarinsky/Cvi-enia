
public class Game {
    static void clash(Ogre ogre, Knight knight) {
        AngryKnight.attack(ogre);
    }

    public static void main(String[] args) {
        Knight[] k = new Knight[100];
        Ogre[] o = new Ogre[100];

        // another kind of an ogre has been added: BadOgre
        // this is just the initialization of ogre and knight arrays so that different combinations would occur
        for (int i = 0; i < 20; i++) {
            k[i] = new Knight();
            k[i].energy = 40;
            o[i] = new BadOgre();
            o[i].energy = 50;
            o[i].hungry = true;
        }

        for (int i = 20; i < 40; i++) {
            k[i] = new Knight();
            k[i].energy = 40;
            o[i] = new BadOgre();
            o[i].energy = 50;
        }
        for (int i = 40; i < 60; i++) {
            k[i] = new Knight();
            k[i].energy = 40;
            o[i] = new BigBadOgre();
            o[i].energy = 50;
            o[i].angry=true;
        }

        for (int i = 60; i < 70; i++) {
            k[i] = new Knight();
            k[i].energy = 40;
            o[i] = new Ogre();
            o[i].energy = 50;
        }

        for (int i = 70; i < 80; i++) {
            k[i] = new AngryKnight();
            k[i].energy = 40;
            o[i] = new Ogre();
            o[i].energy = 50;
        }
    for (int i = 70; i < 80; i++) {
            k[i] = new AngryKnight();
            k[i].energy = 40;
            o[i] = new Ogre();
            o[i].energy = 50;
        }
    for (int i = 70; i < 80; i++) {
            k[i] = new AngryKnight();
            k[i].energy = 40;
            o[i] = new Ogre();
            o[i].energy = 50;
        }

        // the clash loop with an output statement
        for (int i = 0; i < 100; i++) {
            clash(o[i], k[i]);

            System.out.println(i + ":"
                    + "knight " + k[i].energy + " / "
                    + "ogre " + o[i].energy);
        }
    }
}
