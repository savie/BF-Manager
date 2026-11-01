package l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۚ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5018 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m13911(Unsafe unsafe, FutureC12075 futureC12075, long j, Object obj) {
        while (!unsafe.compareAndSwapObject(futureC12075, j, (Object) null, obj)) {
            if (unsafe.getObject(futureC12075, j) != null) {
                return false;
            }
        }
        return true;
    }
}
