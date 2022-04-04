import com.rls.multithreading.Single;
import org.junit.Test;

public class SingleTest {

    @Test
    public void test(){
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();

        System.out.println(s1 == s2);
    }
}
