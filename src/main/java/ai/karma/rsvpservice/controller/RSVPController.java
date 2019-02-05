package ai.karma.rsvpservice.controller;

import ai.karma.rsvpservice.domain.RSVP;
import ai.karma.rsvpservice.service.RSVPService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/karma/v1")
public class RSVPController {


    private RSVPService rsvpService;

    public RSVPController(RSVPService rsvpService) {
        this.rsvpService = rsvpService;
    }

    @PostMapping("/rsvp")
    public void addRsvp(@RequestBody RSVP rsvp) {

        rsvpService.addRsvp(rsvp);
    }


    @GetMapping("/rsvp")
    public List<RSVP> getAllRsvp(){
        return rsvpService.getAllRsvp();
    }

    @DeleteMapping("/rsvp/{id}")
    public void deleteRsvp(@PathVariable("id") long id) {
        rsvpService.deleteRsvp(id);
    }


}
