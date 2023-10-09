package kick;

import lotr.AttributesGenerator;
import lotr.MyCharacter;

public class KingKick implements KickStrategy {
    @Override
    public void kick(MyCharacter whoKick, MyCharacter whoIsKiked) {
        System.out.println("KING KICK");
        whoIsKiked.setHp(whoIsKiked.getHp() - AttributesGenerator.GenerateFromTo(0, whoKick.getPower()));
    }
}
