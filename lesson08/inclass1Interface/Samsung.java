package lesson08.inclass1Interface;

public class Samsung implements DvdRemote {

    public void turnSamsungSpecific3D(){
        System.out.println("Turning on Samsung Specific 3D effect.");
    }

    @Override
    public void play() {
        System.out.println("Samsung remote plays DVD");
    }

    @Override
    public void eject() {
        System.out.println("Samsung remote ejects DVD");
    }

    @Override
    public void insertDisc() {
        System.out.println("Samsung remote inserts disco into DVD");
    }

    @Override
    public void stop() {
        System.out.println("Samsung remote stopping the DVD");
    }
}
