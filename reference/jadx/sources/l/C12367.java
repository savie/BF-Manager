package l;

import android.text.TextUtils;
import android.util.TypedValue;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBKJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12367 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f39722;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final XmlResourceParserC9734 f39723;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TypedValue f39724 = new TypedValue();

    public C12367(XmlResourceParserC9734 xmlResourceParserC9734, int i) {
        this.f39723 = xmlResourceParserC9734;
        this.f39722 = new int[i * 2];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m30853(int i) {
        return this.f39722[i * 2];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m30849(int i) {
        int i2 = i * 2;
        int[] iArr = this.f39722;
        int i3 = iArr[i2];
        if (i3 == 0) {
            return null;
        }
        if (i3 == 3) {
            return this.f39723.m25342(iArr[i2 + 1]).toString();
        }
        TypedValue typedValue = this.f39724;
        if (!m30846(i2, typedValue)) {
            throw new RuntimeException(C4791.m14766(new StringBuilder("getString of bad type: 0x"), i3));
        }
        CharSequence charSequenceCoerceToString = typedValue.coerceToString();
        if (charSequenceCoerceToString != null) {
            return charSequenceCoerceToString.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30851(boolean z) {
        int[] iArr = this.f39722;
        int i = iArr[10];
        if (i != 0) {
            if (i >= 16 && i <= 31) {
                return iArr[11] != 0;
            }
            TypedValue typedValue = this.f39724;
            if (!m30846(10, typedValue)) {
                throw new RuntimeException(C4791.m14766(new StringBuilder("getBoolean of bad type: 0x"), i));
            }
            CharSequence charSequenceCoerceToString = typedValue.coerceToString();
            if (!TextUtils.isEmpty(charSequenceCoerceToString)) {
                return charSequenceCoerceToString.equals("1") || charSequenceCoerceToString.equals("true") || charSequenceCoerceToString.equals("TRUE");
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30848(int i, int i2) {
        int i3 = i * 2;
        int[] iArr = this.f39722;
        int i4 = iArr[i3];
        if (i4 == 0) {
            return i2;
        }
        if (i4 >= 16 && i4 <= 31) {
            return iArr[i3 + 1];
        }
        TypedValue typedValue = this.f39724;
        if (m30846(i3, typedValue)) {
            return m30845(i2, typedValue.coerceToString());
        }
        throw new RuntimeException(C4791.m14766(new StringBuilder("getInt of bad type: 0x"), i4));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30845(int i, CharSequence charSequence) {
        int i2;
        int i3;
        if (TextUtils.isEmpty(charSequence)) {
            return i;
        }
        String string = charSequence.toString();
        int length = string.length();
        if ('-' == string.charAt(0)) {
            i2 = -1;
            i3 = 1;
        } else {
            i2 = 1;
            i3 = 0;
        }
        int i4 = 16;
        if ('0' == string.charAt(i3)) {
            if (i3 == length - 1) {
                return 0;
            }
            int i5 = i3 + 1;
            char cCharAt = string.charAt(i5);
            if ('x' == cCharAt || 'X' == cCharAt) {
                i3 += 2;
            } else {
                i4 = 8;
                i3 = i5;
            }
        } else if ('#' == string.charAt(i3)) {
            i3++;
        } else {
            i4 = 10;
        }
        return Integer.parseInt(string.substring(i3), i4) * i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m30852(float f, int i) {
        CharSequence charSequenceCoerceToString;
        int i2 = i * 2;
        int[] iArr = this.f39722;
        int i3 = iArr[i2];
        if (i3 == 0) {
            return f;
        }
        if (i3 == 4) {
            return Float.intBitsToFloat(iArr[i2 + 1]);
        }
        if (i3 >= 16 && i3 <= 31) {
            return iArr[i2 + 1];
        }
        TypedValue typedValue = this.f39724;
        if (!m30846(i2, typedValue) || (charSequenceCoerceToString = typedValue.coerceToString()) == null) {
            throw new RuntimeException(C4791.m14766(new StringBuilder("getFloat of bad type: 0x"), i3));
        }
        return Float.parseFloat(charSequenceCoerceToString.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m30847(float f, int i) {
        int i2 = i * 2;
        int[] iArr = this.f39722;
        int i3 = iArr[i2];
        if (i3 == 0) {
            return f;
        }
        if (i3 == 5) {
            return TypedValue.complexToDimension(iArr[i2 + 1], C21576.m49055().getDisplayMetrics());
        }
        if (i3 != 2) {
            throw new UnsupportedOperationException(C4791.m14766(C3769.m12235(i, "Can't convert value at index ", " to dimension: type=0x"), i3));
        }
        TypedValue typedValue = this.f39724;
        m30846(i2, typedValue);
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30850(int i, TypedValue typedValue) {
        m30846(i * 2, typedValue);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m30846(int i, TypedValue typedValue) {
        int[] iArr = this.f39722;
        int i2 = iArr[i];
        if (i2 == 0) {
            return false;
        }
        typedValue.type = i2;
        int i3 = iArr[i + 1];
        typedValue.data = i3;
        typedValue.string = i2 == 3 ? this.f39723.m25342(i3) : null;
        return true;
    }

    public final String toString() {
        return Arrays.toString(this.f39722);
    }
}
