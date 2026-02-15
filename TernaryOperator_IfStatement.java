
import java.lang.System;

//Ternary Operator Means ( If-Else Java Short Hand Method )
/*That ternary operator method usually help very well for if-else
  statement shortcut. I think It's actually work same like if statements. That's enough.
*/
public class TernaryOperator_IfStatement {
    public static void main(String[] args) {
        int Age = 18;
        String votingResult = (Age >= 18)?"Eligible":"Not_Eligible";
        int loveCount = 2;
        String loveresult =(loveCount < 1)?"Good ":"bad";
        int examinationMark = 45;
        String markResult =(examinationMark >35)?"Pass":"Fail";
        int tabletConsume = 4;
        String day_consumetab =(tabletConsume > 1)?"Not Good":"Better";
        System.out.println(votingResult);
        System.out.println(loveresult);
        System.out.println(markResult);
        System.out.println(day_consumetab);
    }
}