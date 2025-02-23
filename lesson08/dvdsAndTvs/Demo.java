package lesson08.dvdsAndTvs;

public class Demo {
	public static void main(String[] args) {
		IDVDRemoteController philipsDvd = new PhilipsRemoteController(); //play, insertDisc, eject, stop
		IDVDRemoteController samsungDvd = new SamsungDVDRemoteController(); //play, insertDisc, eject, stop
		PhilipsRemoteController philipsRemote = new PhilipsRemoteController();//всичко

		philipsDvd.play();;
		philipsDvd.insertDisc();
		philipsDvd.eject();
		philipsDvd.stop();

		samsungDvd.play();
		samsungDvd.insertDisc();
		samsungDvd.eject();
		samsungDvd.stop();

		philipsRemote.startTV();


	}
}
