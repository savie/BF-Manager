package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5959 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final List f20404 = C4681.unmodifiableList(Arrays.asList("INVALID", "EPSILON", "RANGE", "RULE", "PREDICATE", "ATOM", "ACTION", "SET", "NOT_SET", "WILDCARD", "PRECEDENCE"));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC17715 f20405;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo2568();

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo2569(int i, int i2);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14907 mo17341() {
        return null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public boolean mo2570() {
        return this instanceof C3545;
    }

    static {
        C13416 c13416 = new C13416();
        c13416.put(C0562.class, 1);
        c13416.put(C21401.class, 2);
        c13416.put(C7976.class, 3);
        c13416.put(C20655.class, 4);
        c13416.put(C12494.class, 5);
        c13416.put(C3545.class, 6);
        c13416.put(C13941.class, 7);
        c13416.put(C2010.class, 8);
        c13416.put(C2230.class, 9);
        c13416.put(C3501.class, 10);
        C4681.unmodifiableMap(c13416);
    }

    public AbstractC5959(AbstractC17715 abstractC17715) {
        if (abstractC17715 == null) {
            throw new NullPointerException("target cannot be null.");
        }
        this.f20405 = abstractC17715;
    }
}
