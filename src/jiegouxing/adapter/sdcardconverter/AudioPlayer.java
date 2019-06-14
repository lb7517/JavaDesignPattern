package jiegouxing.adapter.sdcardconverter;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    @Override
    public void play(String autoType, String filename) {
        if("mp3".equals(autoType)){
            System.out.println("Playing mp3 file. name: "+filename);
        }else if("mp4".equals(autoType) || "vlc".equals(autoType)){
            mediaAdapter = new MediaAdapter(autoType);
            mediaAdapter.play(autoType, filename);
        }else {
            System.out.println("Invalid media. "+autoType+" format not supported");
        }
    }
}
