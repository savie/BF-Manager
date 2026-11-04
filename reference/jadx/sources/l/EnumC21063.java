package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶ۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC21063 {
    SYNTHETIC(4096),
    MANDATED(32768);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f67308;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48135(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC21063) it.next()).f67308;
        }
        return i;
    }

    EnumC21063(int i) {
        this.f67308 = i;
    }
}
