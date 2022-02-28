package com.example.springmvcdemo;

import com.example.model.Verfahren;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class HomeController {

    //aufrufen über localhost:8080
    @GetMapping("/")
    public String homepage() {
        return "Homepage";
    }

    //aufrufen über localhost:8080/greeting?name=tim
    @GetMapping("/greeting")
    public String greet(@RequestParam(value= "name", defaultValue = "Welt") String name) {
        return "Hallo " + name;
    }

    //aufrufen über POST localhost:8080/verfahren/1 mit entsprechenden Attributen im requestBody
    @PostMapping("verfahren/{id}")
    public String getVerfahren(@RequestBody Verfahren neuesVerfahren, @PathVariable Long id) {
        Gson gson = new Gson();
        neuesVerfahren.setKennung(id.toString());
        return gson.toJson(neuesVerfahren);
    }
}
