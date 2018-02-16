public class Game {
    int sticks = 21;

    public void takeone() {
        this.sticks -= 1;
    }

    public void taketwo() {
        this.sticks -= 2;
    }

    public Integer getsticks() {
        return this.sticks;
    }
}