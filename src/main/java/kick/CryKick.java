package kick;
import lotr.Character;

public class CryKick implements KickStrategy {

    @Override
    public void kick(Character whoKick, Character whoIsKiked) {
        System.out.println("CRY");
    }
}
