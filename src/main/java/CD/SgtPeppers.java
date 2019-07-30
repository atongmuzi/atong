package CD;

import org.springframework.stereotype.Component;

@Component("SgtPeppers")
public class SgtPeppers implements CompactDisc{


    public void play(CdDTO cdDTO) {
        System.out.println("Playing "+cdDTO.getTitle()+" by "+cdDTO.getArtist());
    }
}
