package main.java.memoranda;

import main.java.memoranda.date.CalendarDate;

public class Event {
    int type;
    CalendarDate startDate;
    CalendarDate endDate;
    int period;
    int hh;
    int mm;
    String text;
    boolean workDays;
    
    public Event(int type, CalendarDate start, CalendarDate end, int period, int hh, int mm, String text, boolean workDays) {
        this.type = type;
        this.startDate = start;
        this.endDate = end;
        this.period = period;
        this.hh = hh;
        this.mm = mm;
        this.text = text;
        this.workDays = workDays;
    }
}
