package exam.blankQuizContext.userInterface;


import exam.blankQuizContext.application.BlankQuizApplicationService;
import exam.blankQuizContext.application.BlankQuizCommand;
import exam.blankQuizContext.domain.model.blankQuiz.BlankQuiz;
import exam.blankQuizContext.domain.model.blankQuiz.BlankQuizId;
import exam.paperContext.application.AssemblePaperCommand;
import exam.paperContext.application.PaperApplicationService;
import exam.paperContext.domain.model.paper.Paper;
import exam.paperContext.domain.model.paper.PaperId;
import exam.paperContext.infrastructure.MemoryBlankQuizReadRepository;
import exam.paperContext.userInterface.PaperDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlankQuizController {
    private BlankQuizApplicationService blankQuizApplicationService;
    private MemoryBlankQuizReadRepository blankQuizReadRepository;

    @Autowired
    public BlankQuizController(BlankQuizApplicationService blankQuizApplicationService, MemoryBlankQuizReadRepository blankQuizReadRepository) {
        this.blankQuizApplicationService = blankQuizApplicationService;
        this.blankQuizReadRepository = blankQuizReadRepository;
    }

    @PostMapping("/blank-quiz")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    BlankQuizDTO create(@RequestBody BlankQuiz blankQuiz) {
        final BlankQuizId blankQuizId = blankQuizApplicationService.saveBlankQuiz(blankQuiz);
        return BlankQuizDTO.from(blankQuizId);
    }

    @GetMapping("/blank-quizzes}")
    List<BlankQuiz> getAll() {
        return blankQuizReadRepository.getAllByReversedOrder();
    }

    @PutMapping("/blank-quiz/{blankQuizId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void update(@RequestBody BlankQuiz blankQuiz) {
        blankQuizApplicationService.saveBlankQuiz(blankQuiz);
    }
}
