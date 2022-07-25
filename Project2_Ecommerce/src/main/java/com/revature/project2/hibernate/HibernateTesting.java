package com.revature.project2.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.project2.pojo.Customer;

public class HibernateTesting {
public static void main(String[] args) {
	Session session = HibernateUtils.getSessionFactory().openSession();
	Customer c = new Customer("testing73","testpwd","test@test.test");
	Transaction tx = session.beginTransaction();
	session.save(c);
	tx.commit();
}
}
