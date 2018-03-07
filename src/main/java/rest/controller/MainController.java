package rest.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rest.model.response.FirstResponse;
import service.MainService;

@RestController
public class MainController {

    @Autowired
    private MainService mainService;

    private ObjectMapper mapper = new ObjectMapper();

    //TODO test this in application
    @RequestMapping(value = "/getValue/{value}", method = RequestMethod.GET)
    @ResponseBody
    public String getRequest(@PathVariable("value") String value) throws JsonProcessingException{
        return mapper.writeValueAsString(mainService.giveResponse(value));
    }
}
