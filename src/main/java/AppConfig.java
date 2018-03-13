import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean(name = "Pitbull")
    public DogInterface getService()
    {
        return new Pitbull();

    }
}
