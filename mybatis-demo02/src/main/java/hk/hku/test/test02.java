package hk.hku.test;

import hk.hku.entity.FlightEntity;
import hk.hku.service.FlightService;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class test02 {
    public static void main(String[] args) throws IOException {
        FlightService flightService = new FlightService();
//        HashMap<String, String> stringStringHashMap = new HashMap<>();
//        stringStringHashMap.put("company", "Air China");
//        stringStringHashMap.put("departureAirport", "Hong Kong");
//        stringStringHashMap.put("arriveAirport", "Beijing");
//        List<FlightEntity> flightEntities = flightService.getFlightByIdParameterMap(stringStringHashMap);
//        for (FlightEntity flightEntity : flightEntities) {
//            System.out.println(flightEntity);
//        }

//        List<FlightEntity> flightByIdParameter = flightService.getFlightByIdParameter("Air China", "Hong Kong", "Beijing");
//        for (FlightEntity flightEntity : flightByIdParameter) {
//            System.out.println(flightEntity);
//        }

        FlightEntity flightEntity = new FlightEntity();
        //flightEntity.setCompany("Air China");
        flightEntity.setDepartureAirport("Hong Kong");
        flightEntity.setArriveAirport("Beijing");
        List<FlightEntity> flightByIdPoJo = flightService.getFlightByIdPoJo2(flightEntity);
        for (FlightEntity entity : flightByIdPoJo) {
            System.out.println(entity);
        }

    }
}
