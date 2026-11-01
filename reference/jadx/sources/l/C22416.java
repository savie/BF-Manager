package l;

/* JADX INFO: renamed from: l.᩹ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H55A */
/* JADX INFO: loaded from: classes.dex */
public final class C22416 extends AbstractC11833 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final float f73146;

    public C22416(C13825 c13825, byte b) {
        this.f73146 = Float.intBitsToFloat((int) ((C12076.m30039(c13825.m33646(b + 1)) >> 32) & 4294967295L));
    }

    public C22416(float f) {
        this.f73146 = f;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public final void mo4463(C4651 c4651) {
        byte[] bArrM30045 = C12076.m30045(((long) Float.floatToRawIntBits(this.f73146)) << 32);
        c4651.m12841(EnumC18182.VALUE_FLOAT.f58128 | ((bArrM30045.length - 1) << 5));
        c4651.m12837(bArrM30045, 0, bArrM30045.length);
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public final int mo4462(int i) {
        return C12076.m30038(((long) Float.floatToRawIntBits(this.f73146)) << 32) + i + 1;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ܰ */
    public final int mo4464(AbstractC11833 abstractC11833) {
        return Float.compare(this.f73146, ((C22416) abstractC11833).f73146);
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ᩸ */
    public final EnumC18182 mo4465() {
        return EnumC18182.VALUE_FLOAT;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f73146);
    }
}
