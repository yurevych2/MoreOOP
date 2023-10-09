package lotr;
import kick.ElfKick;

public class Elf extends MyCharacter{

    public Elf() {
        super(10, 10, new ElfKick());
    }

}