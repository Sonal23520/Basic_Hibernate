import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfigure;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("002","Sithara","Galle");
        Session session = FactoryConfigure.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();

    }
}
