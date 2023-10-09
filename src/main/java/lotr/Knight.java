package lotr;

import kick.KingKick;

public class Knight extends Character{
    public Knight() {
        super(AttributesGenerator.GenerateFromTo(1, 12),AttributesGenerator.GenerateFromTo(1, 12), new KingKick());
    }
}
