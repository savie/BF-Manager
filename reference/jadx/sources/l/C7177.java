package l;

/* JADX INFO: renamed from: l.۟ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4RJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7177 extends AbstractC6471 implements InterfaceC12179, InterfaceC10062 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C3067 f23967;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f23968;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C1428 f23969;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f23970;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f23971;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3067 f23972;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f23973;

    @Override // l.InterfaceC7239
    /* JADX INFO: renamed from: ۨ */
    public final int mo1599() {
        return 3;
    }

    public C7177(String str, int i, String str2, String str3, int i2) {
        super(i);
        this.f23971 = i2;
        this.f23973 = str;
        this.f23968 = str2;
        this.f23970 = str3;
    }

    @Override // l.InterfaceC12179
    /* JADX INFO: renamed from: ۙ */
    public final int mo9024() {
        return this.f23971;
    }

    @Override // l.InterfaceC12179
    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC20852 mo9023() {
        C3067 c3067 = this.f23967;
        if (c3067 != null) {
            return c3067;
        }
        if (this.f23973 == null) {
            return null;
        }
        return new C19172(this);
    }

    @Override // l.InterfaceC12179
    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC15914 mo9026() {
        C1428 c1428 = this.f23969;
        if (c1428 != null) {
            return c1428;
        }
        if (this.f23968 == null) {
            return null;
        }
        return new C8589(this);
    }

    @Override // l.InterfaceC12179
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC20852 mo9025() {
        C3067 c3067 = this.f23972;
        if (c3067 != null) {
            return c3067;
        }
        if (this.f23970 == null) {
            return null;
        }
        return new C10000(this);
    }

    @Override // l.InterfaceC19940
    public final String getName() {
        return this.f23973;
    }

    @Override // l.InterfaceC19940
    public final String getType() {
        return this.f23968;
    }

    @Override // l.InterfaceC19940
    public final String getSignature() {
        return this.f23970;
    }

    @Override // l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ */
    public final void mo1141(C8485 c8485) {
        this.f23967 = c8485.m22152(this.f23973);
        this.f23972 = c8485.m22152(this.f23970);
        String str = this.f23968;
        this.f23969 = str != null ? c8485.f51666.m50097(str) : null;
    }
}
