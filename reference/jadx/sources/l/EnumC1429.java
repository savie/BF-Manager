package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.֨᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1429 {
    OPEN(32),
    SYNTHETIC(4096),
    MANDATED(32768);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f5028;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m5163(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC1429) it.next()).f5028;
        }
        return i;
    }

    EnumC1429(int i) {
        this.f5028 = i;
    }
}
