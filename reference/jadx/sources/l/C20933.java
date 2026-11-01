package l;

/* JADX INFO: renamed from: l.᩷ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes4.dex */
public final class C20933 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC1882 f68019;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19522 f68020;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7527 f68021;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f68022 = false;

    public C20933(C7527 c7527, C19522 c19522) {
        AbstractC1882 abstractC1882M28497;
        this.f68021 = c7527;
        this.f68020 = c19522;
        if (c7527.m20053(EnumC10350.CONTENT_CHECKSUM)) {
            C11389.m28496();
            abstractC1882M28497 = C11389.m28497();
        } else {
            abstractC1882M28497 = null;
        }
        this.f68019 = abstractC1882M28497;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47067(EnumC10350 enumC10350) {
        return this.f68021.m20053(enumC10350);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7527 m47064() {
        return this.f68021;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C19522 m47069() {
        return this.f68020;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47066(int i, byte[] bArr) {
        this.f68019.mo6133(i, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47065() {
        return this.f68019.mo6132();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47070() {
        this.f68022 = true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m47068() {
        return this.f68022;
    }
}
