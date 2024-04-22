package infrastructure.resources;

import api.ElectionApi;
import domain.Election;
import org.jboss.resteasy.reactive.ResponseStatus;
import org.jboss.resteasy.reactive.RestResponse;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Path("/api/voting")
public class VotingResources {
    private final ElectionApi api;

    public VotingResources(ElectionApi api) {
        this.api = api;
    }

    @GET
    public List<Election> elections(){
        return api.findAll();
    }

    @POST
    @Path("/election/{electionId}/candidates/{candidateId}")
    @ResponseStatus(RestResponse.StatusCode.ACCEPTED)
    @Transactional
    public void vote(@PathParam("electionId") String electionId, @PathParam("candidateId") String candidateId){
        api.vote(electionId, candidateId);
    }

}
