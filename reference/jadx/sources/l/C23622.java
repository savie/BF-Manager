package l;

/* JADX INFO: renamed from: l.᩻ۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V9HU */
/* JADX INFO: loaded from: classes.dex */
public final class C23622 extends AbstractC1748 {
    public final String toString() {
        return "big endian";
    }

    @Override // l.AbstractC1748
    /* JADX INFO: renamed from: ۙ */
    public final long mo5790(C10922 c10922) throws C17271 {
        c10922.getClass();
        byte[] bArr = new byte[8];
        c10922.m27397(8, bArr);
        long j = 0;
        for (int i = 0; i < 8; i++) {
            j = (j << 8) | ((long) (bArr[i] & 255));
        }
        return j;
    }

    @Override // l.AbstractC1748
    /* JADX INFO: renamed from: ۙ */
    public final void mo5792(C10922 c10922, String str) {
        byte[] bytes = str.getBytes(C7393.f24573);
        c10922.getClass();
        c10922.m27383(bytes.length, bytes);
    }

    @Override // l.AbstractC1748
    /* JADX INFO: renamed from: ܰ */
    public final long mo5794(C10922 c10922) throws C17271 {
        byte[] bArr = new byte[4];
        c10922.m27397(4, bArr);
        return (((long) bArr[3]) & 255) | (((long) (bArr[0] << 24)) & 4278190080L) | (((long) (bArr[1] << 16)) & 16711680) | (((long) (bArr[2] << 8)) & 65280);
    }

    @Override // l.AbstractC1748
    /* JADX INFO: renamed from: ۙ */
    public final void mo5791(C10922 c10922, long j) {
        c10922.m27383(8, new byte[]{(byte) (j >> 56), (byte) (j >> 48), (byte) (j >> 40), (byte) (j >> 32), (byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) j});
    }
}
