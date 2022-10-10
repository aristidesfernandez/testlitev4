package co.com.ies.smolplus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import co.com.ies.smolplus.common.domain.Generated;

@SpringBootApplication
@Generated(reason = "Not testing logs")
public class Testlitev4App {

  private static final Logger log = LoggerFactory.getLogger(Testlitev4App.class);

  public static void main(String[] args) {
    Environment env = SpringApplication.run(Testlitev4App.class, args).getEnvironment();

    if(log.isInfoEnabled()) {
      log.info(ApplicationStartupTraces.of(env));
    }
  }
}
