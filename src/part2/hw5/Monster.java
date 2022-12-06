package part2.hw5;

public class Monster {

    int hands;
    int ease;
    int legs;

    Monster() {
        this.hands = 2;
        this.ease = 2;
        this.legs = 2;
    }

    Monster(int hands) {
        this.hands = hands;
        this.ease = 2;
        this.legs = 2;
    }

    Monster(int hands, int ease) {
        this.hands = hands;
        this.ease = ease;
        this.legs = 2;
    }

    Monster(int hands, int ease, int legs) {
        this.hands = hands;
        this.ease = ease;
        this.legs = legs;
    }

    void voice(){
        System.out.println("Voice");
    }

    void voice(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Voice");
        }
    }

    void voice(int n, String word){
        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
    }

}
