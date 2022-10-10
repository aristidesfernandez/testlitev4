package co.com.ies.smolplus.technical.infrastructure.secondary.postgresql;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages =  { "co.com.ies.smolplus" }, enableDefaultTransactions = false)
public class DatabaseConfiguration {}
