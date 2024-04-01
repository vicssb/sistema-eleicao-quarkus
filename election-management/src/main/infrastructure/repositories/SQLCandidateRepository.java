package infrastructure.repositories;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import domain.Candidate;
import domain.CandidateRepository;

@ApplicationScoped
public class SQLCandidateRepository implements CandidateRepository {
    @Override
    public void save(List<Candidate> candidates) {

    }

    @Override
    public List<Candidate> findAll() {
        return List.of();
    }
}
