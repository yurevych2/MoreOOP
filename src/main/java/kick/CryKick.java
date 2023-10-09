package kick;
import lotr.MyCharacter;

public class CryKick implements KickStrategy {

    @Override
    public void kick(MyCharacter whoKick, MyCharacter whoIsKiked) {
        System.out.println("CRY");
    }
}
