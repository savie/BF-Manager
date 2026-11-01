package l;

/* JADX INFO: renamed from: l.ۗ֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1RW */
/* JADX INFO: loaded from: classes3.dex */
public final class C2903 extends AbstractC1492 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13839 f10944;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f10945;

    public C2903(C13839 c13839) {
        byte[] bArr = new byte[1];
        this.f10945 = bArr;
        if (c13839.m33669() == 0) {
            bArr[0] = 0;
        } else {
            bArr[0] = (byte) (AbstractC21330.m47845(Math.max(c13839.m33666(), 4096) - 1) - 23);
        }
        this.f10944 = (C13839) c13839.clone();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] m8711() {
        return this.f10945;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23366 m8710(AbstractC23366 abstractC23366, C17720 c17720) {
        return this.f10944.m33663(abstractC23366, c17720);
    }
}
