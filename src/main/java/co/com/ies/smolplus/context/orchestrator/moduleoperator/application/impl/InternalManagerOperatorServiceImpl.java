package co.com.ies.smolplus.context.orchestrator.moduleoperator.application.impl;

import org.springframework.stereotype.Service;

import co.com.ies.smolplus.context.orchestrator.moduleoperator.application.InternalManagerOperatorService;
import co.com.ies.smolplus.context.orchestrator.moduleoperator.domain.ValidateOperartor;
import co.com.ies.smolplus.dto.moduleoperator.AccountOperatorDTO;

@Service
public class InternalManagerOperatorServiceImpl implements InternalManagerOperatorService {


    private final ValidateOperartor configOperator;

    public InternalManagerOperatorServiceImpl() {
        this.configOperator = new ValidateOperartor();
    }

    @Override
    public boolean validateOperartor(AccountOperatorDTO account) {
       return configOperator.validateOperartor(account);        
    }

   
   
}
