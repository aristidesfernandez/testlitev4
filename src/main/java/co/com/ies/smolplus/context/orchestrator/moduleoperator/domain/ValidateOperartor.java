package co.com.ies.smolplus.context.orchestrator.moduleoperator.domain;

import co.com.ies.smolplus.dto.moduleoperator.AccountOperatorDTO;

public class ValidateOperartor {

    private final AccountOperatorDTO accountFull = new AccountOperatorDTO();

    public ValidateOperartor(){
        this.accountFull.setUsername("user");
        this.accountFull.setPassword("pass");
    }
    
    public boolean validateOperartor(AccountOperatorDTO account){       
       return account.equals(accountFull);
    }
    
}
