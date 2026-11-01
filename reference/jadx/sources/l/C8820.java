package l;

/* JADX INFO: renamed from: l.ۡۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: I73O */
/* JADX INFO: loaded from: classes3.dex */
public final class C8820 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f30331;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f30332;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] f30333 = new byte[96];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f30334;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f30335;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final byte[] f30328 = m22951("#EXT-X-TARGETDURATION");

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final byte[] f30327 = m22951("#EXT-X-MEDIA-SEQUENCE");

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final byte[] f30330 = m22951("#EXTINF");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final byte[] f30325 = m22951("#EXT-X-KEY");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final byte[] f30329 = m22951("#EXT-X-BYTERANGE");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final byte[] f30323 = m22951("#EXT-X-DISCONTINUITY");

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final byte[] f30326 = m22951("#EXT-X-DISCONTINUITY-SEQUENCE");

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final byte[] f30324 = m22951("#EXT-X-ENDLIST");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22954(int i, int i2, byte[] bArr) {
        if (this.f30332) {
            throw new IllegalStateException("HLS playlist classifier is already finished");
        }
        int i3 = i2 + i;
        while (i < i3) {
            byte b = bArr[i];
            if (b == 10) {
                m22952();
            } else if (b != 13) {
                int i4 = this.f30331;
                byte[] bArr2 = this.f30333;
                if (i4 < bArr2.length) {
                    this.f30331 = i4 + 1;
                    bArr2[i4] = b;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC10231 m22953() {
        if (!this.f30332) {
            m22952();
            this.f30332 = true;
        }
        if (this.f30334) {
            return this.f30335 ? EnumC10231.VOD : EnumC10231.LIVE;
        }
        return EnumC10231.UNKNOWN;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m22952() {
        byte[] bArr;
        byte b;
        int i = this.f30331;
        int i2 = 0;
        while (true) {
            bArr = this.f30333;
            if (i2 >= i || !((b = bArr[i2]) == 32 || b == 9 || b == 12)) {
                break;
            } else {
                i2++;
            }
        }
        while (i > i2) {
            byte b2 = bArr[i - 1];
            if (b2 != 32 && b2 != 9 && b2 != 12) {
                break;
            } else {
                i--;
            }
        }
        if (m22950(false, i2, i, f30324)) {
            this.f30335 = true;
            this.f30334 = true;
        } else if (m22950(true, i2, i, f30328) || m22950(true, i2, i, f30327) || m22950(true, i2, i, f30330) || m22950(true, i2, i, f30325) || m22950(true, i2, i, f30329) || m22950(false, i2, i, f30323) || m22950(false, i2, i, f30326)) {
            this.f30334 = true;
        }
        this.f30331 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m22950(boolean z, int i, int i2, byte[] bArr) {
        int i3 = i2 - i;
        if (i3 >= bArr.length && (z || i3 == bArr.length)) {
            for (int i4 = 0; i4 < bArr.length; i4++) {
                if (this.f30333[i + i4] == bArr[i4]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m22951(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }
}
