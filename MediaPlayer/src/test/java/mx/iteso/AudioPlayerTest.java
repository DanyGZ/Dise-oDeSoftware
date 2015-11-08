package mx.iteso;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Daniel on 05/11/2015.
 */
public class AudioPlayerTest {
    AudioPlayer audioPlayer;

    @Test
    public void testMp3(){
        audioPlayer = new AudioPlayer();
        assertEquals("Mp3 playing", audioPlayer.play());
    }

    @Test
    public void testWithAdapter(){
        MediaAdapter mediaAdapter = mock(MediaAdapter.class);
        when(mediaAdapter.play()).thenReturn("Media adapter playing");
        audioPlayer = new AudioPlayer(mediaAdapter);
        assertEquals("Media adapter playing", audioPlayer.play());
    }
}
