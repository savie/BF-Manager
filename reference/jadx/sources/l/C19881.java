package l;

import java.io.Writer;

/* JADX INFO: renamed from: l.᩶ۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19881 extends C2093 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f63735 = 1048576;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public char f63736;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f63737;

    @Override // l.C2093, java.io.Writer
    public final void write(int i) {
        m45124((char) i);
        super.write(i);
    }

    @Override // l.C2093, java.io.Writer
    public final void write(String str) {
        if (str != null) {
            m45123(0, str.length(), str);
            super.write(str);
        }
    }

    @Override // l.C2093, java.io.Writer
    public final void write(String str, int i, int i2) {
        if (str != null) {
            m45123(i, i + i2, str);
            super.write(str, i, i2);
        }
    }

    @Override // l.C2093, java.io.Writer
    public final void write(char[] cArr) {
        if (cArr != null) {
            for (char c : cArr) {
                m45124(c);
            }
            super.write(cArr);
        }
    }

    @Override // l.C2093, java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        m45124(c);
        super.append(c);
        return this;
    }

    @Override // l.C2093, java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) {
        m45124(c);
        super.append(c);
        return this;
    }

    @Override // l.C2093, java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m45123(0, charSequence.length(), charSequence);
        super.append(charSequence);
        return this;
    }

    @Override // l.C2093, java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m45123(0, charSequence.length(), charSequence);
        super.append(charSequence);
        return this;
    }

    @Override // l.C2093, java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m45123(i, i2, charSequence);
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // l.C2093, java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m45123(i, i2, charSequence);
        super.append(charSequence, i, i2);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45123(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            m45124(charSequence.charAt(i));
            i++;
        }
    }

    @Override // l.C2093, java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            int i3 = i + i2;
            for (int i4 = i; i4 < i3; i4++) {
                m45124(cArr[i4]);
            }
            super.write(cArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m45124(char c) {
        if (this.f63736 != 0) {
            if (Character.isLowSurrogate(c)) {
                this.f63736 = (char) 0;
                return;
            }
            this.f63736 = (char) 0;
        }
        if (Character.isHighSurrogate(c)) {
            this.f63736 = c;
        }
        int i = this.f63737 + 1;
        this.f63737 = i;
        if (i > this.f63735) {
            throw new C1535();
        }
    }
}
