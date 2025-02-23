package lesson09.dvdsAndTvs;

public class SonyDVDRemoteController implements IDVDRemoteController{

	private int volume;
	
	public void play() {
		System.out.println("Starting... SonyRemote DVD");
	}
	
	public void stop() {
		System.out.println("Stop SonyRemote DVD");
	}
	
	public void eject() {
		System.out.println("Ejecting the disk from SonyRemote DVD player");
	}
	
	@Override
	public void insertDisc() {
		System.out.println("Inserting the disk to a SonyRemote DVD player");
	}
	
	public void volumeUp() {
		this.volume+= 10;
	}
}
