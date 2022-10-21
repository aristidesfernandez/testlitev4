package co.com.ies.smolplus.context.orchestrator.moduleoperator.domain;

import co.com.ies.smolplus.context.orchestrator.moduleoperator.infrastructure.primary.AccountOperatorDTO;

public class ValidateOperartor {


    private final ForeingOperatorDomain foreingOperatorDomain;

    private final AccountOperatorDTO accountFull = new AccountOperatorDTO();

    public ValidateOperartor(ForeingOperatorDomain foreingOperatorDomain){ 
        this.foreingOperatorDomain = foreingOperatorDomain;
        this.accountFull.setUsername("user");
        this.accountFull.setPassword("pass");
    }

    
    public boolean validateOperartor(AccountOperatorDTO account){       
       return account.equals(accountFull);
    }
    
}
