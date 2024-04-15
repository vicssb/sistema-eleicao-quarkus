package infrastructure.repositories;

import domain.Candidate;
import domain.CandidateQuery;
import domain.CandidateRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class SQLCandidateRepository implements CandidateRepository {
    private final EntityManager entityManager;

    public SQLCandidateRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(List<Candidate> candidates) {
        candidates.stream()
                .map(candidate -> {
                    return infrastructure.repositories.entities
                            .Cadidate::fromDomain;
                })<Candidate>
                .forEach(entity -> {
                    entityManager.merge(entity);
        }
    .forEach(entityManager));
    }

    @Override
    public List<Candidate> find(CandidateQuery query) {
        return null;
    }


}
