package jpa2.pro.j2se.collection.persistentlyorderedlist.service;

import jpa2.pro.j2se.collection.persistentlyorderedlist.model.PrintJob;
import jpa2.pro.j2se.collection.persistentlyorderedlist.model.PrintQueue;

import javax.persistence.EntityManager;

public class PrintService {
    private EntityManager em;

    public PrintService(EntityManager em) {
        this.em = em;
    }

    public PrintQueue createPrintQueue(String name) {
        PrintQueue queue = new PrintQueue();
        queue.setName(name);
        em.persist(queue);
        return queue;
    }

    public PrintJob createPrintJob(int id, String queue_name) {
        PrintQueue queue = em.find(PrintQueue.class, queue_name);
        if(queue == null) {
            return null;
        }
        PrintJob job = new PrintJob();
        job.setId(id);
        queue.addJobs(job);
        em.persist(job);
        return job;
    }
}
