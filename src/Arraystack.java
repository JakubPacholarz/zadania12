import java.util.ArrayList;

public class Arraystack {
    private ArrayList<Integer> intStack;

    public Arraystack()
    {
        intStack = new ArrayList<Integer>();
    }

    public void push(int elem)
    {
        intStack.add(elem);
    }

    public int pop()
    {
        int TopElem = intStack.get(intStack.size()-1);
        intStack.remove(intStack.size()-1);
        return TopElem;
    }
    public int peek()
    {
        return intStack.get(intStack.size()-1);
    }
    public boolean isEmpty()
    {
        return intStack.isEmpty();
    }

    public static void main(String[] args) {
        Arraystack theStack = new Arraystack();
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        theStack.push(81);

       while (!theStack.isEmpty())
       {
           int value = theStack.pop();
           System.out.println(value+" ");
       }
        System.out.println(" ");

    }


}
