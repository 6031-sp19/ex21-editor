package editor;

public class SimpleBufferTest extends EditBufferTest {
    
    @Override public EditBuffer make() {
        return new SimpleBuffer();
    }
}
