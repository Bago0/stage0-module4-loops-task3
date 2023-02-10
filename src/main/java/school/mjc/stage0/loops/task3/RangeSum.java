package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int counter = firstBoarder - 1;
        if (firstBoarder < 0) {
            System.out.println(secondBoarder + firstBoarder);
        } else if (secondBoarder < 0) {
            System.out.println(firstBoarder + secondBoarder);
        } else if (firstBoarder == secondBoarder) {
            System.out.println(firstBoarder);
        } else {
            for (int i = 0; i <= secondBoarder - firstBoarder; i++) {
                counter = counter + firstBoarder + i;
            }
            System.out.println(counter);
        }
    }
}
