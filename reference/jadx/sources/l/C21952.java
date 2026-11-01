package l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.᩹֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21952 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m48782(Unsafe unsafe, FutureC12075 futureC12075, long j) {
        C0784 c0784 = FutureC12075.f40414;
        while (!unsafe.compareAndSwapObject(futureC12075, j, (Object) null, c0784)) {
            if (unsafe.getObject(futureC12075, j) != null) {
                return false;
            }
        }
        return true;
    }
}
