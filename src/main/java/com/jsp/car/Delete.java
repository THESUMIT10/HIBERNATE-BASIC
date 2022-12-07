package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("sumit");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	Car car=entityManager.find(Car.class, 3);
	if (car!=null) { entityTransaction.begin();
	    entityManager.remove(car);;
	    entityTransaction.commit();
	    System.out.println("Object deleted");}
	else {
		System.out.println("No such Id found");
	}
	
}
}
