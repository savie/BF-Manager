package l;

/* JADX INFO: renamed from: l.۠ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R53J */
/* JADX INFO: loaded from: classes4.dex */
public final class C8139 extends AbstractC3384 implements InterfaceC9626 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f28485 = EnumC18057.Format31i;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f28486;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f28487;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " v" + mo1140() + ", " + mo4062();
    }

    public C8139(EnumC10297 enumC10297, int i, int i2) {
        super(enumC10297);
        C13530.m33075(i);
        this.f28487 = i;
        this.f28486 = i2;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f28487;
    }

    @Override // l.InterfaceC9357
    /* JADX INFO: renamed from: ᩺ */
    public final int mo4063() {
        return this.f28486;
    }

    @Override // l.InterfaceC6802
    /* JADX INFO: renamed from: ܺ */
    public final long mo4062() {
        return this.f28486;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f28485;
    }
}
