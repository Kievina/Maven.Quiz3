package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSORS;

    private RockPaperScissorHandSign sign;

    public RockPaperScissorHandSign getWinner() {
        if(sign == (RockPaperScissorHandSign.ROCK))
            return PAPER;
        else if(sign == (RockPaperScissorHandSign.PAPER))
            return SCISSORS;
        else
            return ROCK;
    }

    public RockPaperScissorHandSign getLoser() {

        if(sign == (RockPaperScissorHandSign.PAPER))
            return ROCK;
        else if(sign == (RockPaperScissorHandSign.SCISSORS))
            return PAPER;
        else
            return SCISSORS;
    }
}
