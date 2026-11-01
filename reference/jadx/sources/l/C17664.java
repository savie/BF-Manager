package l;

import java.io.Reader;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܿ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B2YE */
/* JADX INFO: loaded from: classes4.dex */
public final class C17664 extends Reader implements Serializable {
    public static final long serialVersionUID = 3724187752191401220L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f56125;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final CharSequence f56126;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f56127;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Integer f56128;

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    public C17664(String str) {
        this.f56126 = str == null ? "" : str;
        this.f56128 = Integer.MAX_VALUE;
        this.f56125 = 0;
        this.f56127 = 0;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f56125 = 0;
        this.f56127 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m41144() {
        int length = this.f56126.length();
        Integer num = this.f56128;
        return Math.min(length, num == null ? Integer.MAX_VALUE : num.intValue());
    }

    @Override // java.io.Reader
    public final void mark(int i) {
        this.f56127 = this.f56125;
    }

    @Override // java.io.Reader
    public final int read() {
        if (this.f56125 >= m41144()) {
            return -1;
        }
        int i = this.f56125;
        this.f56125 = i + 1;
        return this.f56126.charAt(i);
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        if (this.f56125 >= m41144()) {
            return -1;
        }
        C13638.requireNonNull(cArr, "array");
        if (i2 < 0 || i < 0 || i + i2 > cArr.length) {
            StringBuilder sb = new StringBuilder("Array Size=");
            C23821.m52500(sb, cArr.length, ", offset=", i, ", length=");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        CharSequence charSequence = this.f56126;
        if (charSequence instanceof String) {
            int iMin = Math.min(i2, m41144() - this.f56125);
            int i3 = this.f56125;
            ((String) charSequence).getChars(i3, i3 + iMin, cArr, i);
            this.f56125 += iMin;
            return iMin;
        }
        if (charSequence instanceof StringBuilder) {
            int iMin2 = Math.min(i2, m41144() - this.f56125);
            int i4 = this.f56125;
            ((StringBuilder) charSequence).getChars(i4, i4 + iMin2, cArr, i);
            this.f56125 += iMin2;
            return iMin2;
        }
        if (charSequence instanceof StringBuffer) {
            int iMin3 = Math.min(i2, m41144() - this.f56125);
            int i5 = this.f56125;
            ((StringBuffer) charSequence).getChars(i5, i5 + iMin3, cArr, i);
            this.f56125 += iMin3;
            return iMin3;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = read();
            if (i8 == -1) {
                break;
            }
            cArr[i + i7] = (char) i8;
            i6++;
        }
        return i6;
    }

    @Override // java.io.Reader
    public final boolean ready() {
        return this.f56125 < m41144();
    }

    @Override // java.io.Reader
    public final void reset() {
        this.f56125 = this.f56127;
    }

    @Override // java.io.Reader
    public final long skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C15489.m37074(j, "Number of characters to skip is less than zero: "));
        }
        if (this.f56125 >= m41144()) {
            return 0L;
        }
        int iMin = (int) Math.min(m41144(), ((long) this.f56125) + j);
        int i = iMin - this.f56125;
        this.f56125 = iMin;
        return i;
    }

    public final String toString() {
        CharSequence charSequence = this.f56126;
        return charSequence.subSequence(Math.min(charSequence.length(), 0), m41144()).toString();
    }
}
