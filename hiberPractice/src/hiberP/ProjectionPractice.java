package hiberP;

import java.util.Iterator;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

import java.util.List;

public class ProjectionPractice {

	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hiber.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Criteria ct=s.createCriteria(PojoClass.class);
		ct.setProjection(Projections.property("name"));
		 List lst = ct.list();
			Iterator it = lst.iterator();
        while(it.hasNext()) {
        	//PojoClass st=(PojoClass)it.next();
			System.out.println(it.next());
		}
		s.close();
        
	}

}
