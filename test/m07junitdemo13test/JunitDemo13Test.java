package m07junitdemo13test;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

import java.io.File;
import java.math.BigDecimal;

/**
 * @author manuel y angel
 */

public class JunitDemo13Test {
    static ObjectContainer db;
    @ClassRule
    public static final ExternalResource resource = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            System.out.println("\tCreando base de datos");
            db = Db4oEmbedded.openFile("db.dbo");
        };

        @Override
        protected void after() {
            db.close();
            new File("db.dbo").deleteOnExit();
            System.out.println("\tBase de datos cerrada y eliminada");
        };
    };
    @Test
    public void test1() {
        System.out.println("\tInserts");
        db.store(new BigDecimal(7));
        db.store(new BigDecimal(0));

        System.out.println("\tConsultas");
        Predicate p = new Predicate<BigDecimal>() {
            @Override
            public boolean match(BigDecimal bg) {
                return true;
            }
        };
        ObjectSet<BigDecimal> result = db.query(p);
        for (BigDecimal bigDecimal : result) {
            System.out.print(bigDecimal + " ");
        }
        System.out.println();
    }
}
