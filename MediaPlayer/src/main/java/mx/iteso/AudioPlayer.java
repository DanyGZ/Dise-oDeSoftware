package mx.iteso;

/**
 * Created by Daniel on 05/11/2015.
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    public AudioPlayer(MediaAdapter mediaAdapter){
        this.mediaAdapter = mediaAdapter;
    }

    public AudioPlayer(){

    }

    public String play() {
        if(mediaAdapter == null)
            return "Mp3 playing";
        else
            return mediaAdapter.play();
    }
}
