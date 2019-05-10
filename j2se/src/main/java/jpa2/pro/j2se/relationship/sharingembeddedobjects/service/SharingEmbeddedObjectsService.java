package jpa2.pro.j2se.relationship.sharingembeddedobjects.service;

import jpa2.pro.j2se.relationship.sharingembeddedobjects.model.SharingEmbeddedObjectsAddress;
import jpa2.pro.j2se.relationship.sharingembeddedobjects.model.SharingEmbeddedObjectsCompany;
import jpa2.pro.j2se.relationship.sharingembeddedobjects.model.SharingEmbeddedObjectsEmployee;

import javax.persistence.EntityManager;

public class SharingEmbeddedObjectsService {
    protected EntityManager em;

    public SharingEmbeddedObjectsService(EntityManager em) {
        this.em = em;
    }

    public SharingEmbeddedObjectsCompany createCompany(String city, String state, String street, String zipcode, int companyId) {
        SharingEmbeddedObjectsCompany company = new SharingEmbeddedObjectsCompany();
        SharingEmbeddedObjectsAddress address = new SharingEmbeddedObjectsAddress();
        address.setCity(city);
        address.setState(state);
        address.setStreet(street);
        address.setZip(zipcode);
        company.setId(companyId);
        company.setAddress(address);
        em.persist(company);
        return company;
    }

    public SharingEmbeddedObjectsEmployee createEmployee(String city, String province, String street, String postalcode, int id, String name, long salary){
        SharingEmbeddedObjectsEmployee emp = new SharingEmbeddedObjectsEmployee();
        SharingEmbeddedObjectsAddress address = new SharingEmbeddedObjectsAddress();
        address.setCity(city);
        address.setState(province);
        address.setStreet(street);
        address.setZip(postalcode);
        emp.setId(id);
        emp.setAddress(address);
        emp.setName(name);
        emp.setSalary(salary);
        em.persist(emp);
        return emp;
    }
}
