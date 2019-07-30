package MyBatis.service.impl;

import MyBatis.SelectAdminServiceJava;
import MyBatis.dao.TadminMapper;
import MyBatis.dto.Tadmin;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectAdminServiceImplJava implements SelectAdminServiceJava {

    private TadminMapper tadminMapper;

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Override
    public Tadmin select(Long id) {
        SqlSession session = sqlSessionFactory.openSession();
        tadminMapper = session.getMapper(TadminMapper.class);
        return tadminMapper.selectByPrimaryKey(id);
    }
    @Override
    public Tadmin selectByPhone(String phone){
        return null;
    }
}
