package exam.blankQuizContext.infrastructure;

import exam.blankQuizContext.domain.model.blankQuiz.BlankQuiz;
import exam.blankQuizContext.domain.model.blankQuiz.BlankQuizId;
import exam.blankQuizContext.domain.model.blankQuiz.BlankQuizRepository;
import exam.paperContext.domain.model.paper.Paper;
import exam.paperContext.domain.model.paper.PaperId;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class MemoryBlankQuizRepository implements BlankQuizRepository {

    private Set<BlankQuiz> papers = new HashSet<>();

    @Override
    public BlankQuiz find(BlankQuizId blankQuizId) {
        return papers.stream().filter(paper-> {
            return paper.getBlankQuizId().equals(blankQuizId);
        }).findFirst().orElseThrow(NullPointerException::new);
    }

    @Override
    public void save(BlankQuiz blankQuiz) {
        papers.add(blankQuiz);
    }


    @Override
    public List<BlankQuiz> getAll() {
        return papers.stream().collect(Collectors.toList());
    }
}
