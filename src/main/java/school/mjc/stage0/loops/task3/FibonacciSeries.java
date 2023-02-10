package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int number=0;
        for(int i = 0; i<lastFibonacci; i++){
            number = (number-1)+(number-2);
            System.out.println(number);
        }
    }
}
