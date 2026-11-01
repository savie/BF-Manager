package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.۬ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC13299 {
    SYNTHETIC(4096),
    MANDATED(32768);


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f44162;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m32786(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC13299) it.next()).f44162;
        }
        return i;
    }

    EnumC13299(int i) {
        this.f44162 = i;
    }
}
