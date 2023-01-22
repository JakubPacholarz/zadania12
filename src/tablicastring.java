public class tablicastring {
    private int[] table;
    private int elements;


    public tablicastring(int maxsize)
    {
        table = new int[maxsize];
        elements=0;
    }

    public static void main(String[] args) {
        int maxsize = 10;
        tablicastring array = new tablicastring(maxsize);

        array.add(20);
        array.add(30);
        array.add(10);
        
        array.print();
        
        array.remove(1);
        
        int elemIndex = array.find(57);
    }

    private void print()
    {
        for (int i = 0; i < elements; i++)
        {
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }

    private boolean remove(int index) 
    {
        if (elements==0 || index>=elements || index<0)
            return false;
        for (int j = index; j<elements;j++)
        {
            table[j] = table[j+1];
        }
        elements--;
        return true;
    }

    private int find(int searchelem) 
    {
        for (int j=0; j< elements;j++)
        {
            if (table[j]==searchelem) return j;
        }
        return -1;
    }

    private void add(int value) 
    {
        if (elements >= table.length)
        {
            int [] locTable = new int[table.length*2];
            for (int i=0; i<table.length; i++)
                locTable[i] = table[i];
            table = locTable;
        }
        table[elements] = value;
        elements++;
    }
    public int get(int index)
    {
        return table[index];
    }
}
