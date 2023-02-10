package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        if (t < 0) {
            t = -t;
        }
        while (t > 0) {
            int lastDigit = t % 10;
            sum += lastDigit;
            t = t / 10;
        }

        System.out.println(sum);
    }
}
