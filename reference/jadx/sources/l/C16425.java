package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 98AW */
/* JADX INFO: loaded from: classes5.dex */
public final class C16425 implements InterfaceC10594 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17130 f52844;

    public C16425(C17130 c17130) {
        this.f52844 = c17130;
    }

    @Override // l.InterfaceC10594
    public final void setTitle(int i) {
        this.f52844.m41591(R.string.MT_Protector);
    }

    @Override // l.InterfaceC10594
    public final void setName(String str) {
        this.f52844.mo2982(str);
    }

    @Override // l.InterfaceC10594
    /* JADX INFO: renamed from: ۙ */
    public final void mo24047(C3761 c3761) {
        this.f52844.mo2983(c3761);
    }

    @Override // l.InterfaceC10594
    /* JADX INFO: renamed from: ᩸ۙ */
    public final void mo24050() {
        this.f52844.m2974(true);
    }

    @Override // l.InterfaceC10594
    /* JADX INFO: renamed from: ܰ */
    public final void mo24048(long j) {
        this.f52844.mo2975(j);
    }

    @Override // l.InterfaceC10594
    public final void setProgress(int i) {
        this.f52844.mo21455(i);
    }

    @Override // l.InterfaceC10594
    /* JADX INFO: renamed from: ۙ */
    public final void mo24046() {
        this.f52844.cancel();
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f52844.mo2357();
    }
}
