import java.util.ArrayList;

public class runner
{
    public static void main(String[] bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb)
    {
        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        System.out.println("\n");
        q3 delim = new q3("{","}");
        String[] a = {"{","b","a","s","d","}"};
        ArrayList<String> b = delim.getDelimitersList(a);
        System.out.println(delim.toString(b));
        System.out.println(delim.isBalanced(b));


    }
}
