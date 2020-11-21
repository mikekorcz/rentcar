package pl.mkorcz.rentcar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mkorcz.rentcar.entity.Vehicle;
import pl.mkorcz.rentcar.service.VehicleService;

import java.util.List;

@Controller
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Vehicle> listVehicles = vehicleService.listAll();
        model.addAttribute("listVehicles", listVehicles);
        return "index";
    }
}
