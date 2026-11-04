package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶ᩹۫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8BF */
/* JADX INFO: loaded from: classes5.dex */
public final class C16400 implements InterfaceC24628 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20876 f53218;

    public C16400(C20876 c20876) {
        this.f53218 = c20876;
    }

    @Override // l.InterfaceC24628
    public final void setTitle(int i) {
        this.f53218.m43868(R.string.MT_Protector);
    }

    @Override // l.InterfaceC24628
    public final void setName(String str) {
        this.f53218.mo16841(str);
    }

    @Override // l.InterfaceC24628
    /* JADX INFO: renamed from: ۙ */
    public final void mo12113(C1858 c1858) {
        this.f53218.mo16842(c1858);
    }

    @Override // l.InterfaceC24628
    /* JADX INFO: renamed from: ܽۙ */
    public final void mo12114() {
        this.f53218.m36394(true);
    }

    @Override // l.InterfaceC24628
    /* JADX INFO: renamed from: ᩷ */
    public final void mo12115(long j) {
        this.f53218.mo16838(j);
    }

    @Override // l.InterfaceC24628
    public final void setProgress(int i) {
        this.f53218.mo16839(i);
    }

    @Override // l.InterfaceC24628
    /* JADX INFO: renamed from: ۙ */
    public final void mo12112() {
        this.f53218.cancel();
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f53218.mo924();
    }
}
