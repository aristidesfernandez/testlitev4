package co.com.ies.smolplus.technical.infrastructure.secondary.cache;

import static org.mockito.Mockito.*;

import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.configuration.Configuration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import co.com.ies.smolplus.UnitTest;

@UnitTest
@ExtendWith(MockitoExtension.class)
class CacheConfigurationTest {

  private static final CacheConfiguration cacheConfiguration = new CacheConfiguration(new EhcacheProperties());

  @Mock
  CacheManager cm;

  @Mock
  Cache<Object, Object> cache;

  @Mock
  Configuration<Object, Object> customConfig;

  @Test
  void shouldCreateDefaultCache() {
    cacheConfiguration.createCache(cm, "shouldCreateDefaultCache");
    verify(cm).createCache(eq("shouldCreateDefaultCache"), any());
  }


}