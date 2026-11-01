package l;

/* JADX INFO: renamed from: l.ۡۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7VX */
/* JADX INFO: loaded from: classes3.dex */
public final class C8636 implements InterfaceC19219 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC2367 f29795;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8636 m22435(C19925 c19925, String str, byte[] bArr) throws Throwable {
        AbstractC2367 abstractC2367M7194 = AbstractC2367.m7194(c19925, bArr, (byte[]) null);
        C8636 c8636 = new C8636();
        c8636.f29795 = abstractC2367M7194;
        return c8636;
    }

    @Override // l.InterfaceC19219
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo22437(byte[] bArr) {
        return this.f29795.mo7205(bArr);
    }

    @Override // l.InterfaceC19219
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] mo22440() {
        return this.f29795.mo7208();
    }

    @Override // l.InterfaceC19219
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] mo22441(byte[] bArr) {
        return this.f29795.mo7212(bArr);
    }

    @Override // l.InterfaceC19219
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo22438(String str, byte[] bArr) {
        return this.f29795.mo7206(str, bArr);
    }

    @Override // l.InterfaceC19219
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo22436() {
        return C8491.m22171(this.f29795.mo7202());
    }

    @Override // l.InterfaceC19219
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo22442() {
        return this.f29795.f8367;
    }

    @Override // l.InterfaceC19219
    public final void clear() {
        this.f29795.mo7203();
        this.f29795 = null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC2367 m22439() {
        return this.f29795;
    }
}
