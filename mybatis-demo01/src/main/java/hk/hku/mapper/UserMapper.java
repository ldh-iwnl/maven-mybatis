package hk.hku.mapper;

import hk.hku.entity.HkuUserEntity;

import java.util.List;

public interface UserMapper {
    /**
     *  use UserMapper.getByUsers to get all the users
     * @return
     */
    List<HkuUserEntity> getByUsers();
}
