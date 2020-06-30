package exam.blankQuizContext.domain.model.blankQuiz;

import java.util.List;

public interface BlankQuizRepository {

    BlankQuiz find(BlankQuizId blankQuizId);

    void save(BlankQuiz blankQuiz);

    List<BlankQuiz> getAll();
}
