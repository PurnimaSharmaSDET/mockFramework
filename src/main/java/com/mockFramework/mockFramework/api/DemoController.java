package com.mockFramework.mockFramework.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    // Common method to generate JSON response
    private Map<String, String> generateResponse() {
        Map<String, String> response = new HashMap<>();
        response.put("serviceWorking", "ok");
        return response;
    }

    @GetMapping
    public ResponseEntity<Map<String, String>> handleGet() {
        return new ResponseEntity<>(generateResponse(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> handlePost(@RequestBody(required = false) Map<String, Object> body) {
        return new ResponseEntity<>(generateResponse(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Map<String, String>> handlePut(@RequestBody(required = false) Map<String, Object> body) {
        return new ResponseEntity<>(generateResponse(), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Map<String, String>> handleDelete() {
        return new ResponseEntity<>(generateResponse(), HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<Map<String, String>> handlePatch(@RequestBody(required = false) Map<String, Object> body) {
        return new ResponseEntity<>(generateResponse(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.OPTIONS)
    public ResponseEntity<Map<String, String>> handleOptions() {
        return new ResponseEntity<>(generateResponse(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.HEAD)
    public ResponseEntity<Void> handleHead() {
        return ResponseEntity.ok().build();
    }

    @RequestMapping(method = RequestMethod.TRACE)
    public ResponseEntity<Map<String, String>> handleTrace() {
        return new ResponseEntity<>(generateResponse(), HttpStatus.OK);
    }


}
