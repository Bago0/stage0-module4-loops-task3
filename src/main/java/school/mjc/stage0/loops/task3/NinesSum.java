package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int nine = 0;
        int result = 0;
        for(int i = 0; i<lengthOfLastNumber; i++){
            nine = nine*10+9;
            result=result+nine;
        }
        System.out.println(result);
    }
}
