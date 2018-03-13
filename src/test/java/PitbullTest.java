import static org.junit.Assert.*;

public class PitbullTest {
    Pitbull Zakes = new Pitbull();

    @org.junit.Test
    public void eat() throws Exception {
    }

    @org.junit.Test
    public void bark() throws Exception
    {
       String bark =  Zakes.bark("hawuf");
       System.out.print(bark);
        assert(bark.equals("hawuf hawuf hawuf"));
    }

}