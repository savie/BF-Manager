package l;

/* JADX INFO: renamed from: l.ۖۧۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9630 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2621 extends AbstractC19029 implements InterfaceC12888 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f8415;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f8416;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f8417;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f8418;

    @Override // l.InterfaceC10650
    /* JADX INFO: renamed from: ۤ */
    public final int mo4171() {
        return 6;
    }

    public C2621(String str, int i, String str2, String str3, int i2) {
        super(i);
        this.f8417 = i2;
        this.f8418 = str;
        this.f8416 = str2;
        this.f8415 = str3;
    }

    @Override // l.InterfaceC12888
    /* JADX INFO: renamed from: ۙ */
    public final int mo6025() {
        return this.f8417;
    }

    @Override // l.InterfaceC15125
    public final String getName() {
        return this.f8418;
    }

    @Override // l.InterfaceC15125
    public final String getType() {
        return this.f8416;
    }

    @Override // l.InterfaceC15125
    public final String getSignature() {
        return this.f8415;
    }
}
