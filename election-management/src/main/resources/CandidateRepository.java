import java.util.List;
import java.util.Set;

public interface CandidateRepository {
    void save(List<Candidate> candidates);

    default void save(Candidate candidate) {
        save(List.of(candidate));
    }

    default List<Candidate> findAll(){
        return find(new CadidateQuery.Builder().build());
    }
    List<Candidate> find(CadidateQuery);

    default Optional<Candidate> findBiId(String id){

        CadidateQuery query = = new CadidateQuery.Builder() builder.ids(Set.of(id)).build();

        return find(query).stream().findFirst();
    }
}
