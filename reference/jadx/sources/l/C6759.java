package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.ۜ۫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: TAYI */
/* JADX INFO: loaded from: classes3.dex */
public final class C6759 extends C18754 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22791 = AtomicIntegerFieldUpdater.newUpdater(C6759.class, "_resumed");
    public volatile /* synthetic */ int _resumed;

    public C6759(C13110 c13110, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + c13110 + " was cancelled normally");
        }
        super(th, z);
        this._resumed = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m18266() {
        return f22791.compareAndSet(this, 0, 1);
    }
}
