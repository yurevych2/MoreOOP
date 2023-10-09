package lotr;

public class GameManager {
    public void fight(MyCharacter c1, MyCharacter c2) { 
        // to provide fight between to characters and explain via command 
        // line what happens during fight, till both of 
        // the characters are alive 
        while ((c1.getHp() > 0) && (c2.getHp() > 0)) {
            c1.kick(c2);
            if (c2.getHp() > 0) {
                c2.kick(c1);
            }
        }
      }
}
