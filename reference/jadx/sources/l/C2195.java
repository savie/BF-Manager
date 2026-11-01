package l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۖ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2195 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m6810(Unsafe unsafe, FutureC12075 futureC12075, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(futureC12075, j, obj, obj2)) {
            if (unsafe.getObject(futureC12075, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
