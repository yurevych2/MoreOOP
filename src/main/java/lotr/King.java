package lotr;

import kick.KingKick;

public class King extends Character {
    public King() {
        // public static AttributesGenerator generator = new AttributesGenerator();
        super(AttributesGenerator.GenerateFromTo(1, 15),AttributesGenerator.GenerateFromTo(1, 15), new KingKick());
    }
}
