package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    @Override
    public List<Car> listCars() {

        List<Car> carsList = new ArrayList<>();

        carsList.add(new Car("Volga", "Gray", 152));
        carsList.add(new Car("Lada", "Red", 132));
        carsList.add(new Car("Nissan", "White", 896));
        carsList.add(new Car("BMW", "Black", 148));
        carsList.add(new Car("Audi", "Orange", 333));

        return carsList;
    }
}
