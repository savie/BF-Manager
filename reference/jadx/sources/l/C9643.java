package l;

import java.math.BigInteger;
import java.text.Collator;

/* JADX INFO: renamed from: l.ۡ᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9643 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public BigInteger f31169;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f31170;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Collator f31171;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f31172;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f31173;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f31174;

    public C9643(Collator collator, String str, boolean z) {
        this.f31171 = collator;
        if (str.isEmpty() || str.charAt(0) < 128) {
            this.f31172 = 0;
        } else {
            this.f31172 = 1;
        }
        this.f31174 = z;
        if (z) {
            try {
                this.f31169 = new BigInteger(str);
            } catch (NumberFormatException unused) {
                this.f31169 = BigInteger.ZERO;
            }
        }
        this.f31170 = str;
        this.f31173 = str.toLowerCase();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C9643 c9643) {
        int iCompare;
        int iCompareTo;
        int i = c9643.f31172;
        int i2 = this.f31172;
        if (i2 != i) {
            return i2 - i;
        }
        if (this.f31174 && c9643.f31174 && (iCompareTo = this.f31169.compareTo(c9643.f31169)) != 0) {
            return iCompareTo;
        }
        String str = c9643.f31173;
        int i3 = C14118.f44640;
        String str2 = this.f31173;
        int length = str2.length();
        int length2 = str.length();
        int iMin = Math.min(str2.length(), length2);
        for (int i4 = 0; i4 < iMin; i4++) {
            char cCharAt = str2.charAt(i4);
            char cCharAt2 = str.charAt(i4);
            if (cCharAt != cCharAt2) {
                iCompare = 1;
                boolean z = cCharAt <= 127;
                boolean z2 = cCharAt2 <= 127;
                if (z && z2) {
                    iCompare = cCharAt - cCharAt2;
                } else if (z) {
                    iCompare = -1;
                } else if (!z2) {
                    iCompare = this.f31171.compare(String.valueOf(cCharAt), String.valueOf(cCharAt2));
                    if (iCompare != 0) {
                    }
                }
                if (iCompare != 0) {
                    return iCompare;
                }
                return this.f31170.compareTo(c9643.f31170);
            }
        }
        iCompare = Integer.compare(length, length2);
        if (iCompare != 0) {
            return iCompare;
        }
        return this.f31170.compareTo(c9643.f31170);
    }

    public final String toString() {
        return this.f31173;
    }
}
