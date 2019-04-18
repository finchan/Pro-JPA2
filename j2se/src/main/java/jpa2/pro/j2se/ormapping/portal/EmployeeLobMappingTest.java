package jpa2.pro.j2se.ormapping.portal;

import jpa2.pro.j2se.ormapping.model.EmployeeLobMapping;
import jpa2.pro.j2se.ormapping.service.EmployeeLobMappingService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.*;

public class EmployeeLobMappingTest {
    public static void main(String[] args) throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();

        File file = new File("C:\\Users\\j\\Pictures\\Saved Pictures\\icon2.jpg");
        FileInputStream in = new FileInputStream(file);
        byte[] pic = getStreamBytes(in);
        System.out.println(pic.length);
        em.getTransaction().begin();
        EmployeeLobMappingService ems = new EmployeeLobMappingService(em);
        ems.addEmployee(1, "Xavier", 100000, pic);
        em.getTransaction().commit();
    }

    public static byte[] getStreamBytes(InputStream is) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = is.read(buffer)) != -1) {
            baos.write(buffer, 0, len);
        }
        byte[] b = baos.toByteArray();
        is.close();
        baos.close();
        return b;
    }
}
