package adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jerry Salonen
 */
public class MusicPlayerOne implements IMusicPlayerOne {

    List<String> tracks = new ArrayList();
    int trackPlaying = -1;

    @Override
    public void play(int trackID) {
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
    public void pause() {
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
    public void nextSong() {
        try {
            if (trackPlaying != -1) {
                trackPlaying++;
                System.out.println("Switching to track " + tracks.get(trackPlaying));
            } else {
                System.out.println("No track is playing");
            }
        } catch (Exception e) {
            System.out.println("End of tracks");
        }
    }

    @Override
    public void addTrack(String trackName) {
        tracks.add(trackName);
    }
}
