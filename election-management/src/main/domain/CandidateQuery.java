package domain;

import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public interface CandidateQuery {

    Optional<Set<String>> ids();
    Optional<String> name();
    class Builder extends CandidateQuery_Builder {

    }
}
