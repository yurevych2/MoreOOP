package kick;
import lotr.MyCharacter;

public class ElfKick implements KickStrategy {

    @Override
    public void kick(MyCharacter whoKick, MyCharacter whoIsKiked) {
        System.out.println("ELF KICK");
        if (whoKick.getPower() > whoKick.getPower()){
            whoIsKiked.setHp(0);
        }
        else {
            whoIsKiked.setPower(whoIsKiked.getPower() - 1);
        }
    }
}