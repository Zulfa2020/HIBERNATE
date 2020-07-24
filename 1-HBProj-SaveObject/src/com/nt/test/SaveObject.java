package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Product;

public class SaveObject {

	public static void main(String[] args) {
		Configuration cfg=null;
		SessionFactory fac=null;
		Session ses=null;
		Product prod=null;
		Transaction tx=null;
		boolean flag=false;
		
		//activate Hibernate framework 
		cfg=new Configuration();
		//supply hibernate cfg file as input file
		cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
		//build Session Factory
		fac=cfg.buildSessionFactory();
		//open session
		ses=fac.openSession();
		//create Entity object to save with DB s/w
		prod=new Product();
		prod.setPid(103);
		prod.setPname("Table");
		prod.setPrice(5000);
		prod.setQty(5);
		
		
		try {
			tx=ses.beginTransaction(); //internally calls con.autoCommit(false)
			//save object
			ses.save(prod);
			flag=true;
			System.out.println("Object is Saved");
		}
		catch(HibernateException he) {
			he.printStackTrace();
			flag=false;
		}
		finally {
			//commit or rollback transaction
			if(flag==true)
				tx.commit();//internally calls con.commit()
			else
				tx.rollback();//internally calls con.rollback()
	
		//close session object 
			ses.close();
		//close SessionFactory	
		     fac.close();
		}//finally
		
		
	}//main
}//class
