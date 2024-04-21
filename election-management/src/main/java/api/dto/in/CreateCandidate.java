package api.dto.in;

import infrastructure.repositories.entities.Candidate;

import java.util.Optional;

public record CreateCandidate(Optional<String>photo,
                            String givenName,
                            String familyName,
                            String email,
                            Optional<String> phone,
                            Optional<String> job_title) {

    public domain.Candidate toDomain(){
        return Candidate.create(photo(), givenName(), familyName(), email(), phone(), job_title());

    }
}
