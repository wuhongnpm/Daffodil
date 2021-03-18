package twtc;

import java.util.Calendar;
import java.util.Date;

public class Demor {
    public static void main(String[] args) {
        //Calendar类是日历类
        Calendar a = Calendar.getInstance();
        Date b = a.getTime();
        Date c = new Date(0);
        a.setTime(c);


    }
}
