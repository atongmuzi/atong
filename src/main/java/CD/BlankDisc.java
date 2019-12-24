package CD;

import java.util.List;

public class BlankDisc implements CompactDisc {
    private String title;
    private String artiest;
    private List<String> tracks;
    public  void BlankDisc(String title,String artiest,List<String> tracks){
        this.title = title;
        this.artiest = artiest;
        this.tracks = tracks;
    }

    @Override
    public void play(CdDTO cddto) {

    }

    @Override
    public void play() {

    }
}
