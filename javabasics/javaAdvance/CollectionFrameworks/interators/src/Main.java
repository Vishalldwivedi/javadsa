import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class genericList<T> implements Iterable<T> {
    private Object[] arr; // Use Object array for generic support
    private int size;

    public genericList() {
        this.arr = new Object[100]; // Initialize the array with size 100
        this.size = 0; // Initial size is 0 as there are no elements yet
    }

    public void add(T a) {
        arr[size++] = a;
    }

    public T getItemAtIndex(int as) {
        T item = (T) arr[as];
        return item;
    }

    @Override
    public Iterator<T> iterator() {

        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        genericList<String> l = new genericList<>();
        l.add("vid");
        l.add("dd");
        l.add("dfds");
        l.add("dfdaa");
// we cant iterate over the list because we dont have access to this array make this item array as public
        // encpsulation principle is invalidaed oops
        // user can manupulate it
        //for this we need to implement iterable interface that means this object is not ierable we cniterate over this
        // list

    }
}