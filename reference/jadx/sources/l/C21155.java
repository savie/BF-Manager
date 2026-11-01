package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: O8BF */
/* JADX INFO: loaded from: classes5.dex */
public final class C21155 implements InterfaceC10594 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0693 f68892;

    public C21155(C0693 c0693) {
        this.f68892 = c0693;
    }

    @Override // l.InterfaceC10594
    public final void setTitle(int i) {
        this.f68892.m41591(R.string.MT_Protector);
    }

    @Override // l.InterfaceC10594
    public final void setName(String str) {
        this.f68892.mo2982(str);
    }

    @Override // l.InterfaceC10594
    /* JADX INFO: renamed from: ۙ */
    public final void mo24047(C3761 c3761) {
        this.f68892.mo2983(c3761);
    }

    @Override // l.InterfaceC10594
    /* JADX INFO: renamed from: ᩸ۙ */
    public final void mo24050() {
        this.f68892.m2974(true);
    }

    @Override // l.InterfaceC10594
    /* JADX INFO: renamed from: ܰ */
    public final void mo24048(long j) {
        this.f68892.mo2975(j);
    }

    @Override // l.InterfaceC10594
    public final void setProgress(int i) {
        this.f68892.mo21455(i);
    }

    @Override // l.InterfaceC10594
    /* JADX INFO: renamed from: ۙ */
    public final void mo24046() {
        this.f68892.cancel();
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f68892.mo2357();
    }
}
