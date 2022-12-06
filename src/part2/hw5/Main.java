package part2.hw5;

public class Main {
    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.voice();

        Monster monster1 = new Monster(3);
        monster1.voice(4);

        Monster monster2 = new Monster(3,3);
        monster2.voice(5,"Hi");

        Monster monster3 = new Monster(4,4,4);
        monster3.voice();
    }
}
