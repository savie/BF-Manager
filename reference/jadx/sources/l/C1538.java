package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.֫ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1MC */
/* JADX INFO: loaded from: classes2.dex */
public final class C1538 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CharSequence f6253;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f6254;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC8678 f6255;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f6256;

    public C1538(CharSequence charSequence, EnumC8678 enumC8678) {
        int iHashCode;
        int iM33169;
        this.f6253 = charSequence;
        this.f6255 = enumC8678;
        int i = C14240.f46653[enumC8678.ordinal()];
        if (i == 1) {
            if ((charSequence instanceof String) || (charSequence instanceof C5025)) {
                iHashCode = charSequence.hashCode();
            } else {
                iHashCode = C13571.m33169(0, charSequence.length(), charSequence);
            }
            iM33169 = iHashCode;
        } else if (i == 2) {
            int iM30312 = C12206.m30312(0, charSequence.length(), charSequence);
            iM33169 = C13571.m33169(iM30312, C12206.m30308(iM30312, charSequence.length(), charSequence), charSequence);
        } else if (i == 3) {
            int length = charSequence.length();
            iM33169 = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = charSequence.charAt(i2);
                if (!C13571.m33170(cCharAt)) {
                    iM33169 = (iM33169 * 31) + cCharAt;
                }
            }
        } else {
            throw new IllegalArgumentException(enumC8678.name());
        }
        this.f6254 = iM33169;
        int length2 = charSequence.length();
        int i3 = 0;
        for (int i4 = 0; i4 < length2; i4++) {
            if (!C13571.m33170(charSequence.charAt(i4))) {
                i3++;
            }
        }
        this.f6256 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m5312() {
        return this.f6253;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m5313() {
        return this.f6256;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1538.class != obj.getClass()) {
            return false;
        }
        C1538 c1538 = (C1538) obj;
        if (this.f6254 != c1538.f6254) {
            return false;
        }
        CharSequence charSequence = c1538.f6253;
        int[] iArr = C14240.f46653;
        EnumC8678 enumC8678 = this.f6255;
        int i = iArr[enumC8678.ordinal()];
        CharSequence charSequence2 = this.f6253;
        if (i == 1) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i == 2) {
            return C13571.m33179(charSequence2, charSequence);
        }
        if (i == 3) {
            return C13571.m33173(charSequence2, charSequence);
        }
        throw new IllegalArgumentException(enumC8678.toString());
    }

    public final int hashCode() {
        return this.f6254;
    }
}
