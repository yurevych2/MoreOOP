package kick;
import lotr.MyCharacter;

public interface KickStrategy {
    public void kick(MyCharacter whoKicked, MyCharacter whoIsKiked);
}
