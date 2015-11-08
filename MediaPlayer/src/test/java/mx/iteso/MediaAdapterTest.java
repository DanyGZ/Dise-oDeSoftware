package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Daniel on 07/11/2015.
 */
public class MediaAdapterTest {
    MediaAdapter mediaAdapter;
    Mp4Player mp4Player;
    VlcPlayer vlcPlayer;

    @Before
    public void SetUp() {
        mp4Player = new Mp4Player();
        vlcPlayer = new VlcPlayer();
    }

    @Test
    public void testPlayMp4() {
        mediaAdapter = new MediaAdapter(mp4Player);
        assertEquals("Playing MP4", mediaAdapter.play());
    }

    @Test
    public void testPlayVlc() {
        mediaAdapter = new MediaAdapter(vlcPlayer);
        assertEquals("Playing VLC", mediaAdapter.play());
    }

    @Test
    public void testNull(){
        mediaAdapter = new MediaAdapter(null);
        assertEquals(null, mediaAdapter.play());
    }

}
