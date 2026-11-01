package l;

import android.text.GetChars;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z96R */
/* JADX INFO: loaded from: classes4.dex */
public final class C14795 implements Appendable, CharSequence, GetChars {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f48383;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public char[] f48384;

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) {
        append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    public C14795() {
        this(16);
    }

    public C14795(int i) {
        this.f48384 = new char[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f48383;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m35459(int i) {
        char[] cArr = this.f48384;
        if (i - cArr.length > 0) {
            int length = (cArr.length << 1) + 2;
            if (length - i < 0) {
                length = i;
            }
            if (length > 0 && 2147483639 - length >= 0) {
                i = length;
            } else {
                if (Integer.MAX_VALUE - i < 0) {
                    throw new OutOfMemoryError();
                }
                if (i <= 2147483639) {
                    i = 2147483639;
                }
            }
            this.f48384 = Arrays.copyOf(cArr, i);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35465(int i) {
        m35459(i);
        int i2 = this.f48383;
        if (i2 < i) {
            Arrays.fill(this.f48384, i2, i, (char) 0);
        }
        this.f48383 = i;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f48384[i];
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (i2 < 0 || i2 > this.f48383) {
            throw new StringIndexOutOfBoundsException(i2);
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException("srcBegin > srcEnd");
        }
        System.arraycopy(this.f48384, i, cArr, i3, i2 - i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35466(String str) {
        if (str == null) {
            m35460();
            return;
        }
        int length = str.length();
        m35459(this.f48383 + length);
        str.getChars(0, length, this.f48384, this.f48383);
        this.f48383 += length;
    }

    @Override // java.lang.Appendable
    public final C14795 append(CharSequence charSequence) {
        if (charSequence == null) {
            m35460();
            return this;
        }
        if (charSequence instanceof String) {
            m35466((String) charSequence);
            return this;
        }
        if (charSequence instanceof C14795) {
            return append(charSequence);
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m35460() {
        int i = this.f48383;
        int i2 = i + 4;
        m35459(i2);
        char[] cArr = this.f48384;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.f48383 = i2;
    }

    @Override // java.lang.Appendable
    public final void append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        int i3 = i2 - i;
        m35459(this.f48383 + i3);
        int i4 = this.f48383;
        while (i < i2) {
            this.f48384[i4] = charSequence.charAt(i);
            i++;
            i4++;
        }
        this.f48383 += i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35463(char[] cArr) {
        int length = cArr.length;
        m35459(this.f48383 + length);
        System.arraycopy(cArr, 0, this.f48384, this.f48383, length);
        this.f48383 += length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35464(char[] cArr, int i, int i2) {
        if (i2 > 0) {
            m35459(this.f48383 + i2);
        }
        System.arraycopy(cArr, i, this.f48384, this.f48383, i2);
        this.f48383 += i2;
    }

    @Override // java.lang.Appendable
    public final void append(char c) {
        m35459(this.f48383 + 1);
        char[] cArr = this.f48384;
        int i = this.f48383;
        this.f48383 = i + 1;
        cArr[i] = c;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return m35461(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m35461(int i, int i2) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (i2 > this.f48383) {
            throw new StringIndexOutOfBoundsException(i2);
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException(i2 - i);
        }
        return new String(this.f48384, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f48384, 0, this.f48383);
    }

    public final char[] getValue() {
        return this.f48384;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35462() {
        this.f48384 = new char[16];
        this.f48383 = 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14795) {
            C14795 c14795 = (C14795) obj;
            int i = this.f48383;
            if (i != c14795.f48383) {
                return false;
            }
            char[] cArr = this.f48384;
            char[] cArr2 = c14795.f48384;
            for (int i2 = 0; i2 < i; i2++) {
                if (cArr[i2] != cArr2[i2]) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof CharSequence) {
            return TextUtils.equals(this, (CharSequence) obj);
        }
        return false;
    }

    public final int hashCode() {
        char[] cArr = this.f48384;
        int i = this.f48383;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + cArr[i3];
        }
        return i2;
    }
}
