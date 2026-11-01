package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴ᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC18964 {
    OPEN(32),
    SYNTHETIC(4096),
    MANDATED(32768);


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f61411;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43665(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC18964) it.next()).f61411;
        }
        return i;
    }

    EnumC18964(int i) {
        this.f61411 = i;
    }
}
