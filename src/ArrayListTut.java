import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTut {
    List<String> arrayList;

    public void run() {
        arrayList = new ArrayList<>(10);
        if(arrayList.isEmpty()) {
            createArrayList();
            //contains();
            //removeAll();
            iterator();
        }
    }
    void iterator() {
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void removeAll() {
        arrayList.removeAll(arrayList);
        System.out.println(arrayList.size());
        for (String s:arrayList) {
            System.out.print(s);
        }
    }

    public void contains() {
        System.out.println(arrayList.contains("1"));
    }

    public void createArrayList() {
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        for (String s: arrayList) {
            System.out.print(s);
        }
        System.out.println("  ");
        arrayList.add(2,"2.5");
        for (String s: arrayList) {
            System.out.print(s);
        }
        System.out.println("  ");
        arrayList.remove(2);
        for (String s: arrayList) {
            System.out.print(s);
        }
        System.out.println("  ");
    }


}
