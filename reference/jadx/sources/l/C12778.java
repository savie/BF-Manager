package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes4.dex */
public final class C12778 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C11697 f42595;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14895 f42596;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f42597;

    public C12778(C14895 c14895) {
        this.f42596 = c14895;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C14895 c14895 = this.f42596;
        c14895.f48665.setVisibility(0);
        c14895.f48663 = true;
        c14895.f48666 = false;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C14895 c14895 = this.f42596;
        c14895.f48664.m17521();
        if (c14895.f48662) {
            if (!c14895.f48671) {
                C13626 c13626M50132 = c14895.m50132(c14895.f48669.m47183());
                if (c13626M50132.m33326()) {
                    C14895.m35608(c14895, C17367.m40441(c13626M50132.m33327()));
                    this.f42597 = true;
                    return;
                }
            }
            c14895.f48671 = false;
            this.f42595 = C14895.m35612(c14895);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C14895 c14895 = this.f42596;
        if (c14895.f48662 && !this.f42597) {
            c14895.f48660.m32414(this.f42595);
            if (this.f42595 == null) {
                C15829.m37611(R.string.MT_Protector);
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        C14895 c14895 = this.f42596;
        if (c14895.f48662) {
            c14895.f48666 = true;
            c14895.f48667.m42627((Throwable) exc);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C14895 c14895 = this.f42596;
        if (c14895.f48662) {
            c14895.f48665.setVisibility(8);
        }
        c14895.f48663 = false;
    }
}
