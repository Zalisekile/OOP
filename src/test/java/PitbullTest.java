import  org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PitbullTest {
    private DogInterface Zakes;


    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Zakes = (DogInterface)ctx.getBean("Pitbull");

    }

    @Test
    public void eat() throws Exception {
    }

    @Test
    public void bark() throws Exception
    {
       String bark =  Zakes.bark("hawuf");
       System.out.print(bark);
        assert(bark.equals("hawuf hawuf hawuf"));
    }

}