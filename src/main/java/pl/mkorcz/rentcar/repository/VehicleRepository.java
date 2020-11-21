package pl.mkorcz.rentcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mkorcz.rentcar.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
