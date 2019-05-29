package jpa2.pro.j2se.collection.persistentlyorderedlist.model;

import javax.persistence.*;

@Entity
@Table(name="persistentlyorderedlistprintjob")
public class PrintJob {
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name="QUEUE_NAME")
    private PrintQueue  queue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PrintQueue getQueue() {
        return queue;
    }

    public void setQueue(PrintQueue queue) {
        this.queue = queue;
    }
}
