package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int usg;
     while(first != 0 && second != 0){
         if(first > second){
             first = first % second;
         }else {
             second = second % first;
         }
     }
     if(first == 0){
         usg = second;
     }else{
         usg = first;
     }
     System.out.println(usg);
    }
}
