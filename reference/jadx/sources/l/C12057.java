package l;

/* JADX INFO: renamed from: l.ۨۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65W0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12057 extends AbstractC14294 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte f38840;

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final int mo1280(int i) {
        return i + 2;
    }

    public C12057(C4028 c4028) {
        this.f38840 = (byte) C3102.m10121(c4028.m13001(1));
    }

    public C12057(byte b) {
        this.f38840 = b;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ */
    public final void mo1281(C24166 c24166) {
        c24166.m54138(EnumC6837.VALUE_BYTE.f22727);
        c24166.m54138(this.f38840);
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1283(AbstractC14294 abstractC14294) {
        byte b = ((C12057) abstractC14294).f38840;
        byte b2 = this.f38840;
        if (b2 < b) {
            return -1;
        }
        return b2 > b ? 1 : 0;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ܽ */
    public final EnumC6837 mo1282() {
        return EnumC6837.VALUE_BYTE;
    }

    public final int hashCode() {
        return this.f38840;
    }
}
