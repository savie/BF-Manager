package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.ܺ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 97MC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16277 implements CharSequence, GetChars, Comparable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C16277 f52439 = new C16277("");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f52440;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f52441 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final char[] f52442;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f52443;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C16277 c16277 = (C16277) obj;
        int i = c16277.f52443;
        int i2 = this.f52443;
        int iMin = Math.min(i2, i);
        for (int i3 = 0; i3 < iMin; i3++) {
            char c = this.f52442[this.f52440 + i3];
            char c2 = c16277.f52442[c16277.f52440 + i3];
            if (c != c2) {
                return c - c2;
            }
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C16277 m38433(String str) {
        if (str == null) {
            throw new NullPointerException("String cannot be null");
        }
        if (str.length() == 0) {
            return f52439;
        }
        return new C16277(str.toString());
    }

    public C16277(String str) {
        if (str == null) {
            throw new NullPointerException("String cannot be null");
        }
        char[] charArray = str.toCharArray();
        this.f52442 = charArray;
        this.f52440 = 0;
        this.f52443 = charArray.length;
    }

    public C16277(char[] cArr, int i, int i2) {
        this.f52442 = cArr;
        this.f52440 = i;
        this.f52443 = i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f52443;
    }

    public final boolean isEmpty() {
        return this.f52443 == 0;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f52443;
        if (i < 0 || i >= i2) {
            throw new StringIndexOutOfBoundsException(C2271.m6967("Index: ", i, i2, ", Length: "));
        }
        return this.f52442[this.f52440 + i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16277 m38436(int i) {
        return m38435(i, this.f52443);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16277 m38435(int i, int i2) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(C8479.m22141(i, "Begin index: "));
        }
        if (i2 > this.f52443) {
            throw new StringIndexOutOfBoundsException(C8479.m22141(i2, "End index: "));
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException(C2271.m6967("Begin index: ", i, i2, " > End index: "));
        }
        int i3 = i2 - i;
        if (i3 == 0) {
            return f52439;
        }
        return new C16277(this.f52442, this.f52440 + i, i3);
    }

    public final int indexOf(int i) {
        if (i < 0) {
            i = 0;
        }
        while (i < this.f52443) {
            if (this.f52442[this.f52440 + i] == '/') {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16277)) {
            return false;
        }
        C16277 c16277 = (C16277) obj;
        int i = c16277.f52443;
        int i2 = this.f52443;
        if (i2 != i) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f52442[this.f52440 + i3] != c16277.f52442[c16277.f52440 + i3]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38434(CharSequence charSequence) {
        if (charSequence != null) {
            int length = charSequence.length();
            int i = this.f52443;
            if (length == i) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (this.f52442[this.f52440 + i2] != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f52441 == -1) {
            int i = 0;
            for (int i2 = 0; i2 < this.f52443; i2++) {
                i = (i * 31) + this.f52442[this.f52440 + i2];
            }
            this.f52441 = i;
        }
        return this.f52441;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        if (cArr == null) {
            throw new NullPointerException("Destination array cannot be null");
        }
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(C8479.m22141(i, "srcBegin: "));
        }
        if (i2 > this.f52443) {
            throw new StringIndexOutOfBoundsException(C8479.m22141(i2, "srcEnd: "));
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException(C2271.m6967("srcBegin: ", i, i2, " > srcEnd: "));
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(C8479.m22141(i3, "dstBegin: "));
        }
        int i4 = i2 - i;
        int i5 = i3 + i4;
        if (i5 <= cArr.length) {
            System.arraycopy(this.f52442, this.f52440 + i, cArr, i3, i4);
        } else {
            StringBuilder sbM40153 = C17214.m40153(i5, "dstBegin + copyLength: ", " > dst.length: ");
            sbM40153.append(cArr.length);
            throw new ArrayIndexOutOfBoundsException(sbM40153.toString());
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return m38435(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f52442, this.f52440, this.f52443);
    }
}
