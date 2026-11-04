package l;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.۠ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes3.dex */
public final class C8772 extends WeakReference {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable f28520;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C8772 f28521;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f28522;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f28523;

    public C8772(AbstractFutureC13992 abstractFutureC13992, Throwable th, C8772 c8772, ReferenceQueue referenceQueue) {
        super(abstractFutureC13992, referenceQueue);
        this.f28520 = th;
        this.f28521 = c8772;
        this.f28523 = Thread.currentThread().getId();
        this.f28522 = System.identityHashCode(abstractFutureC13992);
    }
}
