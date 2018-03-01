package service;

import org.springframework.stereotype.Service;
import rest.model.request.FirstRequest;
import rest.model.response.FirstResponse;

@Service
public class MainService {

    public FirstResponse giveResponse(FirstRequest request){
        FirstResponse response = new FirstResponse();
        response.setValue(request.getValue());
        return response;
    }
}
