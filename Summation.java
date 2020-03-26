public class Summation extends Thread{

    private int[] array;

    private int partial;

    public int getPartialSum(){

        return partial;

    }

    public void setPartialSum(){

        partial = sum(array, 0, array.length);

    }

    public static int sum(int[] array, int low, int high){

        int total = 0;

        for(int i = low; i < high; i++){

            total += array[i];

        }

        return total;

    }

    public static int sum(int[] array) {

        return sum(array, low, high);

    }

}