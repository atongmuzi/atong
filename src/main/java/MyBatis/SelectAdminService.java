package MyBatis;

import MyBatis.dto.Tadmin;

public interface SelectAdminService {
    Tadmin select(Long id);
    Tadmin selectByPhone(String phone);
}
