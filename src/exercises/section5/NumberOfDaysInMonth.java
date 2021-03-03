package exercises.section5;

import exercises.section4.LeapYear;

public class NumberOfDaysInMonth {

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        int days = -1;
        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                days = (LeapYear.isLeapYear(year) ? 29 : 28);
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                days = -1;
        }
        return days;
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));// → should return 31 since January has 31 days.
        System.out.println(getDaysInMonth(2, 2020));// → should return 29 since February has 29 days in a leap year and 2020 is a leap year.
        System.out.println(getDaysInMonth(2, 2018));// → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
        System.out.println(getDaysInMonth(-1, 2020));//; → should return -1 since the parameter month is invalid.
        System.out.println(getDaysInMonth(1, -2020));//; → should return -1 since the parameter year is outside the range of 1 to 9999.
    }
}
