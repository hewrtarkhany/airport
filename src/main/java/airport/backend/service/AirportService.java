package airport.backend.service;

import airport.backend.model.Address;
import airport.backend.model.Airport;
import airport.backend.model.Person;

import java.util.List;

public interface AirportService  {
    public Airport saveAirport(Airport airport);
    public List <Airport> getAllAirports();
    public Person savePerson(Person person);
    public List<Person> getAllPerson();
    public Address saveAddress(Address address);
    public List<Address>getAllAddress();
}
