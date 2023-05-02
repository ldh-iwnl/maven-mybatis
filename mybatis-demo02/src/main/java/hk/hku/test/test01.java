package hk.hku.test;

import hk.hku.entity.FlightEntity;
import hk.hku.service.FlightService;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class test01 {
    public static void main(String[] args) throws IOException {
        FlightService flightService = new FlightService();
//        List<FlightEntity> allFlights = flightService.getAllFlights();
//        for (FlightEntity flightEntity : allFlights) {
//            System.out.println(flightEntity);
//        }

//        FlightEntity flightById = flightService.getFlightById(2);
//        System.out.println(flightById);

//        FlightEntity flightEntity = new FlightEntity(null, "CA123", "Air China", "Hong Kong", "Beijing", null,null, "A380", 0);
//        int result =flightService.insertFlight(flightEntity);
//        System.out.println(result);

//        int i = flightService.deleteFlightById(2);
//        System.out.println(i);

        FlightEntity flightEntity = new FlightEntity(1, "US456", "United States", "Hong Kong", "New York", new Date(), new Date(), "A380", 0);
        int i = flightService.updateFlight(flightEntity);
        System.out.println(i);
    }
}
