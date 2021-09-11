package testGit_01;

import com.hapy.git.HelloGit;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestHelloGit {

    @Test
    public void Test1(){
        Constructor<HelloGit> constructor;
        HelloGit helloGit = null;
        try {
            constructor = HelloGit.class.getConstructor();
            helloGit = constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert helloGit != null;
        helloGit.helloGit();
        System.out.println("分支添加....");
    }
}
