package l;

/* JADX INFO: renamed from: l.ۚۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I73O */
/* JADX INFO: loaded from: classes2.dex */
public final class C5342 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f18773;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f18774;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f18775 = new byte[96];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f18776;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f18777;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f18771 = m15997("#EXT-X-TARGETDURATION");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final byte[] f18770 = m15997("#EXT-X-MEDIA-SEQUENCE");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final byte[] f18772 = m15997("#EXTINF");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f18767 = m15997("#EXT-X-KEY");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f18769 = m15997("#EXT-X-BYTERANGE");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final byte[] f18768 = m15997("#EXT-X-DISCONTINUITY");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final byte[] f18766 = m15997("#EXT-X-DISCONTINUITY-SEQUENCE");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f18765 = m15997("#EXT-X-ENDLIST");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16000(int i, int i2, byte[] bArr) {
        if (this.f18773) {
            throw new IllegalStateException("HLS playlist classifier is already finished");
        }
        int i3 = i2 + i;
        while (i < i3) {
            byte b = bArr[i];
            if (b == 10) {
                m15998();
            } else if (b != 13) {
                int i4 = this.f18777;
                byte[] bArr2 = this.f18775;
                if (i4 < bArr2.length) {
                    this.f18777 = i4 + 1;
                    bArr2[i4] = b;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC1613 m15999() {
        if (!this.f18773) {
            m15998();
            this.f18773 = true;
        }
        if (this.f18774) {
            return this.f18776 ? EnumC1613.VOD : EnumC1613.LIVE;
        }
        return EnumC1613.UNKNOWN;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m15998() {
        byte[] bArr;
        byte b;
        int i = this.f18777;
        int i2 = 0;
        while (true) {
            bArr = this.f18775;
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
        if (m15996(false, i2, i, f18765)) {
            this.f18776 = true;
            this.f18774 = true;
        } else if (m15996(true, i2, i, f18771) || m15996(true, i2, i, f18770) || m15996(true, i2, i, f18772) || m15996(true, i2, i, f18767) || m15996(true, i2, i, f18769) || m15996(false, i2, i, f18768) || m15996(false, i2, i, f18766)) {
            this.f18774 = true;
        }
        this.f18777 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m15996(boolean z, int i, int i2, byte[] bArr) {
        int i3 = i2 - i;
        if (i3 >= bArr.length && (z || i3 == bArr.length)) {
            for (int i4 = 0; i4 < bArr.length; i4++) {
                if (this.f18775[i + i4] == bArr[i4]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m15997(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }
}
