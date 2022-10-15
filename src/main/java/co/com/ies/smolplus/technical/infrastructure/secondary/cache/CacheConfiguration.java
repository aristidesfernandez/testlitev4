package co.com.ies.smolplus.technical.infrastructure.secondary.cache;

import javax.cache.CacheManager;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableCaching
class CacheConfiguration {

    public CacheConfiguration(EhcacheProperties ehcacheProperties) {
    }

    public void createCache(CacheManager cm, String string) {
    }
    
}
