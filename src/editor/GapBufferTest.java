package editor;

public class GapBufferTest extends EditBufferTest {    
    
    @Override public EditBuffer make() {
        return new GapBuffer();
    }
}
