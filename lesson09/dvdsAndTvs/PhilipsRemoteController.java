package lesson09.dvdsAndTvs;

public class PhilipsRemoteController implements ITVRemoteController, IDVDRemoteController {

	@Override
	public void startTV() {
		System.out.println("Philips Start TV...");
	}

	@Override
	public void stopTV() {
		System.out.println("Philips Stop TV...");
	}

	@Override
	public void channelUp() {
		System.out.println("Philips Channel up...");
	}

	@Override
	public void channerDown() {
		System.out.println("Philips Channel down....");
	}

	@Override
	public void goToChannel(int newChannel) {
		System.out.println("Philips Going ot channel " + newChannel);
		
	}

	@Override
	public void play() {
		System.out.println("Philips is playing DVD");
	}

	@Override
	public void stop() {
		System.out.println("Philips is stopping DVD");
	}

	@Override
	public void insertDisc() {
		System.out.println("Philips is inserting disc into DVD");
	}

	@Override
	public void eject() {
		System.out.println("Philips is ejecting DVD");
	}

	

}
