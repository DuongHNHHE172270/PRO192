
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HAI DUONG
 */
public class MyCar implements ICar{

    @Override
    public int f1(List<Car> t) {
        int sum = 0;
        for (Car car : t) {
            sum += car.getRate();
        }
        return sum/t.size();
    }

  @Override
public void f2(List<Car> t) {
    int maxRate = Integer.MIN_VALUE;
    int minRate = Integer.MAX_VALUE;
    int maxIndex = -1;
    int minIndex = -1;
    
    for (int i = 0; i < t.size(); i++) {
        int rate = t.get(i).getRate();
        
        if (rate > maxRate) {
            maxRate = rate;
            maxIndex = i;
        }
        
        if (rate < minRate) {
            minRate = rate;
            minIndex = i;
        }
    }
    
    if (maxIndex != -1 && minIndex != -1 && maxIndex != minIndex) {
        Collections.swap(t, maxIndex, minIndex);
    }
}


    @Override
    public void f3(List<Car> t) {
        Collections.sort(t, Comparator.comparing(Car::getMaker));
        Collections.sort(t, (car1, car2) -> {
            if(car1.getMaker().equals(car2.getMaker())){
                return Integer.compare(car1.getRate(), car2.getRate());
            }
            return 0;
        });
    }
    
}
