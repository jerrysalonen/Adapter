package adapter;

public class Main {

    public static void main(String[] args) {
        IMusicPlayerOne mp1 = new MusicPlayerOne();
        IMusicPlayerOne mp2 = new MusicPlayerTwoAdapter(new MusicPlayerTwo());

        mp1.addTrack("Toto - Africa");
        mp1.addTrack("John Denver - Country Roads, Take Me Home");
        mp1.addTrack("Ella ja Aleksi - Kakkaa Lumella");

        mp1.play(0);
        mp1.play(0);
        mp1.pause();
        mp1.play(1);
        mp1.pause();
        mp1.nextSong();
        mp1.play(2);
        mp1.nextSong();

        mp2.addTrack("Toto - Africa");
        mp2.addTrack("John Denver - Country Roads, Take Me Home");
        mp2.addTrack("Ella ja Aleksi - Kakkaa Lumella");

        mp2.play(0);
        mp2.play(0);
        mp2.pause();
        mp2.play(1);
        mp2.pause();
        mp2.nextSong();
        mp2.play(2);
        mp2.nextSong();

    }
}
