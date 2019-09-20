package MyBatis.service.impl;

import MyBatis.SelectAdminService;
import MyBatis.dao.TadminMapper;
import MyBatis.dto.Tadmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectAdminServiceImpl implements SelectAdminService {

      @Autowired
      TadminMapper tadminMapper;

    @Override
    public Tadmin select(Long id) {
        return this.tadminMapper.selectByPrimaryKey(id);

    }
    @Override
    public Tadmin selectByPhone(String phone){
        return this.tadminMapper.selectByPhone(phone);
    }
}
