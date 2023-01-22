public class BombelekSort {

    public static void main(String[]args){
        int[] tablica = {2,-1,30,-5,34,65,-101,23};
        int[] wyniki = sort(tablica);

        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]+"");
        }
    }
    public static int []sort(int[]tablica){
        for (int i = 0; i <tablica.length ; i++)
            for (int j =1; j < tablica.length-1 ; j++) {
                if(tablica[j-1]>tablica[j]){
                    int temp = tablica[j-1];
                    tablica[j-1]=tablica[j];
                    tablica[j]=temp;
                }

            }
        return tablica;
    }

}
