package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.models.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping()
    String getCars(Model model, HttpServletRequest request) {

        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("AUDI", 60, false));
        listCar.add(new Car("BMW", 105, true));
        listCar.add(new Car("TESLA", 21, true));
        listCar.add(new Car("FORD", 51321, true));
        listCar.add(new Car("VW", -999999, false));

        if(request.getParameter("count") == null) {
            model.addAttribute("cars", listCar);
            return "cars";
        }
        int count = Integer.parseInt(request.getParameter("count"));
        List<Car> newList = listCar.stream().limit(count).collect(Collectors.toList());
        model.addAttribute("cars", newList);
        return "cars";
    }
}
