public class StepTracker
{
    public static void main(String[] WriteTheCompleteStepTrackerClassIncludingTheConstructorAndAnyRequiredInstanceVariablesAndMethodsYourImplementationMustMeetAllSpecificationAndConformToTheExample)
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
    }

    private int min;
    private int steps;
    private int days;
    private int activeDays;

    public StepTracker(int minSteps)
    {
        min = minSteps;
        steps = 0;
        days = 0;
        activeDays = 0;
    }

    public void addDailySteps(int dailySteps)
    {
        steps += dailySteps;
        days++;
        if (dailySteps >= min)
        {
            activeDays++;
        }
    }

    public int activeDays()
    {
        return activeDays;
    }

    public double averageSteps()
    {
        double avg = 0.0;
        if (days > 0)
        {
            avg = (double)steps / (double)days;
        }
        return avg;
    }
}