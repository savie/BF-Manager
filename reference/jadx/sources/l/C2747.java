package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8985 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2747 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C8516 f10542;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f10543;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f10544;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21075 f10545;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1777 f10546;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f10547;

    public C2747(Main main, long j, boolean z) {
        this.f10543 = main;
        this.f10547 = j;
        this.f10544 = z;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1777 c1777 = new C1777(this.f10543);
        c1777.m5837(R.string.MT_Protector);
        c1777.m5832("...");
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        this.f10546 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C1777 c1777 = this.f10546;
        C13638.requireNonNull(c1777);
        this.f10545 = C20370.m46018(this.f10547, this.f10544, new C14038(c1777), new C11921(this));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C21075 c21075 = this.f10545;
        if (c21075 == null || c21075.m47486() || this.f10546.m5824()) {
            return;
        }
        if (this.f10545.m47487() > 0) {
            C15829.m37613((CharSequence) C16737.m39264(R.string.MT_Protector, Integer.valueOf(this.f10545.m47487())));
        } else {
            C15829.m37611(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f10543.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f10546.m5825();
        C21094.m47530();
    }
}
