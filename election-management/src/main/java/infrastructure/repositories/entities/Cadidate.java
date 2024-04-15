package infrastructure.repositories.entities;

import domain.Candidate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "candidates")

public class Cadidate {
    @Id
    private String id;
    private String photo;

    @Column(name = "given_name")
    private String given_name;
    @Column(name = "family_name")
    private String family_name;
    private String email;
    private String phone;
    @Column(name = "job_title")
    private String job_title;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getGiven_name() {
        return given_name;
    }

    public void setGiven_name(String given_name) {
        this.given_name = given_name;
    }

    public String getFamily_name() {
        return family_name;
    }

    public void setFamily_name(String family_name) {
        this.family_name = family_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }
    public static Cadidate fromDomain(domain.Candidate domain) {
        Cadidate entity = new Cadidate();

        entity.setId(domain.id());
        entity.setPhoto(domain.photo().orElse(null));
        entity.setGiven_name(domain.givenName());
        entity.setFamily_name(domain.familyName());
        entity.setEmail(domain.email());
        entity.setPhone(domain.phone().orElse(null));
        entity.setJob_title(domain.jobTitle().orElse(null));

        return entity;
    }
}
