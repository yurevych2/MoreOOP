package kick;
import lotr.Character;

public interface KickStrategy {
    public void kick(Character whoKicked, Character whoIsKiked);
}
