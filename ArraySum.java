import java.util.Random;

public static void main(String[] args) {
    
    Random rand = new Random();

    int[] array = new int[200000000];

    for(int i = 0; i <array.length; i++){

        array[i] = rand.nextInt(11) + 1;           //Adding 1 because the first int is 0

    }

    long startTime = System.currentTimeMillis();  

    Summation.sum(array);
    
}