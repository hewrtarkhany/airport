package airport.backend.service;

import airport.backend.model.Address;
import airport.backend.model.Airport;
import airport.backend.model.Person;
import airport.backend.repository.AirportRepository;
import airport.backend.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServiceImpl implements AirportService{

    @Autowired
    private AirportRepository airportRepository;
    @Autowired
    private PersonRepository personRepository;

    @Override
    public Airport saveAirport(Airport airport){
        return airportRepository.save(airport);
    }
    @Override
    public List<Airport> getAllAirports(){return airportRepository.findAll();}
    @Override
    public Person savePerson(Person person){ return personRepository.save(person);}

    @Override
    public List<Person> getAllPerson(){ return personRepository.findAll();}

    @Override
    public Address saveAddress(Address address) {
        return null;
    }

    @Override
    public List<Address> getAllAddress() {
        return null;
    }
}
