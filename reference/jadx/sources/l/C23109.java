package l;

import java.io.Writer;

/* JADX INFO: renamed from: l.᩸᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes.dex */
public final class C23109 extends C0560 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public char f74914;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f74915 = 1048576;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f74916;

    @Override // l.C0560, java.io.Writer
    public final void write(int i) {
        m52014((char) i);
        super.write(i);
    }

    @Override // l.C0560, java.io.Writer
    public final void write(String str) {
        if (str != null) {
            m52015(0, str.length(), str);
            super.write(str);
        }
    }

    @Override // l.C0560, java.io.Writer
    public final void write(String str, int i, int i2) {
        if (str != null) {
            m52015(i, i + i2, str);
            super.write(str, i, i2);
        }
    }

    @Override // l.C0560, java.io.Writer
    public final void write(char[] cArr) {
        if (cArr != null) {
            for (char c : cArr) {
                m52014(c);
            }
            super.write(cArr);
        }
    }

    @Override // l.C0560, java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        m52014(c);
        super.append(c);
        return this;
    }

    @Override // l.C0560, java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) {
        m52014(c);
        super.append(c);
        return this;
    }

    @Override // l.C0560, java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m52015(0, charSequence.length(), charSequence);
        super.append(charSequence);
        return this;
    }

    @Override // l.C0560, java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m52015(0, charSequence.length(), charSequence);
        super.append(charSequence);
        return this;
    }

    @Override // l.C0560, java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m52015(i, i2, charSequence);
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // l.C0560, java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m52015(i, i2, charSequence);
        super.append(charSequence, i, i2);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52015(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            m52014(charSequence.charAt(i));
            i++;
        }
    }

    @Override // l.C0560, java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            int i3 = i + i2;
            for (int i4 = i; i4 < i3; i4++) {
                m52014(cArr[i4]);
            }
            super.write(cArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52014(char c) {
        if (this.f74914 != 0) {
            if (Character.isLowSurrogate(c)) {
                this.f74914 = (char) 0;
                return;
            }
            this.f74914 = (char) 0;
        }
        if (Character.isHighSurrogate(c)) {
            this.f74914 = c;
        }
        int i = this.f74916 + 1;
        this.f74916 = i;
        if (i > this.f74915) {
            throw new C17887();
        }
    }
}
