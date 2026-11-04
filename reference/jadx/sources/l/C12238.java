package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.ۨ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: TAYI */
/* JADX INFO: loaded from: classes3.dex */
public class C12238 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f39389 = AtomicIntegerFieldUpdater.newUpdater(C12238.class, "_handled$volatile");
    public volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable f39390;

    public C12238(Throwable th, boolean z) {
        this.f39390 = th;
        this._handled$volatile = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30570() {
        f39389.get(this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m30571() {
        return f39389.compareAndSet(this, 0, 1);
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f39390 + ']';
    }
}
