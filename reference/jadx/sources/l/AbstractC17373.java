package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17373 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final List f55271 = C0561.unmodifiableList(Arrays.asList("INVALID", "EPSILON", "RANGE", "RULE", "PREDICATE", "ATOM", "ACTION", "SET", "NOT_SET", "WILDCARD", "PRECEDENCE"));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC2120 f55272;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo12146();

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo12147(int i, int i2);

    /* JADX INFO: renamed from: ۨ */
    public C0875 mo26136() {
        return null;
    }

    /* JADX INFO: renamed from: ܰ */
    public boolean mo12939() {
        return this instanceof C4321;
    }

    static {
        C12435 c12435 = new C12435();
        c12435.put(C6438.class, 1);
        c12435.put(C13140.class, 2);
        c12435.put(C23018.class, 3);
        c12435.put(C13846.class, 4);
        c12435.put(C11378.class, 5);
        c12435.put(C4321.class, 6);
        c12435.put(C10318.class, 7);
        c12435.put(C5733.class, 8);
        c12435.put(C6084.class, 9);
        c12435.put(C4672.class, 10);
        C0561.unmodifiableMap(c12435);
    }

    public AbstractC17373(AbstractC2120 abstractC2120) {
        if (abstractC2120 == null) {
            throw new NullPointerException("target cannot be null.");
        }
        this.f55272 = abstractC2120;
    }
}
