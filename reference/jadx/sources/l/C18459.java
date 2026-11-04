package l;

import android.text.GetChars;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z96R */
/* JADX INFO: loaded from: classes4.dex */
public final class C18459 implements Appendable, CharSequence, GetChars {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f60082;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public char[] f60083;

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

    public C18459() {
        this(16);
    }

    public C18459(int i) {
        this.f60083 = new char[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f60082;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m43005(int i) {
        char[] cArr = this.f60083;
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
            this.f60083 = Arrays.copyOf(cArr, i);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43009(int i) {
        m43005(i);
        int i2 = this.f60082;
        if (i2 < i) {
            Arrays.fill(this.f60083, i2, i, (char) 0);
        }
        this.f60082 = i;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f60083[i];
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (i2 < 0 || i2 > this.f60082) {
            throw new StringIndexOutOfBoundsException(i2);
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException("srcBegin > srcEnd");
        }
        System.arraycopy(this.f60083, i, cArr, i3, i2 - i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43010(String str) {
        if (str == null) {
            m43004();
            return;
        }
        int length = str.length();
        m43005(this.f60082 + length);
        str.getChars(0, length, this.f60083, this.f60082);
        this.f60082 += length;
    }

    @Override // java.lang.Appendable
    public final C18459 append(CharSequence charSequence) {
        if (charSequence == null) {
            m43004();
            return this;
        }
        if (charSequence instanceof String) {
            m43010((String) charSequence);
            return this;
        }
        if (charSequence instanceof C18459) {
            return append(charSequence);
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m43004() {
        int i = this.f60082;
        int i2 = i + 4;
        m43005(i2);
        char[] cArr = this.f60083;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.f60082 = i2;
    }

    @Override // java.lang.Appendable
    public final void append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        int i3 = i2 - i;
        m43005(this.f60082 + i3);
        int i4 = this.f60082;
        while (i < i2) {
            this.f60083[i4] = charSequence.charAt(i);
            i++;
            i4++;
        }
        this.f60082 += i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43007(char[] cArr) {
        int length = cArr.length;
        m43005(this.f60082 + length);
        System.arraycopy(cArr, 0, this.f60083, this.f60082, length);
        this.f60082 += length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43008(char[] cArr, int i, int i2) {
        if (i2 > 0) {
            m43005(this.f60082 + i2);
        }
        System.arraycopy(cArr, i, this.f60083, this.f60082, i2);
        this.f60082 += i2;
    }

    @Override // java.lang.Appendable
    public final void append(char c) {
        m43005(this.f60082 + 1);
        char[] cArr = this.f60083;
        int i = this.f60082;
        this.f60082 = i + 1;
        cArr[i] = c;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (i2 > this.f60082) {
            throw new StringIndexOutOfBoundsException(i2);
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException(i2 - i);
        }
        return new String(this.f60083, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f60083, 0, this.f60082);
    }

    public final char[] getValue() {
        return this.f60083;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43006() {
        this.f60083 = new char[16];
        this.f60082 = 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C18459) {
            C18459 c18459 = (C18459) obj;
            int i = this.f60082;
            if (i != c18459.f60082) {
                return false;
            }
            char[] cArr = this.f60083;
            char[] cArr2 = c18459.f60083;
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
        char[] cArr = this.f60083;
        int i = this.f60082;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + cArr[i3];
        }
        return i2;
    }
}
