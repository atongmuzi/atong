package httpInterface.forum.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author tongcy
 * @date 2020-03-07 17:12
 * @desc 论坛结果集对象
 **/
@Getter@Setter
public class ResultDTO {
    public String code;
    public String data;
    public boolean success;
}
