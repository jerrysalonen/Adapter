package adapter;

/**
 * @author Jerry Salonen
 */
public class MusicPlayerTwoAdapter implements IMusicPlayerOne{

    private MusicPlayerTwo adaptee;

    public  MusicPlayerTwoAdapter(MusicPlayerTwo adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void play(int trackID) {
        adaptee.start(trackID);
    }

    @Override
    public void pause() {
        adaptee.stop();
    }

    @Override
    public void nextSong() {
        adaptee.skip();
    }

    @Override
    public void addTrack(String trackName) {
        adaptee.addToTrackList(trackName);
    }
}
