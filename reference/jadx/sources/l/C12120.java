package l;

/* JADX INFO: renamed from: l.ۨۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4QP */
/* JADX INFO: loaded from: classes4.dex */
public final class C12120 extends AbstractC12384 implements InterfaceC13633, InterfaceC21839 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7011 f38973 = EnumC7011.Format20bc;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f38974;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC10824 f38975;

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۛ */
    public final String mo1543() {
        return mo30864().f73509;
    }

    public C12120(EnumC22631 enumC22631, int i, InterfaceC10824 interfaceC10824) {
        super(enumC22631);
        int i2 = C5477.f19075;
        if (i > 0 && i < 10) {
            this.f38974 = i;
            this.f38975 = interfaceC10824;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid verification error value: %d. Must be between 1 and 9, inclusive", Integer.valueOf(i)));
    }

    @Override // l.InterfaceC13633
    /* JADX INFO: renamed from: ۗ */
    public final int mo20338() {
        return this.f38974;
    }

    @Override // l.InterfaceC6177
    public final InterfaceC10824 getReference() {
        return this.f38975;
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo2770(C8850 c8850) {
        this.f38975 = c8850.m23714(this.f38975);
    }

    @Override // l.InterfaceC6177
    /* JADX INFO: renamed from: ᩵ */
    public final int mo2771() {
        InterfaceC10824 interfaceC10824 = this.f38975;
        if (interfaceC10824 instanceof InterfaceC22759) {
            return 0;
        }
        if (interfaceC10824 instanceof InterfaceC19775) {
            return 1;
        }
        if (interfaceC10824 instanceof InterfaceC8304) {
            return 2;
        }
        if (interfaceC10824 instanceof InterfaceC4859) {
            return 3;
        }
        if (interfaceC10824 instanceof InterfaceC13524) {
            return 4;
        }
        if (interfaceC10824 instanceof InterfaceC2338) {
            return 5;
        }
        if (interfaceC10824 instanceof InterfaceC6813) {
            return 6;
        }
        throw new IllegalStateException("Invalid reference");
    }

    @Override // l.AbstractC12384
    /* JADX INFO: renamed from: ۢ */
    public final EnumC7011 mo1544() {
        return f38973;
    }
}
