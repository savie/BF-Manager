package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes4.dex */
public final class C11013 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22032 f37444;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14500 f37445;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f37446;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f37447;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1777 f37448;

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
    }

    public C11013(C22032 c22032, ActivityC5677 activityC5677, boolean z, C14500 c14500) {
        this.f37444 = c22032;
        this.f37447 = activityC5677;
        this.f37446 = z;
        this.f37445 = c14500;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1777 c1777 = new C1777(this.f37447);
        c1777.m5837(R.string.MT_Protector);
        c1777.m5832(C16737.m39264(R.string.MT_Protector, 0));
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        this.f37448 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C6073 c6073 = new C6073(this);
        C22032 c22032 = this.f37444;
        C14293 c14293 = new C14293(c22032.f71407);
        boolean z = this.f37446;
        C14500 c14500 = this.f37445;
        if (z) {
            int i = c14500.f47500;
            if (i == 0) {
                C23672.m52122(c22032.f71407, c14500.f47502, c6073);
                return;
            } else if (i == 1) {
                C23672.m52126(c22032.f71407, c14293, c14500.f47502, c14500.f47498, c14500.f47501, c6073);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                C23672.m52124(c22032.f71407, c14293, c14500.f47502, c14500.f47498, c14500.f47499, c6073);
                return;
            }
        }
        int i2 = c14500.f47500;
        if (i2 == 0) {
            C23672.m52133(c22032.f71407, c14500.f47502, c6073);
        } else {
            if (i2 != 1) {
                return;
            }
            C23672.m52125(c22032.f71407, c14293, c14500.f47502, c14500.f47498, c6073);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f37447.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f37448.m5825();
    }
}
