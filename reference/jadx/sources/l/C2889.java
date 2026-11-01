package l;

/* JADX INFO: renamed from: l.ۗ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K66K */
/* JADX INFO: loaded from: classes2.dex */
public final class C2889 extends AbstractC11833 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final char f10890;

    public C2889(C13825 c13825, byte b) {
        this.f10890 = (char) C12076.m30047(c13825.m33646(b + 1));
    }

    public C2889(char c) {
        this.f10890 = c;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public final void mo4463(C4651 c4651) {
        byte[] bArrM30048 = C12076.m30048(this.f10890);
        c4651.m12841(EnumC18182.VALUE_CHAR.f58128 | ((bArrM30048.length - 1) << 5));
        c4651.m12837(bArrM30048, 0, bArrM30048.length);
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public final int mo4462(int i) {
        return C12076.m30051(this.f10890) + i + 1;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ܰ */
    public final int mo4464(AbstractC11833 abstractC11833) {
        char c = ((C2889) abstractC11833).f10890;
        char c2 = this.f10890;
        if (c2 < c) {
            return -1;
        }
        return c2 > c ? 1 : 0;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ᩸ */
    public final EnumC18182 mo4465() {
        return EnumC18182.VALUE_CHAR;
    }

    public final int hashCode() {
        return this.f10890;
    }
}
