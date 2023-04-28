package hk.hku.test;

import hk.hku.entity.HkuUserEntity;
import hk.hku.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test01 {
    public static void main(String[] args) throws IOException {
        String resource ="mybatis-config.xml";
        // get the database config from mybatis-config.xml
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //create the SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // get the session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // //get the user list using the session
        //List<HkuUserEntity> userEntityList = sqlSession.selectList("getByUsers", HkuUserEntity.class);
        // //batis proxy pattern to get the mapper using UserMapper interface
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<HkuUserEntity> userEntityList = mapper.getByUsers();
        for (HkuUserEntity userEntity : userEntityList) {
            System.out.println(userEntity);
        }
        sqlSession.close();
    }
}
