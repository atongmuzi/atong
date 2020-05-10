package test;

public class Parcel8 {
//
//    class wrapChild extends Wrapping {
//        wrapChild(int x){
//            super(x);
//        };
//    }
//
//    public Wrapping wrapping(int x ) {
//        return new wrapChild(x);
//    }
//
//    public static void main(String[] args) {
//        Parcel8 parcel8 = new Parcel8();
//        Wrapping wrapping = parcel8.wrapping(11);
//    }
public Wrapping wrapping(int x) {
    // Base constructor call:
    return new Wrapping(x) { // [1]
        @Override
        public int value() {
            return super.value() * 47;
        }
    }; // [2]
}
    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
