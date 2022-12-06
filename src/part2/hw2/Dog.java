package part2.hw2;

public class Dog {
    String name;
    String breed;
    int speed;

    void run(){
        for (int i = 0; i < speed; i++) {
            System.out.println("Бегу");
        }
    }

    String info(){
        return "Name: "+name +"\nBreed:" +breed +"\nSpeed:"+ speed;
    }


}
