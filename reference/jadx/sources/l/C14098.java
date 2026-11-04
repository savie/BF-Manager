package l;

/* JADX INFO: renamed from: l.۬᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7VX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14098 implements InterfaceC7387 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC6554 f44610;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14098 m34255(C22962 c22962, String str, byte[] bArr) throws Throwable {
        AbstractC6554 abstractC6554M18448 = AbstractC6554.m18448(c22962, bArr, (byte[]) null);
        C14098 c14098 = new C14098();
        c14098.f44610 = abstractC6554M18448;
        return c14098;
    }

    @Override // l.InterfaceC7387
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo20288(byte[] bArr) {
        return this.f44610.mo18457(bArr);
    }

    @Override // l.InterfaceC7387
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo20290() {
        return this.f44610.mo2673();
    }

    @Override // l.InterfaceC7387
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo20291(byte[] bArr) {
        return this.f44610.mo2675(bArr);
    }

    @Override // l.InterfaceC7387
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo20289(String str, byte[] bArr) {
        return this.f44610.mo2669(str, bArr);
    }

    @Override // l.InterfaceC7387
    /* JADX INFO: renamed from: ۙ */
    public final String mo20287() {
        return C9011.m24051(this.f44610.mo2676());
    }

    @Override // l.InterfaceC7387
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo20292() {
        return this.f44610.f22004;
    }

    @Override // l.InterfaceC7387
    public final void clear() {
        this.f44610.mo2668();
        this.f44610 = null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC6554 m34256() {
        return this.f44610;
    }
}
