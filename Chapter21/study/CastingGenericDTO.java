package lang.thegodofjava.Chapter21.study;

import java.io.Serializable;

public class CastingGenericDTO <JAVAAA> implements Serializable {
    private JAVAAA object;
    public void setObject(JAVAAA object) {
        this.object = object;
    }
    public JAVAAA getObject() {
        return object;
    }
}
