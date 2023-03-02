package com.epam.learning.backendservices.springfoundation.actuatorendpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.Map;

@Endpoint(id = "state")
@Component
public class StateActuatorEndpoint {

    @ReadOperation
    public Map<String, String> stateEndpoint(String id) {
        return Map.of("id", id,
                      "note", "Hello, admin");
    }
}
