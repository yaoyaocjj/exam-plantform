package exam.blankQuizContext.userInterface;

import exam.blankQuizContext.domain.model.blankQuiz.BlankQuizId;

public class BlankQuizDTO {
    private String uri;

    public static BlankQuizDTO from(BlankQuizId paperId) {
        return new BlankQuizDTO("blank-quiz/" + paperId);
    };
}
