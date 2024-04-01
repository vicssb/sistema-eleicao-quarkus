
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.util.Optional;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CandidateServiceTest {

    @Inject
    CandidateServiceTest service;

    @Test
    void save() {
        // Candidate candidate = new Candidate("", Optional.empty(), "", "",
        // Optional.empty(), Optional.empty());
        // service.save(candidate);

        // verify(repository).save(candidate);
        // verifyNoMoreInteractions(repository);
    }

    @Test
    void findAll() {
        service.findAll();
    }
}
