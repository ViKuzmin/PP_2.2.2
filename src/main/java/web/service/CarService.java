package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> listCar = new ArrayList<>();

    {
        listCar.add(new Car("AUDI", 60, false));
        listCar.add(new Car("BMW", 105, true));
        listCar.add(new Car("TESLA", 21, true));
        listCar.add(new Car("FORD", 51321, true));
        listCar.add(new Car("VW", -999999, false));
    }

    public List<Car> getListCar() {
        return listCar;
    }
}
