package exam.blankQuizContext.userInterface;

import exam.blankQuizContext.domain.model.blankQuiz.BlankQuizId;
import exam.paperContext.userInterface.PaperDTO;

public class BlankQuizDTO {

    public static BlankQuizDTO from(BlankQuizId blankQuizId) {
        return new PaperDTO("blankQuizzes/" + blankQuizId);
    };
}
