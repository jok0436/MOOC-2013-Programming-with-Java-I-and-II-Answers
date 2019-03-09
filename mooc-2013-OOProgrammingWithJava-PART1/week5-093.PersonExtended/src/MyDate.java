
public class MyDate {

    public int day;
    public int month;
    public int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
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

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate) {
        int totaldays1 = this.day + (this.month * 30) + (this.year * 360);
        int totaldays2 = comparedDate.day + (comparedDate.month * 30) + (comparedDate.year * 360);
        int daysDifference = Math.max(totaldays1, totaldays2) - Math.min(totaldays1, totaldays2);
        return daysDifference / 360;
    }

    public int daysOld() {
        return this.day + (this.month * 30) + (this.year * 360);
    }
}
