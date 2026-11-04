package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۙ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes3.dex */
public final class C5149 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f17950;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20065 f17951;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f17952;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2648 f17953;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC7364 f17954;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC14075 f17955;

    public C5149(C20065 c20065, C8614 c8614, InterfaceC14075 interfaceC14075, Runnable runnable) {
        this.f17951 = c20065;
        this.f17952 = c8614;
        this.f17955 = interfaceC14075;
        this.f17950 = runnable;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f17953 = this.f17952.m23169(true, (Runnable) new RunnableC13899(0, this.f17955));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        this.f17954 = this.f17955.mo3080(this.f17952.m23213().m20191());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C20065 c20065 = this.f17951;
        if (c20065.f64511 || !this.f17953.m8778()) {
            AbstractC7364 abstractC7364 = this.f17954;
            if (abstractC7364 != null) {
                abstractC7364.m20210();
                return;
            }
            return;
        }
        c20065.m46150(this.f17952, this.f17954);
        Runnable runnable = this.f17950;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f17953.m8779()) {
            return;
        }
        if ((exc instanceof C4866) || (exc instanceof C3090)) {
            C22673.m51153(0, exc.getMessage()).m51163();
        } else {
            this.f17951.m46161().m40401(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f17953.m8777();
    }
}
