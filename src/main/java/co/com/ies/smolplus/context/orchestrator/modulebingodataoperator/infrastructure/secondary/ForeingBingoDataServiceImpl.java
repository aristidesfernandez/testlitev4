package co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.infrastructure.secondary;

import org.springframework.stereotype.Service;

import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.domain.ForeingBingoDataDomain;
import co.com.ies.smolplus.context.orchestrator.moduleoperator.application.InternalManagerOperatorService;
import co.com.ies.smolplus.context.orchestrator.moduleoperator.infrastructure.primary.AccountOperatorDTO;


@Service
public class ForeingBingoDataServiceImpl implements ForeingBingoDataDomain {

    private final InternalManagerOperatorService managerOperatorService;

    public ForeingBingoDataServiceImpl(InternalManagerOperatorService managerOperatorService) {
        this.managerOperatorService = managerOperatorService;
    }

    @Override
    public boolean validateOperartor(AccountOperatorDTO account) {
        return managerOperatorService.validateOperartor(account);
    }
 
}
