package l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۢܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10241 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m26374(Unsafe unsafe, FutureC23690 futureC23690, long j, Object obj) {
        while (!unsafe.compareAndSwapObject(futureC23690, j, (Object) null, obj)) {
            if (unsafe.getObject(futureC23690, j) != null) {
                return false;
            }
        }
        return true;
    }
}
