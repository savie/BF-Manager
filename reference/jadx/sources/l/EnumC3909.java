package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۘۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3909 {
    SYNTHETIC(4096),
    MANDATED(32768);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f13364;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m12611(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC3909) it.next()).f13364;
        }
        return i;
    }

    EnumC3909(int i) {
        this.f13364 = i;
    }
}
