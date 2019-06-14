package jiegouxing.adapter.sdcardconverter;

public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String autoType){
        if("vlc".equals(autoType)){
            advanceMediaPlayer = new VlcPlayer();
        }else if("mp4".equals(autoType)){
            advanceMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String autoType, String filename) {
        if("vlc".equals(autoType)){
            advanceMediaPlayer.playVlc(filename);
        }else if("mp4".equals(autoType)){
            advanceMediaPlayer.playMp4(filename);
        }
    }
}
