package adapter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * @author Jerry Salonen
 */
public class MusicPlayerTwo implements IMusicPlayerTwo {
    HashMap<Integer, String> tracks = new LinkedHashMap<Integer, String>();
    int trackPlaying = -1;

    @Override
    public void start(int trackID) {
        try {
            if (trackPlaying == -1) {
                System.out.println("Playing track " + tracks.get(trackID));
                trackPlaying = trackID;
            } else {
                System.out.println("A track is already playing.");
            }
        } catch (Exception e) {
            System.out.println("Track not found");
        }
    }

    @Override
    public void stop() {
        try {
            if (trackPlaying != -1) {
                System.out.println("Pausing track " + tracks.get(trackPlaying));
                trackPlaying = -1;
            } else {
                System.out.println("No track is playing");
            }
        } catch (Exception e) {
            System.out.println("Track not found");
        }
    }

    @Override
    public void skip() {
        if (tracks.get(trackPlaying + 1) != null) {
            if (trackPlaying != -1) {
                trackPlaying ++;
                System.out.println("Switching to track " + tracks.get(trackPlaying));
            } else {
                System.out.println("No track is playing");
            }
        } else {
            System.out.println("End of tracks");
        }
    }

    @Override
    public void addToTrackList(String trackName) {
        tracks.put(tracks.size(), trackName);
    }
}
