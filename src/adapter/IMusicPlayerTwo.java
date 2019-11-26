package adapter;

import java.util.HashMap;

/**
 * @author Jerry Salonen
 */
public interface IMusicPlayerTwo {
    void start (int trackNum);
    void stop ();
    void skip();
    void addToTrackList(String trackName);
}
