package domain;

public record Candidate(String id,
        Optional<String> photo,
        String givenName,
        String familyName,
        String email,
        Optional<String> phone,
        Optional<String> jobTitle) {

}
