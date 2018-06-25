import java.util.LinkedList;

public class LinkedListTut {

    LinkedList<String> linkedList = new LinkedList<>();
    Stack<Integer> stack = new Stack<>();

    public void createList() {
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
    }

    public void showOnConsole() {
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.peek());
        linkedList.removeAll(linkedList);
        for (String s: linkedList) {
            System.out.println(s);
        }
    }



}
