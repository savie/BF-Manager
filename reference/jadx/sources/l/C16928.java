package l;

/* JADX INFO: renamed from: l.ܺܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9HU */
/* JADX INFO: loaded from: classes5.dex */
public final class C16928 extends AbstractC16182 {
    public final String toString() {
        return "big endian";
    }

    @Override // l.AbstractC16182
    /* JADX INFO: renamed from: ۙ */
    public final long mo38406(C25134 c25134) throws C2013 {
        c25134.getClass();
        byte[] bArr = new byte[8];
        c25134.m56024(8, bArr);
        long j = 0;
        for (int i = 0; i < 8; i++) {
            j = (j << 8) | ((long) (bArr[i] & 255));
        }
        return j;
    }

    @Override // l.AbstractC16182
    /* JADX INFO: renamed from: ۙ */
    public final void mo38409(C25134 c25134, String str) {
        byte[] bytes = str.getBytes(C22150.f71347);
        c25134.getClass();
        c25134.m56007(bytes.length, bytes);
    }

    @Override // l.AbstractC16182
    /* JADX INFO: renamed from: ᩷ */
    public final long mo38410(C25134 c25134) throws C2013 {
        byte[] bArr = new byte[4];
        c25134.m56024(4, bArr);
        return (((long) bArr[3]) & 255) | (((long) (bArr[0] << 24)) & 4278190080L) | (((long) (bArr[1] << 16)) & 16711680) | (((long) (bArr[2] << 8)) & 65280);
    }

    @Override // l.AbstractC16182
    /* JADX INFO: renamed from: ۙ */
    public final void mo38408(C25134 c25134, long j) {
        c25134.m56007(8, new byte[]{(byte) (j >> 56), (byte) (j >> 48), (byte) (j >> 40), (byte) (j >> 32), (byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) j});
    }
}
