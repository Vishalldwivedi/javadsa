import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        // tree set implements  sorted interface which extends set interface
        // order is not presenrved
        // in sorted order (as tree set internially follows bst)
        // and no duplicates;
        // inorder ie sorted order return the value
        /// if tree is bbst very fast log n
        // if not it is skew tree On time
        TreeSet ts = new TreeSet();
        ts.add(44);
       // ts.add("fd");error
        ts.add(75);
        ts.add(22);
        ts.add(22);
        ts.add(188);
        System.out.println(ts);
        System.out.println(ts.higher(50));
        System.out.println(ts.lower(44));
        System.out.println(ts.ceiling(30));// uper if element present ceiling and floor will return that noonly
        System.out.println(ts.floor(76));// nicha


    }
}
