package Lesson5;

public abstract class Animal {

    protected int runLength;
    protected int swimLength;
    protected float jumpHeight;

    public Animal(int runLength, int swimLength, float jumpHeight) {
        this.runLength = runLength;
        this.swimLength = swimLength;
        this.jumpHeight = jumpHeight;
    }

    public abstract void run();
    public abstract void swim();
    public abstract void jump();

}
