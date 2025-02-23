package lesson09.dvdsAndTvs;

public class Demo {
	public static void main(String[] args) {


		IDVDRemoteController samsungDvd = new SamsungDVDRemoteController();

		IDVDRemoteController philipsDvd = new PhilipsRemoteController();

		PhilipsRemoteController philipsRemote = new PhilipsRemoteController();

		ITVRemoteController philipsTV = new PhilipsRemoteController();

		philipsDvd.play();
		samsungDvd.play();

		philipsDvd.stop();
		samsungDvd.stop();

		philipsDvd.play();
		samsungDvd.eject();
	}
}
