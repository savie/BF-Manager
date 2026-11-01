package l;

/* JADX INFO: renamed from: l.ۜۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31MV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6560 extends AbstractC15028 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C17061 f22103;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final CharSequence f22104;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CharSequence f22105;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C17061 f22106;

    public C6560(C17061 c17061, C17061 c17062, CharSequence charSequence, CharSequence charSequence2, InterfaceC13409 interfaceC13409, C16936 c16936) {
        super(charSequence.length(), charSequence2.length(), interfaceC13409, c16936);
        this.f22106 = c17061;
        this.f22103 = c17062;
        this.f22105 = charSequence;
        this.f22104 = charSequence2;
    }

    @Override // l.AbstractC15028
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17801(int i, int i2, int i3, int i4) {
        for (C20464 c20464 : C5772.m15896(this.f22105.subSequence(i, i2), this.f22104.subSequence(i3, i4), this.f49001).mo11889()) {
            int i5 = c20464.f66401;
            this.f48999.m15540(i + i5, c20464.f66399 + i3, c20464.f66400 - i5);
        }
    }

    @Override // l.AbstractC15028
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16231 mo17800(int i) {
        C17061 c17061 = this.f22106;
        return new C16231(c17061.f54471[i], c17061.m39844(i));
    }

    @Override // l.AbstractC15028
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16231 mo17802(int i) {
        C17061 c17061 = this.f22103;
        return new C16231(c17061.f54471[i], c17061.m39844(i));
    }
}
