package airport.backend.controller;

import airport.backend.model.Airport;
import airport.backend.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/airport")
@CrossOrigin
public class AirportController {
    @Autowired
    private AirportService airportService;

    @PostMapping("/add")
    public String add(@RequestBody Airport airport){
        airportService.saveAirport(airport);
        return "New Airport was Added";
    }

    @PostMapping("/getAll")
    public List<Airport> list (){
        return airportService.getAllAirports();
    }
}
