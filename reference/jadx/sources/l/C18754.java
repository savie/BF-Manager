package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.ᩴ۫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: TAYI */
/* JADX INFO: loaded from: classes4.dex */
public class C18754 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f60807 = AtomicIntegerFieldUpdater.newUpdater(C18754.class, "_handled");
    public volatile /* synthetic */ int _handled;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable f60808;

    public C18754(Throwable th, boolean z) {
        this.f60808 = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43305() {
        return f60807.compareAndSet(this, 0, 1);
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f60808 + ']';
    }
}
