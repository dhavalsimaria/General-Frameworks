/**
 * 
 */
package com.dhaval.general;

/**
 * @author Dhaval Simaria
 *
 */
public class SundayOnFirst {

    public static void main(String[] args) {
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        int ctr = 0;
        int index = 0;

        if (1900 % 400 == 0) {
            index = index + (366 % 7);
            System.out.println("Initial index: " + index);
        } else {
            index = index + (365 % 7);
            System.out.println("Initial index: " + index);
        }

        for (int i = 1901; i <= 2000; i++) {
            for (int j = 1; j <= 12; j++) {
                switch (j) {
                case 1:
                    index = (index + 3) % 7;
                    ctr = checkSunday(ctr, days, index);
                    break;

                case 2:
                    if (i % 4 == 0 || i % 400 == 0)
                        index = (index + 1) % 7;
                    else
                        index = (index + 0) % 7;

                    ctr = checkSunday(ctr, days, index);
                    break;

                case 3:
                    index = (index + 3) % 7;
                    ctr = checkSunday(ctr, days, index);
                    break;

                case 4:
                    index = (index + 2) % 7;
                    ctr = checkSunday(ctr, days, index);
                    break;

                case 5:
                    index = (index + 3) % 7;
                    ctr = checkSunday(ctr, days, index);
                    break;

                case 6:
                    index = (index + 2) % 7;
                    ctr = checkSunday(ctr, days, index);
                    break;

                case 7:
                    index = (index + 3) % 7;
                    ctr = checkSunday(ctr, days, index);
                    break;

                case 8:
                    index = (index + 3) % 7;
                    ctr = checkSunday(ctr, days, index);
                    break;

                case 9:
                    index = (index + 2) % 7;
                    ctr = checkSunday(ctr, days, index);
                    break;

                case 10:
                    index = (index + 3) % 7;
                    ctr = checkSunday(ctr, days, index);
                    break;

                case 11:
                    index = (index + 2) % 7;
                    ctr = checkSunday(ctr, days, index);
                    break;

                case 12:
                    index = (index + 3) % 7;
                    ctr = checkSunday(ctr, days, index);
                    break;
                }
            }
        }

        System.out.println("No. of Sundays on first of any month: " + ctr);
    }

    public static int checkSunday(int ctr, String days[], int updatedIndex) {

        String tempDay = days[updatedIndex];
        // ctr = tempDay.equals("Sunday") ? ctr++ : ctr;
        if (tempDay.equals("Sunday"))
            ctr = ctr + 1;

        return ctr;
    }
}
