package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡ᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9631 {
    DO_NOT_RESOLVE_BY_DEFAULT(1),
    WARN_DEPRECATED(2),
    WARN_DEPRECATED_REMOVAL(4),
    WARN_INCUBATING(8);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f31146;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25143(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC9631) it.next()).f31146;
        }
        return i;
    }

    EnumC9631(int i) {
        this.f31146 = i;
    }
}
