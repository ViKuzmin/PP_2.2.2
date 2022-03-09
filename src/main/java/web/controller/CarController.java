package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.models.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping()
    String getCars(Model model, HttpServletRequest request) {


        if(request.getParameter("count") == null) {
            model.addAttribute("cars", carService.getListCar());
            return "cars";
        }
        int count = Integer.parseInt(request.getParameter("count"));
        List<Car> newList = carService.getListCar().stream().limit(count).collect(Collectors.toList());
        model.addAttribute("cars", newList);
        return "cars";
    }
}
