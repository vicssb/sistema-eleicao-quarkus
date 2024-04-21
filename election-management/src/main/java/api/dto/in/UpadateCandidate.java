package api.dto.in;

import infrastructure.repositories.entities.Candidate;

import java.util.Optional;

public record UpadateCandidate(Optional<String> photo,
                               String givenName,
                               String familyName,
                               String email,
                               Optional<String> phone,
                               Optional<String> job_title) {

    public domain.Candidate toDomain(String id) {
        return new Candidate(id, photo(), givenName(), familyName(), email(), phone(), job_title()).toDomain();
    }
}
