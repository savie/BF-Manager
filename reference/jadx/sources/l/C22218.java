package l;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩹ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes.dex */
public final class C22218 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C22212 f72658;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C8516 f72659;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f72660;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f72657 = new AtomicReference();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayBlockingQueue f72656 = new ArrayBlockingQueue(20);

    public C22218(C22212 c22212, C8516 c8516) {
        this.f72658 = c22212;
        this.f72659 = c8516;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49333() throws Exception {
        AtomicReference atomicReference = this.f72657;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
    }
}
