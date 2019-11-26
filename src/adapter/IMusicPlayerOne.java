package adapter;

/**
 * @author Jerry Salonen
 */
public interface IMusicPlayerOne {
    void play (int trackID);
    void pause ();
    void nextSong();
    void addTrack(String trackName);
}
