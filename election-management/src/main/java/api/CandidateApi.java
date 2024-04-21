package api;

import api.dto.out.Candidate;
import domain.CandidateService;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class CandidateApi {
    private final CandidateService service;

    public CandidateApi(CandidateService service) {
        this.service = service;
    }

    public void create(api.dto.in.CreateCandidate dto) {
        service.save(dto.toDomain().toDomain());
    }

    public api.dto.out.Candidate upadate(String id, api.dto.in.UpadateCandidate dto){
        service.save(dto.toDomain(id));

       domain.Candidate candidate = service.findById(id);

       return api.dto.out.Candidate.fromDomain(candidate);
    }

    public List<Candidate> list() {
        return service.findAll().stream().map(candidate -> api.dto.out.Candidate.fromDomain(candidate)).toList();
    }
}
