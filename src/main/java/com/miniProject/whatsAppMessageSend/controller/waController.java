package com.miniProject.whatsAppMessageSend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.tools.java.Environment;

import java.io.IOException;

@RestController
@RequestMapping(waController.BASE_PATH)
public class waController
{
    /**
     * addNumber first
     * curl -XPOST https://apiv2.unificationengine.com/v2/connection/add -u 12c50fbf-0c51-4fe6-9ecb-74bbe0109685:5d3da338-52d4-46ac-b1e4-b0e4430e0af4
     * --data '{"uri":"whatsappsandbox://628990908032@whatsapp.com","name":"628990908032"}' -k
     *
     * parameter:
     * uri = whatsappsanbox://xxnumber@whatsapp.com
     * name = xxnumber
     *
     * response :
     * {"status":200,"info":"200 OK"}
     *
     * you can check the document for details information
     *
     */


    public static final String BASE_PATH = "/add";

    Logger log = LoggerFactory.getLogger(waController.class);

    HttpStatus status = null;


    @PostMapping(value = "/apiv2.unificationengine.com/v2/connection/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addNumber(@RequestBody String param) throws IOException
    {

    }




}
