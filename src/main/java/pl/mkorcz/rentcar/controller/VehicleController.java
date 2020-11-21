package pl.mkorcz.rentcar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.mkorcz.rentcar.entity.Vehicle;
import pl.mkorcz.rentcar.service.VehicleService;

import java.util.List;

@Controller
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Vehicle> listVehicles = vehicleService.listAll();
        model.addAttribute("listVehicles", listVehicles);
        return "index";
    }

    @RequestMapping("/new")
    public String showNewVehicle(Model model) {
        Vehicle vehicle = new Vehicle();
        model.addAttribute("vehicle", vehicle);
        return "new_vehicle";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveVehicle(@ModelAttribute("vehicle") Vehicle vehicle) {
        vehicleService.saveVehicle(vehicle);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView editVehicle(@PathVariable(name = "id") Long id) {
        ModelAndView mav = new ModelAndView("edit_vehicle");
        Vehicle vehicle = vehicleService.get(id);
        mav.addObject("vehicle", vehicle);
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteVehicle(@PathVariable(name = "id") Long id) {
        vehicleService.delete(id);
        return "redirect:/";
    }

}
