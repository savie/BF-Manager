package l;

/* JADX INFO: renamed from: l.ۛۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K66K */
/* JADX INFO: loaded from: classes3.dex */
public final class C6092 extends AbstractC14294 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char f20821;

    public C6092(C4028 c4028, byte b) {
        this.f20821 = (char) C3102.m10116(c4028.m13001(b + 1));
    }

    public C6092(char c) {
        this.f20821 = c;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final void mo1281(C24166 c24166) {
        byte[] bArrM10118 = C3102.m10118(this.f20821);
        c24166.m54138(EnumC6837.VALUE_CHAR.f22727 | ((bArrM10118.length - 1) << 5));
        c24166.m54133(bArrM10118, 0, bArrM10118.length);
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final int mo1280(int i) {
        return C3102.m10119(this.f20821) + i + 1;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1283(AbstractC14294 abstractC14294) {
        char c = ((C6092) abstractC14294).f20821;
        char c2 = this.f20821;
        if (c2 < c) {
            return -1;
        }
        return c2 > c ? 1 : 0;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ܽ */
    public final EnumC6837 mo1282() {
        return EnumC6837.VALUE_CHAR;
    }

    public final int hashCode() {
        return this.f20821;
    }
}
