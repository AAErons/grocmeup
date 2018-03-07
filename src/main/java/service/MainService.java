package service;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import rest.model.request.FirstRequest;
import rest.model.response.FirstResponse;

@Service
@Configurable
public class MainService {

    public FirstResponse giveResponse(String value){
        FirstResponse response = new FirstResponse();
        response.setValue(value);
        return response;
    }
}
