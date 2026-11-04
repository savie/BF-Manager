package l;

/* JADX INFO: renamed from: l.۟ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N55R */
/* JADX INFO: loaded from: classes4.dex */
public final class C7583 extends AbstractC14294 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f25052;

    public C7583(C4028 c4028, byte b) {
        this.f25052 = (int) C3102.m10121(c4028.m13001(b + 1));
    }

    public C7583(int i) {
        this.f25052 = i;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final void mo1281(C24166 c24166) {
        byte[] bArrM10123 = C3102.m10123(this.f25052);
        c24166.m54138(EnumC6837.VALUE_INT.f22727 | ((bArrM10123.length - 1) << 5));
        c24166.m54133(bArrM10123, 0, bArrM10123.length);
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final int mo1280(int i) {
        return C3102.m10120(this.f25052) + i + 1;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1283(AbstractC14294 abstractC14294) {
        int i = ((C7583) abstractC14294).f25052;
        int i2 = this.f25052;
        if (i2 < i) {
            return -1;
        }
        return i2 > i ? 1 : 0;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ܽ */
    public final EnumC6837 mo1282() {
        return EnumC6837.VALUE_INT;
    }

    public final int hashCode() {
        return this.f25052;
    }
}
