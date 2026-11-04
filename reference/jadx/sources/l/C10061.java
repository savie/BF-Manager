package l;

import android.content.Context;

/* JADX INFO: renamed from: l.ۢۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M70U */
/* JADX INFO: loaded from: classes3.dex */
public final class C10061 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f32260;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12628 f32261;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile long f32262;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C13374 f32263;

    public C10061(C12628 c12628) {
        this.f32261 = c12628;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26020() {
        C13374 c13374 = this.f32263;
        if (c13374 == null || !this.f32260) {
            return;
        }
        Context context = this.f32261.getContext();
        if (context instanceof AbstractActivityC17204) {
            AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) context;
            if (abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed()) {
                return;
            }
        }
        if (this.f32261.f40509.m17197(c13374, this.f32262)) {
            this.f32261.invalidate();
            C12628 c12628 = this.f32261;
            c12628.m31367(c12628.f40509.m17202());
        }
    }
}
