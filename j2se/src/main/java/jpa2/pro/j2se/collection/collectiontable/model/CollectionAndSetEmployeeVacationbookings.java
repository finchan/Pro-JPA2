package jpa2.pro.j2se.collection.collectiontable.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;

@Embeddable
public class CollectionAndSetEmployeeVacationbookings {
    @Temporal(TemporalType.DATE)
    private Calendar startDate;
    @Column(name="DAYS_GENERIC")
    private int daysTaken;

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public int getDaysTaken() {
        return daysTaken;
    }

    public void setDaysTaken(int daysTaken) {
        this.daysTaken = daysTaken;
    }

    public String toString() {
        return "VacationEntry startDate: " + getStartDate().getTime() +
                ", daysTaken: " + getDaysTaken();
    }
}
