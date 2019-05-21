public class q1
{

    private static int dayOfYear(int inMonth, int inDay, int inYear)
    {
        return (inMonth-1)*30 + inDay;


    }

    public static boolean isLeapYear(int year)
    {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    public static int firstDayOfYear(int year)
    {
        return dayOfYear(1,1,year);
    }



    // Part A
    public static int numberOfLeapYears(int year1, int year2)
    {
        int count = 0;
        for(int i = year1; i < year2+1; i++)
        {
            if(isLeapYear(i))
            {
                count++;
            }
        }

        return count;
    }

    public static int dayOfWeek(int inMonth, int inDay, int inYear)
    {
        int  month, year, day,c;
        year = inYear;
        day = inDay;

        if (inMonth < 3) {
            year--;
            inMonth = inMonth +10;
        }
        else {
            inMonth = inMonth -2;
        }

        month = inMonth;


        c = year/100;
        year = year%100;

        int A = (int) (day+((2.6*month)-0.2)+year+(year/4)+(c/4)-(2*c));

        int x = A % 7;

        if (x < 0) {
            x+=7;
        }

        return x;
    }

    public static void main(String [] args)
    {


    }


}


