package site.javaee.annotation;

import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnnotationApplicationTests {

    @Test
    void contextLoads() {
        String password =  new SimpleHash("SHA-256","123456",null,1024).toBase64();
        System.out.println(password);
    }

}
