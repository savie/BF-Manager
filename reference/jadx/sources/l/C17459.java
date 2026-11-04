package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.ܽ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: TAYI */
/* JADX INFO: loaded from: classes5.dex */
public final class C17459 extends C12238 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f56776 = AtomicIntegerFieldUpdater.newUpdater(C17459.class, "_resumed$volatile");
    public volatile /* synthetic */ int _resumed$volatile;

    public C17459(C24919 c24919, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + c24919 + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m40960() {
        return f56776.compareAndSet(this, 0, 1);
    }
}
