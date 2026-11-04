package l;

/* JADX INFO: renamed from: l.ᩳۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 655F */
/* JADX INFO: loaded from: classes5.dex */
public final class C18770 extends AbstractC14294 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f60970;

    public C18770(C4028 c4028, byte b) {
        this.f60970 = C3102.m10121(c4028.m13001(b + 1));
    }

    public C18770(long j) {
        this.f60970 = j;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final void mo1281(C24166 c24166) {
        byte[] bArrM10123 = C3102.m10123(this.f60970);
        c24166.m54138(EnumC6837.VALUE_LONG.f22727 | ((bArrM10123.length - 1) << 5));
        c24166.m54133(bArrM10123, 0, bArrM10123.length);
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final int mo1280(int i) {
        return C3102.m10120(this.f60970) + i + 1;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1283(AbstractC14294 abstractC14294) {
        long j = this.f60970;
        long j2 = ((C18770) abstractC14294).f60970;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ܽ */
    public final EnumC6837 mo1282() {
        return EnumC6837.VALUE_LONG;
    }

    public final int hashCode() {
        return (int) this.f60970;
    }
}
