package co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.infrastructure.secondary;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.domain.ForeingBingoDataDomain;
import co.com.ies.smolplus.context.orchestrator.moduleoperator.application.ManagerRequestOperatorService;
import co.com.ies.smolplus.context.orchestrator.moduleoperator.infrastructure.primary.AccountOperatorDTO;


@Service
@Transactional
public class ForeingBingoDataServiceImpl implements ForeingBingoDataDomain {

    private final ManagerRequestOperatorService requestOperatorService;

    public ForeingBingoDataServiceImpl(ManagerRequestOperatorService requestOperatorService) {
        this.requestOperatorService = requestOperatorService;
    }

    @Override
    public boolean validateOperartor(AccountOperatorDTO account) {
        return requestOperatorService.validateOperartor(account);
    }
 
}
