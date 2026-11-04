package l;

/* JADX INFO: renamed from: l.ۘܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E2GW */
/* JADX INFO: loaded from: classes3.dex */
public final class C4274 extends AbstractC19432 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final char[] f15529 = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean[] f15530;

    public C4274() {
        C12128.m30308("Alphanumeric characters are always 'safe' and should not be explicitly specified", !"-._~!$'()*,;&=@:+/".matches(".*[0-9A-Za-z].*"));
        char[] charArray = "-._~!$'()*,;&=@:+/".concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789").toCharArray();
        int iMax = -1;
        for (char c : charArray) {
            iMax = Math.max((int) c, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        this.f15530 = zArr;
    }

    @Override // l.AbstractC19432
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] mo13627(int i) {
        boolean[] zArr = this.f15530;
        if (i < zArr.length && zArr[i]) {
            return null;
        }
        char[] cArr = f15529;
        if (i <= 127) {
            return new char[]{'%', cArr[i >>> 4], cArr[i & 15]};
        }
        if (i <= 2047) {
            return new char[]{'%', cArr[(i >>> 10) | 12], cArr[(i >>> 6) & 15], '%', cArr[((i >>> 4) & 3) | 8], cArr[i & 15]};
        }
        if (i <= 65535) {
            return new char[]{'%', 'E', cArr[i >>> 12], '%', cArr[((i >>> 10) & 3) | 8], cArr[(i >>> 6) & 15], '%', cArr[((i >>> 4) & 3) | 8], cArr[i & 15]};
        }
        if (i <= 1114111) {
            return new char[]{'%', 'F', cArr[(i >>> 18) & 7], '%', cArr[((i >>> 16) & 3) | 8], cArr[(i >>> 12) & 15], '%', cArr[((i >>> 10) & 3) | 8], cArr[(i >>> 6) & 15], '%', cArr[((i >>> 4) & 3) | 8], cArr[i & 15]};
        }
        throw new IllegalArgumentException(C13645.m33382(i, "Invalid unicode character value "));
    }

    @Override // l.AbstractC19432
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo13625(int i, int i2, String str) {
        str.getClass();
        while (i < i2) {
            char cCharAt = str.charAt(i);
            boolean[] zArr = this.f15530;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m13626(String str) {
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            boolean[] zArr = this.f15530;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                return m44925(i, str);
            }
        }
        return str;
    }
}
