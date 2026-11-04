package l;

import java.io.Reader;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۤۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2YE */
/* JADX INFO: loaded from: classes3.dex */
public final class C10849 extends Reader implements Serializable {
    public static final long serialVersionUID = 3724187752191401220L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f34353;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CharSequence f34354;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f34355;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Integer f34356;

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    public C10849(String str) {
        this.f34354 = str == null ? "" : str;
        this.f34356 = Integer.MAX_VALUE;
        this.f34355 = 0;
        this.f34353 = 0;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34355 = 0;
        this.f34353 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m27577() {
        int length = this.f34354.length();
        Integer num = this.f34356;
        return Math.min(length, num == null ? Integer.MAX_VALUE : num.intValue());
    }

    @Override // java.io.Reader
    public final void mark(int i) {
        this.f34353 = this.f34355;
    }

    @Override // java.io.Reader
    public final int read() {
        if (this.f34355 >= m27577()) {
            return -1;
        }
        int i = this.f34355;
        this.f34355 = i + 1;
        return this.f34354.charAt(i);
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        C5125.m15499(cArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        if (this.f34355 >= m27577()) {
            return -1;
        }
        CharSequence charSequence = this.f34354;
        if (charSequence instanceof String) {
            int iMin = Math.min(i2, m27577() - this.f34355);
            int i3 = this.f34355;
            ((String) charSequence).getChars(i3, i3 + iMin, cArr, i);
            this.f34355 += iMin;
            return iMin;
        }
        if (charSequence instanceof StringBuilder) {
            int iMin2 = Math.min(i2, m27577() - this.f34355);
            int i4 = this.f34355;
            ((StringBuilder) charSequence).getChars(i4, i4 + iMin2, cArr, i);
            this.f34355 += iMin2;
            return iMin2;
        }
        if (charSequence instanceof StringBuffer) {
            int iMin3 = Math.min(i2, m27577() - this.f34355);
            int i5 = this.f34355;
            ((StringBuffer) charSequence).getChars(i5, i5 + iMin3, cArr, i);
            this.f34355 += iMin3;
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
        return this.f34355 < m27577();
    }

    @Override // java.io.Reader
    public final void reset() {
        this.f34355 = this.f34353;
    }

    @Override // java.io.Reader
    public final long skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C24770.m55292(j, "Number of characters to skip is less than zero: "));
        }
        if (this.f34355 >= m27577()) {
            return 0L;
        }
        int iMin = (int) Math.min(m27577(), ((long) this.f34355) + j);
        int i = iMin - this.f34355;
        this.f34355 = iMin;
        return i;
    }

    public final String toString() {
        CharSequence charSequence = this.f34354;
        return charSequence.subSequence(Math.min(charSequence.length(), 0), m27577()).toString();
    }
}
