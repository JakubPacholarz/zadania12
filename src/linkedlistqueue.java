import java.util.LinkedList;

public class linkedlistqueue {

    private LinkedList<Integer> intQueue;

    public linkedlistqueue() {
        intQueue = new LinkedList<Integer>();
    }

    public static void main(String[] args) {
        linkedlistqueue theQueue = new linkedlistqueue();

        System.out.println("Wstawiam: 10");
        theQueue.insert(10);
        System.out.println("Wstawiam: 20");
        theQueue.insert(20);
        System.out.println("Wstawiam: 30");
        theQueue.insert(30);
        System.out.println("Wstawiam: 40");
        theQueue.insert(40);
        int elem = theQueue.remove();
        System.out.println(" Usuwam: " + elem);
        System.out.println(" Usuwam: " + theQueue.remove());
        System.out.println(" Usuwam: " + theQueue.remove());

        System.out.println("Wstawiam: 50");
        theQueue.insert(50);
        System.out.println("Wstawiam: 60");
        theQueue.insert(60);
        System.out.println("Wstawiam: 70");
        theQueue.insert(70);
        System.out.println("Wstawiam: 80");
        theQueue.insert(80);
        System.out.println(theQueue.size());
        System.out.println(theQueue.peek());

        while (!theQueue.isEmpty()) {
            System.out.println("usuwam" + theQueue.remove());
        }
        System.out.println(" ");
    }

    private int remove() {
        int firstelem = intQueue.get(0).intValue();
        intQueue.removeFirst();
        return firstelem;
    }

    private void insert(int i) {
        intQueue.addLast(i);

    }

    public int peek() {
        return intQueue.peek();
    }

    public boolean isEmpty() {
        return intQueue.isEmpty();
    }

    public int size() {
        return intQueue.size();
    }
}
