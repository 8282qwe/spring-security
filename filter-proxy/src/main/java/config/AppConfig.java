package config;

import filter.RealFilter;
import jakarta.servlet.Filter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Filter realFilter() {
        return new RealFilter();
    }
}
