package utils;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class CommonUtils {

    private CommonUtils() {
    }

    // <<<<<<<<<<<<<<< Date Utils >>>>>>>>>>>>>>>>>>>>

    static int getDayFromDate(String date, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format).withLocale(Locale.UK);
        return formatter.parse(date).get(ChronoField.DAY_OF_MONTH);
    }

    static int getMonthFromDate(String date, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format).withLocale(Locale.UK);
        return formatter.parse(date).get(ChronoField.MONTH_OF_YEAR);
    }

    static int getYearFromDate(String date, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format).withLocale(Locale.UK);
        return formatter.parse(date).get(ChronoField.YEAR);
    }
}
