package l;

/* JADX INFO: renamed from: l.ܿۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 35M1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17166 extends AbstractC23847 implements InterfaceC12179, InterfaceC10062 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f54729;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC15914 f54730;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC20852 f54731;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC20852 f54732;

    @Override // l.InterfaceC7239
    /* JADX INFO: renamed from: ۨ */
    public final int mo1599() {
        return 3;
    }

    public C17166(int i, InterfaceC20852 interfaceC20852, InterfaceC15914 interfaceC15914, InterfaceC20852 interfaceC20853) {
        this.f54729 = i;
        this.f54732 = interfaceC20852;
        this.f54730 = interfaceC15914;
        this.f54731 = interfaceC20853;
    }

    @Override // l.InterfaceC12179
    /* JADX INFO: renamed from: ۙ */
    public final int mo9024() {
        return this.f54729;
    }

    @Override // l.InterfaceC12179
    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC20852 mo9023() {
        return this.f54732;
    }

    @Override // l.InterfaceC12179
    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC15914 mo9026() {
        return this.f54730;
    }

    @Override // l.InterfaceC12179
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC20852 mo9025() {
        return this.f54731;
    }

    @Override // l.InterfaceC19940
    public final String getName() {
        InterfaceC20852 interfaceC20852 = this.f54732;
        if (interfaceC20852 == null) {
            return null;
        }
        return interfaceC20852.getString();
    }

    @Override // l.InterfaceC19940
    public final String getType() {
        InterfaceC15914 interfaceC15914 = this.f54730;
        if (interfaceC15914 == null) {
            return null;
        }
        return interfaceC15914.getType();
    }

    @Override // l.InterfaceC19940
    public final String getSignature() {
        InterfaceC20852 interfaceC20852 = this.f54731;
        if (interfaceC20852 == null) {
            return null;
        }
        return interfaceC20852.getString();
    }

    @Override // l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ */
    public final void mo1141(C8485 c8485) {
        InterfaceC20852 interfaceC20852 = this.f54732;
        if (interfaceC20852 != null) {
            this.f54732 = c8485.m22164(interfaceC20852.getString());
        }
        InterfaceC15914 interfaceC15914 = this.f54730;
        if (interfaceC15914 != null) {
            this.f54730 = c8485.f51666.m50097(interfaceC15914.getType());
        }
        InterfaceC20852 interfaceC20853 = this.f54731;
        if (interfaceC20853 != null) {
            this.f54731 = c8485.m22164(interfaceC20853.getString());
        }
    }
}
