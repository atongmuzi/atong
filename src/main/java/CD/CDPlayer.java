package CD;



public class CDPlayer {
    CompactDisc compactDisc;

    public CDPlayer(CompactDisc compactDisc){
        this.compactDisc = compactDisc;
    }
    public void cdPlay(){
        System.out.println("cdPlay test");
        compactDisc.play();
    }
}
