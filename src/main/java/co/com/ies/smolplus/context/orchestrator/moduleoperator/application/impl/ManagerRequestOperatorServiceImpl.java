package co.com.ies.smolplus.context.orchestrator.moduleoperator.application.impl;

import org.springframework.stereotype.Service;

import co.com.ies.smolplus.context.orchestrator.moduleoperator.application.ManagerRequestOperatorService;
import co.com.ies.smolplus.context.orchestrator.moduleoperator.domain.ForeingOperatorDomain;


@Service
public class ManagerRequestOperatorServiceImpl implements ManagerRequestOperatorService {

    private final ForeingOperatorDomain foreingOperatorDomain;
   

    public ManagerRequestOperatorServiceImpl(ForeingOperatorDomain foreingOperatorDomain) {
        this.foreingOperatorDomain = foreingOperatorDomain;
    }

   
}
