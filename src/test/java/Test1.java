import com.sxt.ytwl.utils.SHA512ForPwd;
import org.apache.shiro.crypto.hash.Sha512Hash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test1 {
    @Autowired
    SHA512ForPwd sha512ForPwd;
    @Test
    public void pwd(){
        Sha512Hash pwd = new Sha512Hash("123", "zhangsan",1024);
        System.out.println(pwd.toString());
    }
    @Test
    public void test1(){
        String zhangsan = sha512ForPwd.encryptPwd("123", "zhangsan", 1024);
        System.out.println(zhangsan);
    }
}
