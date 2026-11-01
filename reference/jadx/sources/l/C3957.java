package l;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۘ۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes2.dex */
public final class C3957 extends WeakReference {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f14704;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable f14705;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C3957 f14706;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f14707;

    public C3957(AbstractFutureC23009 abstractFutureC23009, Throwable th, C3957 c3957, ReferenceQueue referenceQueue) {
        super(abstractFutureC23009, referenceQueue);
        this.f14705 = th;
        this.f14706 = c3957;
        this.f14704 = Thread.currentThread().getId();
        this.f14707 = System.identityHashCode(abstractFutureC23009);
    }
}
