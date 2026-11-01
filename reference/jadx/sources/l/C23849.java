package l;

import java.math.BigInteger;
import java.text.Collator;

/* JADX INFO: renamed from: l.᩻ܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes.dex */
public final class C23849 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f77097;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f77098;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Collator f77099;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public BigInteger f77100;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f77101;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f77102;

    public C23849(Collator collator, String str, boolean z) {
        this.f77099 = collator;
        if (str.isEmpty() || str.charAt(0) < 128) {
            this.f77097 = 0;
        } else {
            this.f77097 = 1;
        }
        this.f77102 = z;
        if (z) {
            try {
                this.f77100 = new BigInteger(str);
            } catch (NumberFormatException unused) {
                this.f77100 = BigInteger.ZERO;
            }
        }
        this.f77098 = str;
        this.f77101 = str.toLowerCase();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C23849 c23849) {
        int iCompare;
        int iCompareTo;
        int i = c23849.f77097;
        int i2 = this.f77097;
        if (i2 != i) {
            return i2 - i;
        }
        if (this.f77102 && c23849.f77102 && (iCompareTo = this.f77100.compareTo(c23849.f77100)) != 0) {
            return iCompareTo;
        }
        String str = c23849.f77101;
        int i3 = C3386.f12507;
        String str2 = this.f77101;
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
                    iCompare = this.f77099.compare(String.valueOf(cCharAt), String.valueOf(cCharAt2));
                    if (iCompare != 0) {
                    }
                }
                if (iCompare != 0) {
                    return iCompare;
                }
                return this.f77098.compareTo(c23849.f77098);
            }
        }
        iCompare = Integer.compare(length, length2);
        if (iCompare != 0) {
            return iCompare;
        }
        return this.f77098.compareTo(c23849.f77098);
    }

    public final String toString() {
        return this.f77101;
    }
}
