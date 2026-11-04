package l;

import android.content.Context;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes.dex */
public final class C25331 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12628 f81798;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11904 f81799;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile C2210 f81800;

    public C25331(C12628 c12628, C11904 c11904) {
        this.f81798 = c12628;
        this.f81799 = c11904;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56609() {
        C2210 c2210 = this.f81800;
        if (c2210 != null) {
            Context context = this.f81798.getContext();
            if (context instanceof AbstractActivityC17204) {
                AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) context;
                if (abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed()) {
                    return;
                }
            }
            boolean z = c2210.f7254;
            if (z) {
                if (this.f81799.m29785(this.f81798)) {
                    C22673.m51158(R.string.MT_Protector, 0).m51163();
                    return;
                }
                return;
            }
            C12628 c12628 = this.f81798;
            C11904 c11904 = this.f81799;
            if (z || !c12628.f40509.m17199(c11904.f38339, c2210.f7252, c11904.f38343, c11904.f38341, c2210.f7253)) {
                return;
            }
            this.f81798.invalidate();
            C12628 c12629 = this.f81798;
            c12629.m31367(c12629.f40509.m17202());
        }
    }
}
