package co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.application;

import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.infrastructure.primary.dto.RestBetDTO;

public interface ManagerRequestBingoDataService {

    RestBetDTO generateBetBingo(RestBetDTO requestBet);

    boolean isBingoGame(String gameName);
    
}
