package airport.backend.service;

import airport.backend.model.Airport;

import java.util.List;

public interface AirportService  {
    public Airport saveAirport(Airport airport);
    public List <Airport> getAllAirports();
}
