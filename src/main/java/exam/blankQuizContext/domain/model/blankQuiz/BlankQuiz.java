package exam.blankQuizContext.domain.model.blankQuiz;


import exam.paperContext.domain.shared.Entity;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(of = {"blankQuizId"})
public class BlankQuiz implements Entity<BlankQuiz> {
    private BlankQuizId blankQuizId;
    private String question;
    private String answer;
    private Integer score;

    private BlankQuiz(BlankQuizId blankQuizId, String question, String answer, Integer score) {
        this.blankQuizId = blankQuizId;
        this.question = question;
        this.answer = answer;
        this.score = score;
    }

    public static BlankQuiz update(BlankQuizId blankQuizId, String question, String answer, Integer score) {
        return new BlankQuiz(blankQuizId, question, answer, score);
    }

    public BlankQuizId getBlankQuizId() {
        return blankQuizId;
    }

    public Integer getScore() {
        return score;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public boolean sameIdentityAs(BlankQuiz other) {
        return blankQuizId.sameValueAs(other.getBlankQuizId());
    }
}

