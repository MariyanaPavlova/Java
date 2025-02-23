package lesson08.inclass1Interface;

public class Demo {
    public static void main(String[] args) {
        Sony sonyRemote = new Sony(); //public class Sony implements DvdRemote, TvRemote

        //+от интерфейса DvdRemote
        sonyRemote.play();
        sonyRemote.eject();
        sonyRemote.insertDisc();
        sonyRemote.stop();
        //+от интерфейса TvRemote
        sonyRemote.goToChannel(10);
        sonyRemote.startTv();
        //+от класа Sony
        sonyRemote.turnSonySpecific3D(); //във Sony класа е дефиниран.


        //A reference of interface type can be initialized with instance of class which implements this interface
        //A reference of some type can be initialized with instance of any type which extends the type of the reference
        TvRemote sonyRemote2 = new Sony();
        //от TvRemote методите само - startTv, gotoChannel, stopTv:
        sonyRemote2.goToChannel(22);
        sonyRemote2.startTv();
        sonyRemote2.stopTv();
        //sonyRemote2.play() - не може, защото е от DvdRemote interface

        // от DvdRemote методите само -play, eject, insertDisc, stop:
        DvdRemote sonyRemote3 = new Sony();
        sonyRemote3.play();
        sonyRemote3.eject();
        sonyRemote3.insertDisc();
        sonyRemote3.stop();
        //sonyRemote3.startTv(); - не може защото е от TvRemote interface

        Samsung samsungRemote = new Samsung(); //public class Samsung implements DvdRemote
        // ще има от DvdRemote - play, eject, insertDisc, stop + допълнителния turnSamsungSpecific3D

        DvdRemote samsungRemote2 = new Samsung(); //DvdRemote -само play, eject, insertDisc, stop без допълн.turnSamsungSpecific3D
        samsungRemote2.play();
        samsungRemote2.eject();
        samsungRemote2.insertDisc();
        samsungRemote2.stop();
    }
}
