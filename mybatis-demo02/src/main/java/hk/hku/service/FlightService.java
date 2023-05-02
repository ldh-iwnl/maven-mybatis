package hk.hku.service;

import hk.hku.entity.FlightEntity;
import hk.hku.mapper.FlightMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class FlightService {
    private FlightMapper flightMapper;
    SqlSession sqlSession;
    public FlightService() throws IOException {
        String resource ="mybatis-config.xml";
        // get the database config from mybatis-config.xml
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //create the SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // get the session
         sqlSession = sqlSessionFactory.openSession();
        flightMapper = sqlSession.getMapper(FlightMapper.class);
    }

    public List<FlightEntity> getAllFlights() {
        return flightMapper.getAllFlights();
    }

    public FlightEntity getFlightById(Integer id) {
        return flightMapper.getFlightById(id);
    }

    public int insertFlight(FlightEntity flightEntity) {
        int result = flightMapper.insertFlight(flightEntity);
        sqlSession.commit();
        return result;
    }
    public int deleteFlightById(Integer id) {
        int result = flightMapper.deleteFlightById(id);
        sqlSession.commit();
        return result;
    }
    public int updateFlight(FlightEntity flightEntity) {
        int result = flightMapper.updateFlight(flightEntity);
        sqlSession.commit();
        return result;
    }

   public List<FlightEntity> getFlightByIdParameterMap(Map<String, String> parameterMap) {
        return flightMapper.getFlightByIdParameterMap(parameterMap);
    }

    public List<FlightEntity> getFlightByIdParameter(String company,
                                              String departureAirport, String arriveAirport){
        return flightMapper.getFlightByIdParameter(company, departureAirport, arriveAirport);
    }

    public List<FlightEntity> getFlightByIdPoJo(FlightEntity flightEntity){
        return flightMapper.getFlightByIdPoJo(flightEntity);
    }

    public List<FlightEntity> getFlightByIdPoJo2(FlightEntity flightEntity){
        return flightMapper.getFlightByIdPoJo2(flightEntity);
    }
}
