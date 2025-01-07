package web.controller;

import Service.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cars")
public class CarController {


    @Autowired
    private CarServiceImpl carServiceImpl;

    @GetMapping()
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count == null || count <= 0) {
            model.addAttribute("cars", carServiceImpl.getCars());
        } else {
            model.addAttribute("cars1", carServiceImpl.getAnyCars(carServiceImpl.getCars(), count));
        }
        return "cars";
    }


//    //возвращает список всех машин из DAO  и передает этот список на отображение Thymeleaf'у
//    @GetMapping()
//    public String index(Model model) {
//        model.addAttribute("cars", carServiceImpl.getCars()); //под ключем "cars" будет находиться список всех машин
//        return "cars";
//    }
//
//    //возвращаем определенное количество машин
//    @GetMapping("/count/{count}")
//    public String getCountCars(@PathVariable("count") int count, Model model) {
//        model.addAttribute("count", carServiceImpl.getAnyCars(carServiceImpl.getCars(), count));
//        return "countCars";
//    }


}
