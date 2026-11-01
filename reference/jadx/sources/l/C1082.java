package l;

/* JADX INFO: renamed from: l.֨ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 45MR */
/* JADX INFO: loaded from: classes3.dex */
public final class C1082 extends AbstractC3384 implements InterfaceC0452 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC18057 f4944 = EnumC18057.Format22b;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f4945;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f4946;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f4947;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326 + " v" + mo1140() + ", v" + mo1144() + ", " + mo4062();
    }

    public C1082(int i, int i2, int i3, EnumC10297 enumC10297) {
        super(enumC10297);
        C13530.m33075(i);
        this.f4947 = i;
        C13530.m33075(i2);
        this.f4946 = i2;
        if (i3 >= -128 && i3 <= 127) {
            this.f4945 = i3;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Must be between -128 and 127, inclusive.", Integer.valueOf(i3)));
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo1140() {
        return this.f4947;
    }

    @Override // l.InterfaceC1157
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1144() {
        return this.f4946;
    }

    @Override // l.InterfaceC9357
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int mo4063() {
        return this.f4945;
    }

    @Override // l.InterfaceC6802
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long mo4062() {
        return this.f4945;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f4944;
    }
}
