package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC22471 {
    SYNTHETIC(4096),
    MANDATED(32768);


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f73360;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m49975(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC22471) it.next()).f73360;
        }
        return i;
    }

    EnumC22471(int i) {
        this.f73360 = i;
    }
}
