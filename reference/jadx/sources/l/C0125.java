package l;

/* JADX INFO: renamed from: l.֡ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H55A */
/* JADX INFO: loaded from: classes3.dex */
public final class C0125 extends AbstractC14294 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float f1078;

    public C0125(C4028 c4028, byte b) {
        this.f1078 = Float.intBitsToFloat((int) ((C3102.m10109(c4028.m13001(b + 1)) >> 32) & 4294967295L));
    }

    public C0125(float f) {
        this.f1078 = f;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1281(C24166 c24166) {
        byte[] bArrM10115 = C3102.m10115(((long) Float.floatToRawIntBits(this.f1078)) << 32);
        c24166.m54138(EnumC6837.VALUE_FLOAT.f22727 | ((bArrM10115.length - 1) << 5));
        c24166.m54133(bArrM10115, 0, bArrM10115.length);
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo1280(int i) {
        return C3102.m10124(((long) Float.floatToRawIntBits(this.f1078)) << 32) + i + 1;
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo1283(AbstractC14294 abstractC14294) {
        return Float.compare(this.f1078, ((C0125) abstractC14294).f1078);
    }

    @Override // l.AbstractC14294
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC6837 mo1282() {
        return EnumC6837.VALUE_FLOAT;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1078);
    }
}
