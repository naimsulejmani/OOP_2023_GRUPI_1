package interfaces.games;

public class CheckersRuleSet implements RuleSet {
    @Override
    public boolean isLegal(Move m, Board b) {
        return true;
    }

    @Override
    public void makeMove(Move m) {
        System.out.println("Kuq e zi si shqiponja");
    }
}
