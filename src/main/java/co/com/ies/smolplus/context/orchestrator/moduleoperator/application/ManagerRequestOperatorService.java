package co.com.ies.smolplus.context.orchestrator.moduleoperator.application;

import co.com.ies.smolplus.context.orchestrator.moduleoperator.infrastructure.primary.AccountOperatorDTO;

public interface ManagerRequestOperatorService {
    
    boolean validateOperartor(AccountOperatorDTO account);
}
