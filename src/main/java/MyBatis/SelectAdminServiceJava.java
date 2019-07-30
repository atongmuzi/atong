package MyBatis;

import MyBatis.dto.Tadmin;

public interface SelectAdminServiceJava {
    Tadmin select(Long id);
    Tadmin selectByPhone(String phone);
}
