package co.com.ies.smolplus.context.orchestrator.moduleoperator.infrastructure.secondary;

import org.springframework.stereotype.Service;

import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.application.InternalManagerBingoDataService;
import co.com.ies.smolplus.context.orchestrator.moduleoperator.domain.ForeingOperatorDomain;


@Service
public class ForeingOperatorDomainImpl implements ForeingOperatorDomain {

    private final InternalManagerBingoDataService managerBingoDataService;

    public ForeingOperatorDomainImpl(InternalManagerBingoDataService managerBingoDataService) {
        this.managerBingoDataService = managerBingoDataService;
    }
       
}
