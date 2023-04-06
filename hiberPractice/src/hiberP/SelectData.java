
package hiberP;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectData {

	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hiber.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from PojoClass s");
		List lst=q.list();
		Iterator<PojoClass> it=lst.iterator();
		while(it.hasNext()) {
		PojoClass st=it.next();
			System.out.println(st.getRno()+" "+st.getName());
		}
		s.close();
	}

}
