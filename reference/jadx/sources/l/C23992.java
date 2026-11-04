package l;

/* JADX INFO: renamed from: l.᩺ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5X9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23992 extends AbstractC14294 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final double f77637;

    public C23992(C4028 c4028, byte b) {
        this.f77637 = Double.longBitsToDouble(C3102.m10109(c4028.m13001(b + 1)));
    }

    public C23992(double d) {
        this.f77637 = d;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final void mo1281(C24166 c24166) {
        byte[] bArrM10115 = C3102.m10115(Double.doubleToRawLongBits(this.f77637));
        c24166.m54138(EnumC6837.VALUE_DOUBLE.f22727 | ((bArrM10115.length - 1) << 5));
        c24166.m54133(bArrM10115, 0, bArrM10115.length);
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final int mo1280(int i) {
        return C3102.m10124(Double.doubleToRawLongBits(this.f77637)) + i + 1;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1283(AbstractC14294 abstractC14294) {
        return Double.compare(this.f77637, ((C23992) abstractC14294).f77637);
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ܽ */
    public final EnumC6837 mo1282() {
        return EnumC6837.VALUE_DOUBLE;
    }

    public final int hashCode() {
        return (int) Double.doubleToRawLongBits(this.f77637);
    }
}
