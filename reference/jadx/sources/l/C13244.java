package l;

/* JADX INFO: renamed from: l.۬ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 655F */
/* JADX INFO: loaded from: classes4.dex */
public final class C13244 extends AbstractC11833 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f44002;

    public C13244(C13825 c13825, byte b) {
        this.f44002 = C12076.m30049(c13825.m33646(b + 1));
    }

    public C13244(long j) {
        this.f44002 = j;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public final void mo4463(C4651 c4651) {
        byte[] bArrM30050 = C12076.m30050(this.f44002);
        c4651.m12841(EnumC18182.VALUE_LONG.f58128 | ((bArrM30050.length - 1) << 5));
        c4651.m12837(bArrM30050, 0, bArrM30050.length);
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public final int mo4462(int i) {
        return C12076.m30046(this.f44002) + i + 1;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ܰ */
    public final int mo4464(AbstractC11833 abstractC11833) {
        long j = this.f44002;
        long j2 = ((C13244) abstractC11833).f44002;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ᩸ */
    public final EnumC18182 mo4465() {
        return EnumC18182.VALUE_LONG;
    }

    public final int hashCode() {
        return (int) this.f44002;
    }
}
