package co.com.ies.smolplus.context.orchestrator.moduleoperator.application.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ies.smolplus.context.orchestrator.moduleoperator.application.ManagerRequestOperatorService;
import co.com.ies.smolplus.context.orchestrator.moduleoperator.domain.ValidateOperartor;
import co.com.ies.smolplus.context.orchestrator.moduleoperator.domain.ForeingOperatorDomain;
import co.com.ies.smolplus.context.orchestrator.moduleoperator.infrastructure.primary.AccountOperatorDTO;


@Service
@Transactional
public class ManagerRequestOperatorServiceImpl implements ManagerRequestOperatorService {

    private final ForeingOperatorDomain foreingOperatorDomain;
    private final ValidateOperartor configOperator;

    public ManagerRequestOperatorServiceImpl(ForeingOperatorDomain foreingOperatorDomain) {
        this.foreingOperatorDomain = foreingOperatorDomain;
        this.configOperator = new ValidateOperartor(foreingOperatorDomain);
    }


    @Override
    public boolean validateOperartor(AccountOperatorDTO account) {
       return configOperator.validateOperartor(account);        
    }
   
}
