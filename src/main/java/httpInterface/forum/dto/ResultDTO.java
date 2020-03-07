package httpInterface.forum.dto;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class ResultDTO {
    public String code;
    public String data;
    public boolean success;
}
