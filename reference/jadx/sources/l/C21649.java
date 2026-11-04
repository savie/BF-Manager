package l;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩶᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes.dex */
public final class C21649 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3374 f69111;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C15481 f69112;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f69113;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f69110 = new AtomicReference();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayBlockingQueue f69114 = new ArrayBlockingQueue(20);

    public C21649(C15481 c15481, C3374 c3374) {
        this.f69112 = c15481;
        this.f69111 = c3374;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49175() throws Exception {
        AtomicReference atomicReference = this.f69110;
        if (atomicReference.get() == null) {
            return;
        }
        Exception exc = (Exception) atomicReference.get();
        C22327.m50389(exc);
        throw exc;
    }
}
