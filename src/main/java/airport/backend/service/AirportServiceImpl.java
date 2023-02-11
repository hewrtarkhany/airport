package airport.backend.service;

import airport.backend.model.Airport;
import airport.backend.repository.AiportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServiceImpl implements AirportService{

    @Autowired
    private AiportRepository airportRepository;

    @Override
    public Airport saveAirport(Airport airport){
        return airportRepository.save(airport);
    }
    @Override
    public List<Airport> getAllAirports(){
        return airportRepository.findAll();
    }
}
