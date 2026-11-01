package l;

import android.content.Context;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5783 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13026 f19636;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17072 f19637;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile C12134 f19638;

    public C5783(C13026 c13026, C17072 c17072) {
        this.f19636 = c13026;
        this.f19637 = c17072;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15917() {
        C12134 c12134 = this.f19638;
        if (c12134 != null) {
            Context context = this.f19636.getContext();
            if (context instanceof AbstractActivityC12483) {
                AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) context;
                if (abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed()) {
                    return;
                }
            }
            boolean z = c12134.f40631;
            if (z) {
                if (this.f19637.m39857(this.f19636)) {
                    C15829.m37617(R.string.MT_Protector, 0).m37622();
                    return;
                }
                return;
            }
            C13026 c13026 = this.f19636;
            C17072 c17072 = this.f19637;
            if (z || !c13026.f43452.m33453(c17072.f54490, c12134.f40629, c17072.f54489, c17072.f54491, c12134.f40630)) {
                return;
            }
            this.f19636.invalidate();
            C13026 c13027 = this.f19636;
            c13027.m32232(c13027.f43452.m33443());
        }
    }
}
