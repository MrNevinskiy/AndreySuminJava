package part2.hw14;

public class Director {

    public void force(int mounts, Counter counter){
        String result = counter.report(mounts);
        System.out.println(result);
    }
}
