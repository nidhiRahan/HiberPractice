
package hiberP;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hiber.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session s = sf.openSession();
	    Transaction tx = s.beginTransaction();
	    PojoClass obj = new PojoClass();
	    obj.setRno(109);
	    obj.setName("nidhi");
	    s.update(obj);
	    tx.commit();
	    s.close();

	}

}