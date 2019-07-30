package CD;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter@Setter
@Component
public class SongDTO {
    private String SongName;
    private String SongTime;
    private String SongType;

}
