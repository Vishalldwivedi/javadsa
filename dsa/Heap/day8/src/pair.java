import java.lang.reflect.Parameter;
import java.util.ArrayList;

class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public Pair() {
        this.first = null;
        this.second = null;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }


    public static void main(String[] args) {
        Pair<Integer,Pair<Integer,Integer>> p = new Pair<>();
        p.first = 55;
        p.second = new Pair<>();
        p.second.first= 44;
        p.second.second = 4444;

        Pair<Integer, Integer> secondPair = p.getSecond();
        Integer secondFirstValue = secondPair.getFirst();
        Integer secondSecondValue = secondPair.getSecond();

        System.out.println(secondFirstValue );
        System.out.println(secondSecondValue);

        ArrayList<Pair> al = new ArrayList<>();
        al.add(p);
        al.add(secondPair);
        for (Pair pair : al) {
            System.out.println(pair.getFirst());
            Pair<Integer, Integer> nestedPair = (Pair<Integer, Integer>) pair.getSecond();
            System.out.println(nestedPair.getFirst());
            System.out.println(nestedPair.getSecond());
        }
    }
}