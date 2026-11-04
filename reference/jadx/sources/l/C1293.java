package l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.֨ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1293 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m4686(Unsafe unsafe, FutureC23690 futureC23690, long j) {
        C9495 c9495 = FutureC23690.f76811;
        while (!unsafe.compareAndSwapObject(futureC23690, j, (Object) null, c9495)) {
            if (unsafe.getObject(futureC23690, j) != null) {
                return false;
            }
        }
        return true;
    }
}
