package se.getqte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.getqte.model.Client;
import se.getqte.model.repository.*;

@RestController
@RequestMapping(value = "/timeentry")
public class TimeEntryController extends ControllerCRUD {


    @Autowired
    public TimeEntryController(TimeEntryRepository repository){
        super.setRepository(repository);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> get(@PathVariable final Long id) {
        return super.getSpecific(id);
    }


    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody public ResponseEntity<?> save(@RequestBody Client client) {
        return super.save(client);

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody public ResponseEntity<?> getAll() {
        return super.getAll();
    }

}
