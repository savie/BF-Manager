package l;

/* JADX INFO: renamed from: l.ۤ᩻ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4RJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11219 extends AbstractC19029 implements InterfaceC1702, InterfaceC21839 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f35379;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C21530 f35380;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f35381;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f35382;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3630 f35383;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C3630 f35384;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f35385;

    @Override // l.InterfaceC10650
    /* JADX INFO: renamed from: ۤ */
    public final int mo4171() {
        return 3;
    }

    public C11219(String str, int i, String str2, String str3, int i2) {
        super(i);
        this.f35379 = i2;
        this.f35385 = str;
        this.f35382 = str2;
        this.f35381 = str3;
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ۙ */
    public final int mo6062() {
        return this.f35379;
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC22759 mo6063() {
        C3630 c3630 = this.f35383;
        if (c3630 != null) {
            return c3630;
        }
        if (this.f35385 == null) {
            return null;
        }
        return new C13807(this);
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC19775 mo6065() {
        C21530 c21530 = this.f35380;
        if (c21530 != null) {
            return c21530;
        }
        if (this.f35382 == null) {
            return null;
        }
        return new C5254(this);
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC22759 mo6064() {
        C3630 c3630 = this.f35384;
        if (c3630 != null) {
            return c3630;
        }
        if (this.f35381 == null) {
            return null;
        }
        return new C22408(this);
    }

    @Override // l.InterfaceC15125
    public final String getName() {
        return this.f35385;
    }

    @Override // l.InterfaceC15125
    public final String getType() {
        return this.f35382;
    }

    @Override // l.InterfaceC15125
    public final String getSignature() {
        return this.f35381;
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo2770(C8850 c8850) {
        this.f35383 = c8850.m23708(this.f35385);
        this.f35384 = c8850.m23708(this.f35381);
        String str = this.f35382;
        this.f35380 = str != null ? c8850.f74939.m35671(str) : null;
    }
}
