package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes2.dex */
public final class C3604 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14895 f13257;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C11697 f13258;

    public C3604(C14895 c14895) {
        this.f13257 = c14895;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C14895 c14895 = this.f13257;
        c14895.f48665.setVisibility(0);
        c14895.f48663 = true;
        c14895.f48666 = false;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C14895 c14895 = this.f13257;
        c14895.f48664.m17521();
        if (c14895.f48662) {
            this.f13258 = C14895.m35612(c14895);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C14895 c14895 = this.f13257;
        if (c14895.f48662) {
            c14895.f48660.m32414(this.f13258);
            if (this.f13258 == null) {
                C15829.m37611(R.string.MT_Protector);
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        C14895 c14895 = this.f13257;
        if (c14895.f48662) {
            c14895.f48666 = true;
            c14895.f48667.m42627((Throwable) exc);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C14895 c14895 = this.f13257;
        if (c14895.f48662) {
            c14895.f48665.setVisibility(8);
        }
        c14895.f48663 = false;
    }
}
