package l;

/* JADX INFO: renamed from: l.᩺ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S4UH */
/* JADX INFO: loaded from: classes.dex */
public final class C23122 extends AbstractC11833 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final short f75091;

    public C23122(C13825 c13825, byte b) {
        this.f75091 = (short) C12076.m30049(c13825.m33646(b + 1));
    }

    public C23122(short s) {
        this.f75091 = s;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public final void mo4463(C4651 c4651) {
        byte[] bArrM30050 = C12076.m30050(this.f75091);
        c4651.m12841(EnumC18182.VALUE_SHORT.f58128 | ((bArrM30050.length - 1) << 5));
        c4651.m12837(bArrM30050, 0, bArrM30050.length);
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public final int mo4462(int i) {
        return C12076.m30046(this.f75091) + i + 1;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ܰ */
    public final int mo4464(AbstractC11833 abstractC11833) {
        short s = ((C23122) abstractC11833).f75091;
        short s2 = this.f75091;
        if (s2 < s) {
            return -1;
        }
        return s2 > s ? 1 : 0;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ᩸ */
    public final EnumC18182 mo4465() {
        return EnumC18182.VALUE_SHORT;
    }

    public final int hashCode() {
        return this.f75091;
    }
}
