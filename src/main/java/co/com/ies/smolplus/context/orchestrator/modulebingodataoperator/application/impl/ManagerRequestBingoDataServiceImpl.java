package co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.application.impl;

import org.springframework.stereotype.Service;

import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.application.InternalManagerBingoDataService;
import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.application.ManagerRequestBingoDataService;
import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.domain.GenerateBetBingo;
import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.domain.IsGame;
import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.infrastructure.primary.dto.RestBetDTO;
import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.domain.ForeingBingoDataDomain;

@Service
public class ManagerRequestBingoDataServiceImpl implements ManagerRequestBingoDataService {

    private final ForeingBingoDataDomain foreingBingoDataDomain;
    private final InternalManagerBingoDataService internalManagerBingoDataService;
    private final GenerateBetBingo generateBetBingo;
    private final IsGame isGame;

    public ManagerRequestBingoDataServiceImpl(ForeingBingoDataDomain foreingBingoDataDomain, InternalManagerBingoDataService internalManagerBingoDataService) {
        this.foreingBingoDataDomain = foreingBingoDataDomain;
        this.internalManagerBingoDataService = internalManagerBingoDataService;
        this.generateBetBingo = new GenerateBetBingo(foreingBingoDataDomain);
        this.isGame = new IsGame(foreingBingoDataDomain);
    }

    @Override
    public RestBetDTO generateBetBingo(RestBetDTO requestBet) {  
        generateBetBingo.bet(requestBet);
        return new RestBetDTO(); // obtener
    }

    @Override
    public boolean isBingoGame(String gameName) {
        return isGame.isBingoGame(gameName);
    }
   
}
