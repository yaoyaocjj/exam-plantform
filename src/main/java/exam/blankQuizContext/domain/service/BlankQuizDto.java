package exam.blankQuizContext.domain.service;

import exam.blankQuizContext.domain.model.blankQuiz.BlankQuiz;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BlankQuizDto {
    private String quizId;
    private int score;

    public static BlankQuiz toBlankQuiz(BlankQuizDto blankQuizDto) {
        // TODO map BlankQuizDto to BlankQuiz
        return null;
    }
}
