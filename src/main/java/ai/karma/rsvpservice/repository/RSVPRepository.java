package ai.karma.rsvpservice.repository;

import ai.karma.rsvpservice.domain.RSVP;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSVPRepository extends CrudRepository<RSVP, Long> {

}
