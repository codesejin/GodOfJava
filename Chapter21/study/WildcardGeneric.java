package lang.thegodofjava.Chapter21.study;

import java.util.*;

public class WildcardGeneric<W> {
    W wildCard;
    public void setWildcard(W wildcard) {
        this.wildCard = wildcard;
    }
    public W getWildCard() {
        return wildCard;
    }
}
