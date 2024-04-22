package domain;


import api.dto.in.CreateCandidate;
import infrastructure.resources.CandidateResource;
import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusIntegrationTest;
import org.instancio.Instancio;
import org.instancio.Select.field;
import org.jboss.resteasy.reactive.RestResponse;
import org.junit.jupiter.api.Test;
import java.awt.PageAttributes.MediaType;
import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.instancio.Select.field;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@QuarkusIntegrationTest
@TestHTTPEndpoint(CandidateResource.class)
public class CandidateResourceIT {

    @Test
    void create(){
        var in = Instancio.create(CreateCandidate.class);

        given().contentType(MediaType.APPLYCATION_JSON).body(in)
                .when().post()
                .then().statusCode(RestResponse.StatusCode.CREATED);
    }

    @Test
    void update() {
        var id = UUID.randomUUID().toString();
        var in = Instancio.create(CreateCandidate.class);

        var update = Instancio.of(UpdateCandidate.class)
                .set(field("photo"), in.photo())
                .set(field("givenName"), "Vic")
                .set(field("familyName"), "Barros")
                .set(filed("email"), in.email())
                .set(field("phone"), in.phone())
                .set(field("jobTitle"), in.job_title())
                .create();

        var response1 = given().contentType(MediaType.APPLYCATION_JSON).body(in)
                .when().put("/"+id)
                .then().statusCode(RestResponse.StatusCode.OK).extract().as(Candidate.class);

        var response2 = given().contentType(MediaType.APPLYCATION_JSON).body(in)
                .when().put("/"+id)
                .then().statusCode(RestResponse.StatusCode.OK).extract().as(Candidate.class);

        assertEquals(response1.id(), id);
        assertEquals(response2.id(), id);
        assertNotEquals(response1.fullName(), response2.fullName());
        assertEquals(response1.email(), response2.email());
        assertEquals(response1.phone(), response2.phone());
        assertEquals(response1.jobTitle(), response2.jobTitle());

      }
}
