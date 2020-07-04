package exam.blankQuizContext.application;

import exam.blankQuizContext.domain.model.blankQuiz.BlankQuiz;
import exam.blankQuizContext.domain.model.blankQuiz.BlankQuizId;
import exam.blankQuizContext.domain.model.blankQuiz.BlankQuizRepository;
import exam.paperContext.domain.service.BlankQuizClient;
import exam.paperContext.domain.service.BlankQuizDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlankQuizApplicationService {
    private BlankQuizRepository blankQuizRepository;
    private BlankQuizClient blankQuizClient;

    private List<BlankQuizDto> getBlankQuizzesByIds(List<String> blankQuizIds) {
        return blankQuizClient.getBlankQuizzesByIds(blankQuizIds);
    }

    @Autowired
    public BlankQuizApplicationService(BlankQuizRepository blankQuizRepository) {
        this.blankQuizRepository = blankQuizRepository;
    }

    public BlankQuizId saveBlankQuiz(BlankQuiz blankQuiz) {
        return blankQuizRepository.save(blankQuiz);
    }

    public BlankQuiz getBlankQuizById(BlankQuizId blankQuizId) {
        return blankQuizRepository.find(blankQuizId);
    }

    public void updateBlankQuiz(BlankQuiz blankQuiz) {
        blankQuizRepository.update(blankQuiz);
    }

    public List<BlankQuiz> getAll() {
        return blankQuizRepository.getAll();
    }
}
