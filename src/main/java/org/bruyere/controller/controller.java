package org.bruyere.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import org.bruyere.entity.Sensor;
import org.bruyere.repository.SensorReadingRepository;
import org.bruyere.repository.SensorRepository;
import org.bruyere.repository.SensorTypesRepository;
import org.bruyere.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class controller {
    private final SensorRepository sensorRepository;
    private final SensorReadingRepository sensorReadingRepository;
    private final SensorTypesRepository sensorTypesRepository;
    private final StationRepository stationRepository;

    @GetMapping("/nbCapteurs")
    public String nbCapteurs(){
        final GsonBuilder builder = new GsonBuilder();
        final Gson gson = builder.create();
        Integer nb = sensorRepository.findAll().size();
        return gson.toJson(nb);
    }

    @PostMapping("/addCapteurs")
    public void addCapteurs(@RequestBody Sensor sensor){
        sensorRepository.save(sensor);
    }

    @GetMapping("/allCapteurs")
    public List<Sensor> allCapteurs(){
        return sensorRepository.findAll();
    }
}
