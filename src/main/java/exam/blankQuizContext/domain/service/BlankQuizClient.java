package exam.blankQuizContext.domain.service;

import java.util.List;

public interface BlankQuizClient {
    List<BlankQuizDto> getBlankQuizzesByIds(List<String> blankQuizIds);
}




