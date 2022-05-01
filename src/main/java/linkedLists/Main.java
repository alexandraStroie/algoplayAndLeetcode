package linkedLists;

public class Main {
    public static void main(String[] args) {
        Node<String> head = null;

// Construct list, 'head' will point to the first element in list.
// List will be "A" -> "B" -> "C" -> "D" -> "E" -> null

        Node<String> it = head;
        while (it.next() != null && it.next().next() != null) {
            it.next(it.next().next());
            it = it.next();
        }

    }
}
