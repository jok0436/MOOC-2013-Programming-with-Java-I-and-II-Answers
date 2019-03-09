
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        int totaldays1 = this.day + (this.month * 30) + (this.year * 360);
        int totaldays2 = comparedDate.day + (comparedDate.month * 30) + (comparedDate.year * 360);
        int daysDifference = Math.max(totaldays1, totaldays2) - Math.min(totaldays1, totaldays2);
        return daysDifference / 360;
    }

}
