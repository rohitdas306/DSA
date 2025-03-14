
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
         if (month < 3) {
            month += 12;
            year--;
        }

        int K = year % 100; // Year of the century
        int J = year / 100; // Zero-based century

        int h = (day + (13 * (month + 1)) / 5 + K + (K / 4) + (J / 4) + (5 * J)) % 7;

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        return days[h];
    }
}