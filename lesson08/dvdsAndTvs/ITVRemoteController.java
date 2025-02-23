package lesson08.dvdsAndTvs;

public interface ITVRemoteController {
	void startTV();
	void stopTV();
	void channelUp();
	void channerDown();
	void goToChannel(int newChannel);
}
