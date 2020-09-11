package site.javaee.annotation;

import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnnotationApplicationTests {

    @Test
    void contextLoads() {
        SimpleHash simpleHash = new SimpleHash(Sha256Hash.ALGORITHM_NAME, "123456", null, 1024);
        System.out.println(simpleHash.toHex().toString());
    }

}
