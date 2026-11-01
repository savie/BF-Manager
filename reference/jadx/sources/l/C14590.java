package l;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14590 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f47741;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f47742;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean[] f47743;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f47744;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] f47745;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final char[] f47746;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f47747;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f47748;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f47749;

    public C14590(String str, char[] cArr, byte[] bArr, boolean z) {
        str.getClass();
        this.f47747 = str;
        cArr.getClass();
        this.f47746 = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iM22348 = C8573.m22348(length);
            this.f47744 = iM22348;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iM22348);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.f47742 = i;
            this.f47748 = iM22348 >> iNumberOfTrailingZeros;
            this.f47741 = cArr.length - 1;
            this.f47745 = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f47748; i2++) {
                int i3 = this.f47744;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[C8573.m22349(i2 * 8, i3)] = true;
            }
            this.f47743 = zArr;
            this.f47749 = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C14590(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (!(c < 128)) {
                throw new IllegalArgumentException(C11249.m28221("Non-ASCII character: %s", Character.valueOf(c)));
            }
            if (!(bArr[c] == -1)) {
                throw new IllegalArgumentException(C11249.m28221("Duplicate character: %s", Character.valueOf(c)));
            }
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m35059(int i) {
        return this.f47746[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m35063(int i) {
        return this.f47743[i % this.f47742];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35060(char c) throws C3299 {
        if (c > 127) {
            throw new C3299(C9576.m24440(new StringBuilder("Unrecognized character: 0x"), c));
        }
        byte b = this.f47745[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new C3299(C9576.m24440(new StringBuilder("Unrecognized character: 0x"), c));
        }
        throw new C3299("Unrecognized character: " + c);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14590 m35061() {
        boolean z;
        char[] cArr = this.f47746;
        for (char c : cArr) {
            if (C20733.m46673(c)) {
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
                C18304.m42522("Cannot call lowerCase() on a mixed-case alphabet", !z);
                char[] cArr2 = new char[cArr.length];
                for (int i2 = 0; i2 < cArr.length; i2++) {
                    char c3 = cArr[i2];
                    if (C20733.m46673(c3)) {
                        c3 = (char) (c3 ^ ' ');
                    }
                    cArr2[i2] = c3;
                }
                C14590 c14590 = new C14590(C22697.m50267(new StringBuilder(), this.f47747, ".lowerCase()"), cArr2);
                if (!this.f47749 || c14590.f47749) {
                    return c14590;
                }
                byte[] bArr = c14590.f47745;
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
                            throw new IllegalStateException(C11249.m28221("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                        }
                        bArrCopyOf[i4] = b;
                    }
                }
                return new C14590(C22697.m50267(new StringBuilder(), c14590.f47747, ".ignoreCase()"), c14590.f47746, bArrCopyOf, true);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m35062(char c) {
        byte[] bArr = this.f47745;
        return c < bArr.length && bArr[c] != -1;
    }

    public final String toString() {
        return this.f47747;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14590)) {
            return false;
        }
        C14590 c14590 = (C14590) obj;
        return this.f47749 == c14590.f47749 && Arrays.equals(this.f47746, c14590.f47746);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f47746) + (this.f47749 ? 1231 : 1237);
    }
}
