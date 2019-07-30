package CD;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Getter@Setter
@Component
public class CdDTO {
    @Value("${title}")
    public String title;
    public String artist;
    @Autowired
    public SongDTO songDTO;
}
