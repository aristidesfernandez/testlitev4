package co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.domain;


public class IsGame {

    private static final String GAME_BINGO = "BINGO";

    private final ForeingBingoDataDomain foreingBingoDataDomain;

    public IsGame(ForeingBingoDataDomain foreingBingoDataDomain){ 
        this.foreingBingoDataDomain = foreingBingoDataDomain;
    }

    public boolean isBingoGame(String gameName){
        return GAME_BINGO.contains(gameName);
    }
    
    
}
