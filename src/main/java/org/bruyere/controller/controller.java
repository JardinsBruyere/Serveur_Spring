package org.bruyere.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import org.bruyere.repository.SensorReadingRepository;
import org.bruyere.repository.SensorRepository;
import org.bruyere.repository.SensorTypesRepository;
import org.bruyere.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class controller {
    private final SensorRepository sensorRepository;
    private final SensorReadingRepository sensorReadingRepository;
    private final SensorTypesRepository sensorTypesRepository;
    private final StationRepository stationRepository;

    @GetMapping("nbCapteur")
    public String nbCapteur(){
        final GsonBuilder builder = new GsonBuilder();
        final Gson gson = builder.create();
        Integer nb = sensorRepository.findAll().size();
        return gson.toJson(nb);
    }
}
