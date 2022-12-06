package part2.hw6_7.main;

import part2.hw6_7.box.Box;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(2,2,2);
        Box box2 = new Box(4,4,4);

        Box box3 = box1.increase(box2);

        System.out.println(box3.toString());

        Box box4 = new Box(box1,box3);

        System.out.println(box4.toString());
    }
}
