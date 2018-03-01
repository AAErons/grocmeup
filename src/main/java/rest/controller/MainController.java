package rest.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rest.model.request.FirstRequest;
import service.MainService;

@RestController
public class MainController {

    @Autowired
    private MainService mainService;

    private ObjectMapper mapper;

    @RequestMapping(value = "/getValue/", method = RequestMethod.POST)
    @ResponseBody
    public String getRequest(@RequestBody FirstRequest request) throws JsonProcessingException{
        return mapper.writeValueAsString(mainService.giveResponse(request));
    }
}
