package l;

import android.content.Context;

/* JADX INFO: renamed from: l.᩺ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M70U */
/* JADX INFO: loaded from: classes.dex */
public final class C22717 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile C4558 f74006;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f74007;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C13026 f74008;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile long f74009;

    public C22717(C13026 c13026) {
        this.f74008 = c13026;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50354() {
        C4558 c4558 = this.f74006;
        if (c4558 == null || !this.f74007) {
            return;
        }
        Context context = this.f74008.getContext();
        if (context instanceof AbstractActivityC12483) {
            AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) context;
            if (abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed()) {
                return;
            }
        }
        if (this.f74008.f43452.m33455(c4558, this.f74009)) {
            this.f74008.invalidate();
            C13026 c13026 = this.f74008;
            c13026.m32232(c13026.f43452.m33443());
        }
    }
}
