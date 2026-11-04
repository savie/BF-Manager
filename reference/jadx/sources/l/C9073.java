package l;

/* JADX INFO: renamed from: l.ۡۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4UH */
/* JADX INFO: loaded from: classes4.dex */
public final class C9073 extends AbstractC14294 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final short f29500;

    public C9073(C4028 c4028, byte b) {
        this.f29500 = (short) C3102.m10121(c4028.m13001(b + 1));
    }

    public C9073(short s) {
        this.f29500 = s;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final void mo1281(C24166 c24166) {
        byte[] bArrM10123 = C3102.m10123(this.f29500);
        c24166.m54138(EnumC6837.VALUE_SHORT.f22727 | ((bArrM10123.length - 1) << 5));
        c24166.m54133(bArrM10123, 0, bArrM10123.length);
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final int mo1280(int i) {
        return C3102.m10120(this.f29500) + i + 1;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1283(AbstractC14294 abstractC14294) {
        short s = ((C9073) abstractC14294).f29500;
        short s2 = this.f29500;
        if (s2 < s) {
            return -1;
        }
        return s2 > s ? 1 : 0;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ܽ */
    public final EnumC6837 mo1282() {
        return EnumC6837.VALUE_SHORT;
    }

    public final int hashCode() {
        return this.f29500;
    }
}
