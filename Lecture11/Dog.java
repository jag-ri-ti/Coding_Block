package Coding_Block.Lecture11;

public class Dog extends Animal {
    String name,
    String voice,
    String color;

    public Dog(
        String name,
        String voice,
        String color,
        int leg,
        boolean tail,
        int food
    )
    
    {
        this.name=name;
        this.voice=voice;
        this.color;
        this.tail=tail;
    }

    void Display() {
        System.out.println(this.name);
        System.out.println(this.voice);
        System.out.println(this.color);
        System.out.println(this.leg);
        System.out.println(this.tail);
        System.out.println(this.fh.habbit[this.food]);
        System.out.println(this.name);

    }
}
