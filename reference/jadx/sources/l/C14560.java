package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.ܰۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97MC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14560 implements CharSequence, GetChars, Comparable {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C14560 f45873 = new C14560("");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final char[] f45874;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f45875 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f45876;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f45877;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C14560 c14560 = (C14560) obj;
        int i = c14560.f45877;
        int i2 = this.f45877;
        int iMin = Math.min(i2, i);
        for (int i3 = 0; i3 < iMin; i3++) {
            char c = this.f45874[this.f45876 + i3];
            char c2 = c14560.f45874[c14560.f45876 + i3];
            if (c != c2) {
                return c - c2;
            }
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C14560 m35113(String str) {
        if (str == null) {
            throw new NullPointerException("String cannot be null");
        }
        if (str.length() == 0) {
            return f45873;
        }
        return new C14560(str.toString());
    }

    public C14560(String str) {
        if (str == null) {
            throw new NullPointerException("String cannot be null");
        }
        char[] charArray = str.toCharArray();
        this.f45874 = charArray;
        this.f45876 = 0;
        this.f45877 = charArray.length;
    }

    public C14560(char[] cArr, int i, int i2) {
        this.f45874 = cArr;
        this.f45876 = i;
        this.f45877 = i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f45877;
    }

    public final boolean isEmpty() {
        return this.f45877 == 0;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f45877;
        if (i < 0 || i >= i2) {
            throw new StringIndexOutOfBoundsException(C6934.m19217("Index: ", i, i2, ", Length: "));
        }
        return this.f45874[this.f45876 + i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14560 m35116(int i) {
        return m35115(i, this.f45877);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14560 m35115(int i, int i2) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(C13645.m33382(i, "Begin index: "));
        }
        if (i2 > this.f45877) {
            throw new StringIndexOutOfBoundsException(C13645.m33382(i2, "End index: "));
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException(C6934.m19217("Begin index: ", i, i2, " > End index: "));
        }
        int i3 = i2 - i;
        if (i3 == 0) {
            return f45873;
        }
        return new C14560(this.f45874, this.f45876 + i, i3);
    }

    public final int indexOf(int i) {
        if (i < 0) {
            i = 0;
        }
        while (i < this.f45877) {
            if (this.f45874[this.f45876 + i] == '/') {
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
        if (!(obj instanceof C14560)) {
            return false;
        }
        C14560 c14560 = (C14560) obj;
        int i = c14560.f45877;
        int i2 = this.f45877;
        if (i2 != i) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f45874[this.f45876 + i3] != c14560.f45874[c14560.f45876 + i3]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35114(CharSequence charSequence) {
        if (charSequence != null) {
            int length = charSequence.length();
            int i = this.f45877;
            if (length == i) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (this.f45874[this.f45876 + i2] != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f45875 == -1) {
            int i = 0;
            for (int i2 = 0; i2 < this.f45877; i2++) {
                i = (i * 31) + this.f45874[this.f45876 + i2];
            }
            this.f45875 = i;
        }
        return this.f45875;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        if (cArr == null) {
            throw new NullPointerException("Destination array cannot be null");
        }
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(C13645.m33382(i, "srcBegin: "));
        }
        if (i2 > this.f45877) {
            throw new StringIndexOutOfBoundsException(C13645.m33382(i2, "srcEnd: "));
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException(C6934.m19217("srcBegin: ", i, i2, " > srcEnd: "));
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(C13645.m33382(i3, "dstBegin: "));
        }
        int i4 = i2 - i;
        int i5 = i3 + i4;
        if (i5 <= cArr.length) {
            System.arraycopy(this.f45874, this.f45876 + i, cArr, i3, i4);
        } else {
            StringBuilder sbM12235 = C3769.m12235(i5, "dstBegin + copyLength: ", " > dst.length: ");
            sbM12235.append(cArr.length);
            throw new ArrayIndexOutOfBoundsException(sbM12235.toString());
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return m35115(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f45874, this.f45876, this.f45877);
    }
}
