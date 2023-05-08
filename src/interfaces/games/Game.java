package interfaces.games;

public class Game {
    public static void play(RuleSet rule, Move m, Board b) {
        if (rule.isLegal(m, b))
            rule.makeMove(m);
        else
            System.out.println("Levizja nuk lejohet!");
    }

    public static void main(String[] args) {
        Move pijuniMove = new Move();
        Board chessBoard = new Board(8, 8);
        ChessRuleSet chessRule = new ChessRuleSet();
        play(chessRule, pijuniMove, chessBoard);

        Move redMove = new Move();
        Board checkersBoard = new Board(20, 20);
        CheckersRuleSet checkersRuleSet = new CheckersRuleSet();
        play(checkersRuleSet, redMove, checkersBoard);

    }
}




