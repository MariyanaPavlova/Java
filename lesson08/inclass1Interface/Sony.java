package lesson08.inclass1Interface;

public class Sony implements DvdRemote, TvRemote {
    @Override
    public void play() {
        System.out.println("Sony remote plays DVD");
    }

    @Override
    public void eject() {
        System.out.println("Sony remote ejects DVD");
    }

    public void turnSonySpecific3D(){
        System.out.println("Turning on Sony Specific 3D effect.");
    }

    @Override
    public void insertDisc() {
        System.out.println("Sony remote inserts disco into DVD");
    }

    @Override
    public void stop() {
        System.out.println("Sony remote stopping the DVD");
    }

    @Override
    public void goToChannel(int whichChannel) {
        System.out.println("Sony TV is going to channel: " + whichChannel);
    }

    @Override
    public void startTv() {
        System.out.println("Sony TV is starting...");
    }

    @Override
    public void stopTv() {
        System.out.println("Sony TV is stopping...");
    }


}

