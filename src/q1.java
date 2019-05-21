public class q1
{

    private static int dayOfYear(int month, int dayOfMonth, int inYear)
    {
        if (month == 2) {
            dayOfMonth += 31;
        } else if (month == 3) {
            dayOfMonth += 59;
        } else if (month == 4) {
            dayOfMonth += 90;
        } else if (month == 5) {
            dayOfMonth += 31 + 28 + 31 + 30;
        } else if (month == 6) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31;
        } else if (month == 7) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30;
        } else if (month == 8) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31;
        } else if (month == 9) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
        } else if (month == 10) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
        } else if (month == 11) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
        } else if (month == 12) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31;
        }

        if (isLeapYear(inYear)&& (month > 2 || (month ==2 && dayOfMonth == 29)))
        return dayOfMonth +1;

        return dayOfMonth;
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


    // Part B
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
        System.out.println("isLeapYear(2016)?");
        System.out.println(isLeapYear(2016));
        System.out.println("isLeapYear(2017)?");
        System.out.println(isLeapYear(2017));
        System.out.println("dayOfWeek(1,10,2019) == 4?");
        System.out.println(4==dayOfWeek(1,10,2019));
        System.out.println("dayOfYear(3, 1, 2017) == 60?");
        System.out.println(dayOfYear(3, 1, 2017) == 60);
        System.out.println("dayOfYear(3, 1, 2016) == 61?");
        System.out.println(dayOfYear(3, 1, 2016) == 61);

    }


}


