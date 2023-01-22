import java.util.ArrayList;

public class Arrayqueue {

    private ArrayList<Integer> intQueue;

    public Arrayqueue() {
        intQueue = new ArrayList<Integer>();
    }

    public int remove() {
        int firstelem = intQueue.get(0).intValue();
        intQueue.remove(0);
        return firstelem;
    }

    public void insert(int i) {
        intQueue.add(i);
    }

    public boolean isEmpty() {
        return intQueue.isEmpty();
    }

    public static void main(String[] args) {
        Arrayqueue theQueue = new Arrayqueue();

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

        while (!theQueue.isEmpty())
        {
            System.out.println(" usuwam "+ theQueue.remove());
        }
        System.out.println( " ");
    }
}

