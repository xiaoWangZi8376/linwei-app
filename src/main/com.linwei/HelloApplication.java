import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.linwei.firstappproject.*")
@ServletComponentScan(basePackages = "com.linwei.firstappproject.*")
@Slf4j
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
        System.out.print("hello word");
        log.info("hello wore !!!!!!!!! ");
    }
}
