package l;

/* JADX INFO: renamed from: l.۫ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G5OY */
/* JADX INFO: loaded from: classes4.dex */
public final class C12228 extends AbstractC23847 implements InterfaceC16412, InterfaceC10062 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC20852 f40858;

    @Override // l.InterfaceC7239
    /* JADX INFO: renamed from: ۨ */
    public final int mo1599() {
        return 9;
    }

    public C12228(InterfaceC20852 interfaceC20852) {
        this.f40858 = interfaceC20852;
    }

    @Override // l.InterfaceC16412
    /* JADX INFO: renamed from: ۬ */
    public final String mo20789() {
        InterfaceC20852 interfaceC20852 = this.f40858;
        if (interfaceC20852 == null) {
            return null;
        }
        return interfaceC20852.getString();
    }

    @Override // l.InterfaceC16412
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC20852 mo20790() {
        return this.f40858;
    }

    @Override // l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ */
    public final void mo1141(C8485 c8485) {
        InterfaceC20852 interfaceC20852 = this.f40858;
        if (interfaceC20852 != null) {
            this.f40858 = c8485.m22164(interfaceC20852.getString());
        }
    }
}
