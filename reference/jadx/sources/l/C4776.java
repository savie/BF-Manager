package l;

/* JADX INFO: renamed from: l.ۙܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J5X9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4776 extends AbstractC11833 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final double f16792;

    public C4776(C13825 c13825, byte b) {
        this.f16792 = Double.longBitsToDouble(C12076.m30039(c13825.m33646(b + 1)));
    }

    public C4776(double d) {
        this.f16792 = d;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public final void mo4463(C4651 c4651) {
        byte[] bArrM30045 = C12076.m30045(Double.doubleToRawLongBits(this.f16792));
        c4651.m12841(EnumC18182.VALUE_DOUBLE.f58128 | ((bArrM30045.length - 1) << 5));
        c4651.m12837(bArrM30045, 0, bArrM30045.length);
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public final int mo4462(int i) {
        return C12076.m30038(Double.doubleToRawLongBits(this.f16792)) + i + 1;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ܰ */
    public final int mo4464(AbstractC11833 abstractC11833) {
        return Double.compare(this.f16792, ((C4776) abstractC11833).f16792);
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ᩸ */
    public final EnumC18182 mo4465() {
        return EnumC18182.VALUE_DOUBLE;
    }

    public final int hashCode() {
        return (int) Double.doubleToRawLongBits(this.f16792);
    }
}
