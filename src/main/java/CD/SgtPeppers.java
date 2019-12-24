package CD;


//@Component("SgtPeppers")
public class SgtPeppers implements CompactDisc{


    public void play(CdDTO cdDTO) {
        System.out.println("Playing "+cdDTO.getTitle()+" by "+cdDTO.getArtist());
    }
    public void play(){
        System.out.println("atong javaconfig test");
    }
}
