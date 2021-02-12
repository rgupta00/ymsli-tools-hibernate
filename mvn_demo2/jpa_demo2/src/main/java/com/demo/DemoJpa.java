package com.demo;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DemoJpa {

	public static void main(String[] args) {
		// SessionFactory ---- EntityMangagerFactory
		// Persistance unit
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.yms.pu");

		// Session ---------- EntityManager
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			Customer customer = new Customer("raj", "delhi", "797987798", "r@gmail.com", new Date());

			em.persist(customer);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}

		em.close();
		emf.close();

	}
}
