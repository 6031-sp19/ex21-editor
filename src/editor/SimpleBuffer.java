package editor;

/**
 * SimpleBuffer is a threadsafe EditBuffer with a simple rep.
 */
public class SimpleBuffer implements EditBuffer {

    private String text;
    // Rep invariant: 
    //   true
    // Abstraction function: 
    //   represents the sequence text[0],...,text[text.length()-1]
    // Safety from rep exposure:
    //   TODO
    // Concurrency argument:
    //   TODO

    private void checkRep() {
        assert text != null;
    }

    /** Make a SimpleBuffer. */
    public SimpleBuffer() {
        text = "";
        checkRep();
    }

    @Override
    public void insert(int pos, String ins) {
        text = text.substring(0, pos) + ins + text.substring(pos);
        checkRep();
    }

    @Override
    public void delete(int pos, int len) {
        text = text.substring(0, pos) + text.substring(pos+len);
        checkRep();
    }

    @Override
    public int length() {
        return text.length();
    }

    @Override
    public String toString() {
        return text;
    }
}
