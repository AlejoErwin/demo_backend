package bo.edu.ucb.demo.Backend.api;

import bo.edu.ucb.demo.Backend.bl.AgendaBl;
import bo.edu.ucb.demo.Backend.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class StudentApi {
    private AgendaBl agendaBl;

    @Autowired
    public StudentApi(AgendaBl agendaBl) {
        this.agendaBl = agendaBl;
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Contact create(@RequestBody Contact contact) {
        return agendaBl.createContact(contact);
    }
    
}
