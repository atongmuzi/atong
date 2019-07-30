package MyBatis.dao;

import MyBatis.dto.Tadmin;

public interface TadminMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tadmin record);

    int insertSelective(Tadmin record);

    Tadmin selectByPrimaryKey(Long id);
    Tadmin selectByPhone(String phone);

    int updateByPrimaryKeySelective(Tadmin record);

    int updateByPrimaryKey(Tadmin record);
}