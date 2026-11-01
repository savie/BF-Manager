package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0155 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1210;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4471 f1211;

    public C0155(ActivityC4471 activityC4471, int i) {
        this.f1211 = activityC4471;
        this.f1210 = i;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f1211, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f1211.f15887.m9103(EnumC10803.values()[this.f1210]);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f1211.f15887.m9126() == 0) {
            C15829.m37611(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f1211.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
