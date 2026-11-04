package l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ᩳܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19192 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m44463(Unsafe unsafe, FutureC23690 futureC23690, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(futureC23690, j, obj, obj2)) {
            if (unsafe.getObject(futureC23690, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
