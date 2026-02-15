import java.lang.System;


/*
Switch Statement :                                           //Switch statement aren't support for
 It's in java is a selection (decision-making ) Statement.    // these data types -- 1.float 2.double 3.boolean
 It's used to execute one block of code from many options
 based on the value of an expression.
 */
                                                             //Switch Statement are only allowed or
public class SwitchStatements {                                      //Used on these data types.
    public static void main(String[] args) {                 //1.int, byte,short,char.
       int day = 7;                                          //2.String(Java 7+).
                                                             //3.enum.
       switch(day){
           case 1:     //Case means matches the values.
           case 2:
           case 3:
           case 4:
           case 5: {
               System.out.println("It's Not Weekend");
           }
           break;      //Break means execution of switch cases has stops execution.
           case 6:
           case 7: {
               System.out.println("It's Weekend");
           }
           break;
           default:{    //Default means executes when no case matches, it'll execute default statement.
               System.out.println("Enter Valid day");
           }
        }
    }
}