package l;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10481 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean[] f33353;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f33354;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f33355;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final char[] f33356;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f33357;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f33358;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f33359;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f33360;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f33361;

    public C10481(String str, char[] cArr, byte[] bArr, boolean z) {
        str.getClass();
        this.f33355 = str;
        cArr.getClass();
        this.f33356 = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iM52902 = C23666.m52902(length);
            this.f33354 = iM52902;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iM52902);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.f33361 = i;
            this.f33360 = iM52902 >> iNumberOfTrailingZeros;
            this.f33357 = cArr.length - 1;
            this.f33359 = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f33360; i2++) {
                int i3 = this.f33354;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[C23666.m52903(i2 * 8, i3)] = true;
            }
            this.f33353 = zArr;
            this.f33358 = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C10481(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (!(c < 128)) {
                throw new IllegalArgumentException(C8399.m22571("Non-ASCII character: %s", Character.valueOf(c)));
            }
            if (!(bArr[c] == -1)) {
                throw new IllegalArgumentException(C8399.m22571("Duplicate character: %s", Character.valueOf(c)));
            }
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m26922(int i) {
        return this.f33356[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m26926(int i) {
        return this.f33353[i % this.f33361];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26923(char c) throws C3024 {
        if (c > 127) {
            throw new C3024(C4791.m14766(new StringBuilder("Unrecognized character: 0x"), c));
        }
        byte b = this.f33359[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new C3024(C4791.m14766(new StringBuilder("Unrecognized character: 0x"), c));
        }
        throw new C3024("Unrecognized character: " + c);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10481 m26924() {
        boolean z;
        char[] cArr = this.f33356;
        for (char c : cArr) {
            if (C7914.m21454(c)) {
                int length = cArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    char c2 = cArr[i];
                    if (c2 >= 'a' && c2 <= 'z') {
                        z = true;
                        break;
                    }
                    i++;
                }
                C12128.m30314("Cannot call lowerCase() on a mixed-case alphabet", !z);
                char[] cArr2 = new char[cArr.length];
                for (int i2 = 0; i2 < cArr.length; i2++) {
                    char c3 = cArr[i2];
                    if (C7914.m21454(c3)) {
                        c3 = (char) (c3 ^ ' ');
                    }
                    cArr2[i2] = c3;
                }
                C10481 c10481 = new C10481(C8947.m23910(new StringBuilder(), this.f33355, ".lowerCase()"), cArr2);
                if (!this.f33358 || c10481.f33358) {
                    return c10481;
                }
                byte[] bArr = c10481.f33359;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i3 = 65; i3 <= 90; i3++) {
                    int i4 = i3 | 32;
                    byte b = bArr[i3];
                    byte b2 = bArr[i4];
                    if (b == -1) {
                        bArrCopyOf[i3] = b2;
                    } else {
                        char c4 = (char) i3;
                        char c5 = (char) i4;
                        if (!(b2 == -1)) {
                            throw new IllegalStateException(C8399.m22571("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                        }
                        bArrCopyOf[i4] = b;
                    }
                }
                return new C10481(C8947.m23910(new StringBuilder(), c10481.f33355, ".ignoreCase()"), c10481.f33356, bArrCopyOf, true);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m26925(char c) {
        byte[] bArr = this.f33359;
        return c < bArr.length && bArr[c] != -1;
    }

    public final String toString() {
        return this.f33355;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10481)) {
            return false;
        }
        C10481 c10481 = (C10481) obj;
        return this.f33358 == c10481.f33358 && Arrays.equals(this.f33356, c10481.f33356);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f33356) + (this.f33358 ? 1231 : 1237);
    }
}
