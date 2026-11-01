package l;

/* JADX INFO: renamed from: l.ۗۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4QP */
/* JADX INFO: loaded from: classes3.dex */
public final class C3054 extends AbstractC3384 implements InterfaceC19503, InterfaceC10062 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f11434 = EnumC18057.Format20bc;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC7446 f11435;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f11436;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326;
    }

    public C3054(EnumC10297 enumC10297, int i, InterfaceC7446 interfaceC7446) {
        super(enumC10297);
        int i2 = C20175.f65488;
        if (i > 0 && i < 10) {
            this.f11436 = i;
            this.f11435 = interfaceC7446;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid verification error value: %d. Must be between 1 and 9, inclusive", Integer.valueOf(i)));
    }

    @Override // l.InterfaceC19503
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int mo9148() {
        return this.f11436;
    }

    @Override // l.InterfaceC13859
    public final InterfaceC7446 getReference() {
        return this.f11435;
    }

    @Override // l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ */
    public final void mo1141(C8485 c8485) {
        this.f11435 = c8485.m22156(this.f11435);
    }

    @Override // l.InterfaceC13859
    /* JADX INFO: renamed from: ᩵ */
    public final int mo1143() {
        InterfaceC7446 interfaceC7446 = this.f11435;
        if (interfaceC7446 instanceof InterfaceC20852) {
            return 0;
        }
        if (interfaceC7446 instanceof InterfaceC15914) {
            return 1;
        }
        if (interfaceC7446 instanceof InterfaceC18735) {
            return 2;
        }
        if (interfaceC7446 instanceof InterfaceC8858) {
            return 3;
        }
        if (interfaceC7446 instanceof InterfaceC19441) {
            return 4;
        }
        if (interfaceC7446 instanceof InterfaceC18029) {
            return 5;
        }
        if (interfaceC7446 instanceof InterfaceC8152) {
            return 6;
        }
        throw new IllegalStateException("Invalid reference");
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f11434;
    }
}
