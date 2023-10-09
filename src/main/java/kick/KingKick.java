package kick;

import lotr.AttributesGenerator;
import lotr.Character;

public class KingKick implements KickStrategy {
    @Override
    public void kick(Character whoKick, Character whoIsKiked) {
        System.out.println("KING KICK");
        whoIsKiked.setHp(whoIsKiked.getHp() - AttributesGenerator.GenerateFromTo(0, whoKick.getPower()));
    }
}
