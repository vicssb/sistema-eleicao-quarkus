import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import io.quarkus.test.junit.mockito.InjectMock;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import javax.inject.Inject;

@QuarkusTest
public class CandidateServiceTest {

    @Inject
    CandidateServiceTest service;

    @InjectMock
    CandidateRepository repository;

    @Test
    void save() {
        Candidate candidate = Instacio.create(Candidate.class);
        // Candidate candidate = new Candidate("", Optional.empty(), "", "",
        // Optional.empty(), Optional.empty());
        service.save(candidate);

        verify(repository).save(candidate);
        verifyNoMoreInteractions(repository);
    }

    @Test
    void findAll() {
        List<Candidate> candidates = Instancio.stream(Candidate.class).limit(10).toList();

        when(repository.findAll().thenReturn(candidates));

        verify(repository).findAll();
        verifyNoMoreInteractions(repository);

        assertEquals(candidates, result);
    }

    @Test
    void findById_whenCandidateIsFound_returnCandidate() {
        Candidate candidate = Instancio.create(Candidate.class);

        when(repository.findById().thenReturn(Optional.of(candidate)));

        Candidate result = service.findById(candidate.id());

        verify(repository).findById(candidate.id());
        verifyNoMoreInteractions(repository);

        assertEquals(candidate, result);
    }

    @Test
    void findById_whenCandidateIsNotFound_throwsExeption() {
        Candidate candidate = Instancio.create(Candidate.class);

        when(repository.findById().thenReturn(Optional.empty()));

        assertThrows(NoSuchElementExeption.class, () -> service.findById(candidate.id()));

        verify(repository).findById(candidate.id());
        verifyNoMoreInteractions(repository);
    }
}
