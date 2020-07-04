package exam.paperContext.infrastructure;

import exam.blankQuizContext.domain.model.blankQuiz.BlankQuiz;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MemoryBlankQuizReadRepository {
    public List<BlankQuiz> getAllByReversedOrder() {
        return null;
    }
}
