package pl.mkorcz.rentcar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.mkorcz.rentcar.entity.Vehicle;
import pl.mkorcz.rentcar.repository.VehicleRepository;

import java.util.List;

@Service
@Transactional
public class VehicleService {

    @Autowired
   private VehicleRepository repo;

    public List<Vehicle> listAll() {
        return repo.findAll();
    }

    public void saveVehicle(Vehicle vehicle) {
        repo.save(vehicle);
    }

    public Vehicle get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}
