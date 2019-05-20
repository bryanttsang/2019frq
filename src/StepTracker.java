public class StepTracker
{
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
        double s = 0.0;
        if (days > 0)
        {
            s = (double)steps / (double)days;
        }
        return s;
    }
}