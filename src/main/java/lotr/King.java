package lotr;

import kick.KingKick;

public class King extends MyCharacter {
    public King() {
        // public static AttributesGenerator generator = new AttributesGenerator();
        super(AttributesGenerator.GenerateFromTo(5, 15),AttributesGenerator.GenerateFromTo(5, 15), new KingKick());
    }
}
