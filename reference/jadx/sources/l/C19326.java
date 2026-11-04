package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.ᩳ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S9AL */
/* JADX INFO: loaded from: classes5.dex */
public final class C19326 implements CharSequence, GetChars {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f62427;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char[] f62426 = new char[16];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f62428 = 16;

    @Override // java.lang.CharSequence
    public final int length() {
        return (this.f62426.length - this.f62428) + this.f62427;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException();
        }
        char[] cArr = this.f62426;
        int i2 = this.f62427;
        if (i >= i2) {
            i = (i + this.f62428) - i2;
        }
        return cArr[i];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i2 < i || i2 > length()) {
            throw new IndexOutOfBoundsException();
        }
        char[] cArr = new char[i2 - i];
        getChars(i, i2, cArr, 0);
        return new String(cArr);
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        if (i < 0 || i2 < i || i2 > length() || i3 < 0 || i2 - i > cArr.length - i3) {
            throw new IndexOutOfBoundsException();
        }
        int iMin = Math.min(i2, this.f62427);
        if (i < iMin) {
            int i4 = iMin - i;
            System.arraycopy(this.f62426, i, cArr, i3, i4);
            i3 += i4;
            i = iMin;
        }
        if (i < i2) {
            System.arraycopy(this.f62426, (this.f62428 + i) - this.f62427, cArr, i3, i2 - i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44704(int i, int i2, int i3, CharSequence charSequence) {
        if (i < 0 || i > length() || i2 < 0 || i3 < i2 || i3 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = i3 - i2;
        if (i4 == 0) {
            return;
        }
        if (i4 <= this.f62428 - this.f62427) {
            m44703(i);
        } else {
            int length = length();
            long j = ((long) length) + ((long) i4);
            if (j > 2147483639) {
                throw new OutOfMemoryError("Required array length is too large");
            }
            int iMin = (int) Math.min(2147483639L, Math.max(j, ((long) this.f62426.length) * 2));
            char[] cArr = new char[iMin];
            int i5 = iMin - (length - i);
            getChars(0, i, cArr, 0);
            getChars(i, length, cArr, i5);
            this.f62426 = cArr;
            this.f62427 = i;
            this.f62428 = i5;
        }
        if (charSequence instanceof GetChars) {
            ((GetChars) charSequence).getChars(i2, i3, this.f62426, this.f62427);
        } else if (charSequence instanceof String) {
            ((String) charSequence).getChars(i2, i3, this.f62426, this.f62427);
        } else if (charSequence instanceof StringBuilder) {
            ((StringBuilder) charSequence).getChars(i2, i3, this.f62426, this.f62427);
        } else if (charSequence instanceof StringBuffer) {
            ((StringBuffer) charSequence).getChars(i2, i3, this.f62426, this.f62427);
        } else {
            for (int i6 = 0; i6 < i4; i6++) {
                this.f62426[this.f62427 + i6] = charSequence.charAt(i2 + i6);
            }
        }
        this.f62427 += i4;
    }

    public final void delete(int i, int i2) {
        if (i < 0 || i2 < i || i2 > length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == i2) {
            return;
        }
        m44703(i);
        this.f62428 = (i2 - i) + this.f62428;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m44703(int i) {
        int i2 = this.f62427;
        if (i < i2) {
            int i3 = i2 - i;
            char[] cArr = this.f62426;
            System.arraycopy(cArr, i, cArr, this.f62428 - i3, i3);
            this.f62428 -= i3;
        } else if (i > i2) {
            int i4 = i - i2;
            char[] cArr2 = this.f62426;
            System.arraycopy(cArr2, this.f62428, cArr2, i2, i4);
            this.f62428 += i4;
        }
        this.f62427 = i;
    }

    public final void clear() {
        this.f62427 = 0;
        this.f62428 = this.f62426.length;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        m44703(length());
        return new String(this.f62426, 0, this.f62427);
    }
}
