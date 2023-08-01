package com.apl.controller;

import com.apl.model.SquareRequest;
import com.apl.model.SquareResponse;
import com.apl.service.SquareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareController {

    @Autowired
    private SquareService squareService;

    @GetMapping(
            path = "/api/square",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public SquareResponse response(@RequestBody SquareRequest request){
        return squareService.squareFunction(request.getNumber());
    }
}
