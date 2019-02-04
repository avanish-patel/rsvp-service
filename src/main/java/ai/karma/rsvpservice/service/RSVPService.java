package ai.karma.rsvpservice.service;

import ai.karma.rsvpservice.domain.RSVP;
import ai.karma.rsvpservice.repository.RSVPRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RSVPService {

    private RSVPRepository rsvpRepository;

    public RSVPService(RSVPRepository rsvpRepository) {
        this.rsvpRepository = rsvpRepository;
    }

    public void addRsvp(RSVP rsvp) {
        rsvpRepository.save(rsvp);
    }

    public List<RSVP> getAllRsvp() {
        return (List<RSVP>) rsvpRepository.findAll();
    }
}
