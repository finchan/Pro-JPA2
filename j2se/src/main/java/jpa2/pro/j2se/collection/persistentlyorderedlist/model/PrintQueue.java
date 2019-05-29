package jpa2.pro.j2se.collection.persistentlyorderedlist.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="persistentlyorderedlistprintqueue")
public class PrintQueue {
    @Id
    private String name;
    @OneToMany(mappedBy = "queue")
    @OrderColumn(name="PRINT_ORDER")
    private List<PrintJob> jobs;

    public PrintQueue( ) {
        this.jobs = new ArrayList<PrintJob>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PrintJob> getJobs() {
        return jobs;
    }

    public void addJobs(PrintJob job) {
        this.jobs.add(job);
        job.setQueue(this);
    }
}
