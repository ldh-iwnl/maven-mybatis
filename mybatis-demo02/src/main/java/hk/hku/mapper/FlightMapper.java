package hk.hku.mapper;

import hk.hku.entity.FlightEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface FlightMapper {
    /**
     * search
     * 1. search all
     * 2. conditional search
     * 3. dynamic search
     */

    List<FlightEntity> getAllFlights();

    FlightEntity getFlightById(Integer id);

    int insertFlight(FlightEntity flightEntity);

    int deleteFlightById(Integer id);

    int updateFlight(FlightEntity flightEntity);

    /**
     * 多条件查询map集合
     * parameterMap.put("id", "1");
     * @param parameterMap
     * @return
     */
    List<FlightEntity> getFlightByIdParameterMap(Map<String, String> parameterMap);


    List<FlightEntity> getFlightByIdParameter(@Param("company") String company,
                                              @Param("departureAirport") String departureAirport,
                                              @Param("arriveAirport") String arriveAirport);

    List<FlightEntity> getFlightByIdPoJo(FlightEntity flightEntity);

    List<FlightEntity> getFlightByIdPoJo2(FlightEntity flightEntity);


}
