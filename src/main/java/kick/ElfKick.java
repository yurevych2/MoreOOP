package kick;
import lotr.Character;

public class ElfKick implements KickStrategy {

    @Override
    public void kick(Character whoKick, Character whoIsKiked) {
        System.out.println("ELF KICK");
        if (whoKick.getPower() > whoKick.getPower()){
            whoIsKiked.setHp(0);
        }
        else {
            whoIsKiked.setPower(whoIsKiked.getPower() - 1);
        }
    }
}