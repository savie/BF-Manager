package l;

/* JADX INFO: renamed from: l.ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B54W */
/* JADX INFO: loaded from: classes4.dex */
public final class C10644 extends C5596 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22579 f33750;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f33751 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f33749 = 0;

    public C10644(C22579 c22579) {
        this.f33750 = c22579;
    }

    @Override // l.C5596, l.InterfaceC4020
    /* JADX INFO: renamed from: ۙ */
    public final void mo12073() {
        if (this.f33751) {
            return;
        }
        this.f33751 = true;
        InterfaceC4020 interfaceC4020 = this.f33750.f73013;
        if (interfaceC4020 != null) {
            interfaceC4020.mo12073();
        }
    }

    @Override // l.InterfaceC4020
    public final void onAnimationEnd() {
        int i = this.f33749 + 1;
        this.f33749 = i;
        C22579 c22579 = this.f33750;
        if (i == c22579.f73010.size()) {
            InterfaceC4020 interfaceC4020 = c22579.f73013;
            if (interfaceC4020 != null) {
                interfaceC4020.onAnimationEnd();
            }
            this.f33749 = 0;
            this.f33751 = false;
            c22579.m50904();
        }
    }
}
