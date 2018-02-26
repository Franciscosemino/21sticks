package test;
import game.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void takeone() {
        Game game = new Game();
        game.takeone();
        Integer i = 20;
        assertEquals(game.getsticks(),i,"jj");
    }

    @Test
    void taketwo() {
        Game game = new Game();
        game.taketwo();
        Integer i = 19;
        assertEquals(game.getsticks(),i,"jj");
    }

}