import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by SHANE on 2015/09/08.
 */
@Configuration
public class AppConfig {
    @Bean(name="junior")
    public Subject getService()
    {
        return new JuniorYear();
    }
}
