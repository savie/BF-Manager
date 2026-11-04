package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛܶ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 98AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6486 implements InterfaceC24628 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4248 f21802;

    public C6486(C4248 c4248) {
        this.f21802 = c4248;
    }

    @Override // l.InterfaceC24628
    public final void setTitle(int i) {
        this.f21802.m43868(R.string.MT_Protector);
    }

    @Override // l.InterfaceC24628
    public final void setName(String str) {
        this.f21802.mo16841(str);
    }

    @Override // l.InterfaceC24628
    /* JADX INFO: renamed from: ۙ */
    public final void mo12113(C1858 c1858) {
        this.f21802.mo16842(c1858);
    }

    @Override // l.InterfaceC24628
    /* JADX INFO: renamed from: ܽۙ */
    public final void mo12114() {
        this.f21802.m36394(true);
    }

    @Override // l.InterfaceC24628
    /* JADX INFO: renamed from: ᩷ */
    public final void mo12115(long j) {
        this.f21802.mo16838(j);
    }

    @Override // l.InterfaceC24628
    public final void setProgress(int i) {
        this.f21802.mo16839(i);
    }

    @Override // l.InterfaceC24628
    /* JADX INFO: renamed from: ۙ */
    public final void mo12112() {
        this.f21802.cancel();
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f21802.mo924();
    }
}
