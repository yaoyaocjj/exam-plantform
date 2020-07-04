package exam.blankQuizContext.domain.model.blankQuiz;

import java.util.List;

public interface BlankQuizRepository {

    BlankQuiz find(BlankQuizId blankQuizId);

    BlankQuizId save(BlankQuiz blankQuiz);

    void update(BlankQuiz blankQuiz);

    List<BlankQuiz> getAll();
}
