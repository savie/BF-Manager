package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗ᩹۫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8BF */
/* JADX INFO: loaded from: classes3.dex */
public final class C3722 implements InterfaceC0761 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20876 f12794;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f12795;

    public C3722(C20876 c20876, boolean z) {
        this.f12794 = c20876;
        this.f12795 = z;
    }

    @Override // l.InterfaceC24628
    public final void setTitle(int i) {
        if (this.f12795 && i == R.string.MT_Protector) {
            i = R.string.MT_Protector;
        }
        this.f12794.m43868(i);
    }

    @Override // l.InterfaceC24628
    public final void setName(String str) {
        this.f12794.mo16841(str);
    }

    @Override // l.InterfaceC0761
    /* JADX INFO: renamed from: ᩷ */
    public final void mo3125(boolean z) {
        this.f12794.m36393(z);
    }

    @Override // l.InterfaceC0761
    /* JADX INFO: renamed from: ᩻ */
    public final void mo3126(String str) {
        this.f12794.mo29447(str);
    }

    @Override // l.InterfaceC24628
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12113(C1858 c1858) {
        this.f12794.mo16842(c1858);
    }

    @Override // l.InterfaceC24628
    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final void mo12114() {
        this.f12794.m36394(true);
    }

    @Override // l.InterfaceC24628
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo12115(long j) {
        this.f12794.mo16838(j);
    }

    @Override // l.InterfaceC24628
    public final void setProgress(int i) {
        this.f12794.mo16839(i);
    }

    @Override // l.InterfaceC24628
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12112() {
        this.f12794.cancel();
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f12794.mo924();
    }
}
