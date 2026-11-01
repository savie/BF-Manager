package l;

/* JADX INFO: renamed from: l.֨ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N55R */
/* JADX INFO: loaded from: classes2.dex */
public final class C1248 extends AbstractC11833 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f5426;

    public C1248(C13825 c13825, byte b) {
        this.f5426 = (int) C12076.m30049(c13825.m33646(b + 1));
    }

    public C1248(int i) {
        this.f5426 = i;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4463(C4651 c4651) {
        byte[] bArrM30050 = C12076.m30050(this.f5426);
        c4651.m12841(EnumC18182.VALUE_INT.f58128 | ((bArrM30050.length - 1) << 5));
        c4651.m12837(bArrM30050, 0, bArrM30050.length);
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo4462(int i) {
        return C12076.m30046(this.f5426) + i + 1;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo4464(AbstractC11833 abstractC11833) {
        int i = ((C1248) abstractC11833).f5426;
        int i2 = this.f5426;
        if (i2 < i) {
            return -1;
        }
        return i2 > i ? 1 : 0;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC18182 mo4465() {
        return EnumC18182.VALUE_INT;
    }

    public final int hashCode() {
        return this.f5426;
    }
}
