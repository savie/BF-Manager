package l;

import android.text.Editable;

/* JADX INFO: renamed from: l.ܺܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9AL */
/* JADX INFO: loaded from: classes4.dex */
public class C16031 implements CharSequence {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Editable f51903;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f51904;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f51905;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f51906;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20969 f51907;

    /* JADX INFO: renamed from: ۙ */
    public void mo28691() {
    }

    public C16031(Editable editable) {
        this(editable, 10000);
    }

    public C16031(Editable editable, int i) {
        this.f51907 = new C20969();
        this.f51904 = -1;
        this.f51906 = -1;
        this.f51903 = editable;
        this.f51905 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m38020(int i) {
        return ((i - this.f51904) - this.f51907.length()) + this.f51906;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38022(int i, int i2, int i3, CharSequence charSequence) {
        if (i2 == i3) {
            return;
        }
        if (i2 > i3 || i2 < 0 || i3 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i < 0 || i > length()) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = this.f51904;
        C20969 c20969 = this.f51907;
        if (i4 == -1) {
            this.f51906 = i;
            this.f51904 = i;
            c20969.m47145(c20969.length(), i2, i3, charSequence);
            return;
        }
        Editable editable = this.f51903;
        if (i < i4) {
            c20969.m47145(0, i2, i3, charSequence);
            c20969.m47145(i3 - i2, i, this.f51904, editable);
            this.f51904 = i;
            m38019();
            return;
        }
        if (i < i4 + c20969.length()) {
            c20969.m47145(i - this.f51904, i2, i3, charSequence);
            m38019();
            return;
        }
        int iM38020 = m38020(i);
        c20969.m47145(c20969.length(), this.f51906, iM38020, editable);
        c20969.m47145(c20969.length(), i2, i3, charSequence);
        this.f51906 = iM38020;
        m38019();
    }

    public final void delete(int i, int i2) {
        int length;
        if (i == i2) {
            return;
        }
        if (i > i2 || i < 0 || i2 > length()) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = this.f51904;
        if (i3 == -1) {
            this.f51904 = i;
            this.f51906 = i2;
            return;
        }
        Editable editable = this.f51903;
        C20969 c20969 = this.f51907;
        if (i2 <= i3) {
            c20969.m47145(0, i2, i3, editable);
            this.f51904 = i;
            m38019();
            return;
        }
        if (i >= i3 + c20969.length()) {
            int iM38020 = m38020(i);
            int iM38021 = m38020(i2);
            c20969.m47145(c20969.length(), this.f51906, iM38020, editable);
            this.f51906 = iM38021;
            m38019();
            return;
        }
        int i4 = this.f51904;
        int i5 = i > i4 ? i - i4 : 0;
        if (i2 >= i4 + c20969.length()) {
            length = c20969.length();
            this.f51906 = m38020(i2);
        } else {
            length = i2 - this.f51904;
        }
        if (i <= this.f51904) {
            this.f51904 = i;
        }
        c20969.delete(i5, length);
        if (c20969.length() == 0 && this.f51904 == this.f51906) {
            this.f51906 = -1;
            this.f51904 = -1;
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return (this.f51903.length() - this.f51906) + this.f51904 + this.f51907.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f51904;
        Editable editable = this.f51903;
        if (i < i2) {
            return editable.charAt(i);
        }
        C20969 c20969 = this.f51907;
        if (i < i2 + c20969.length()) {
            return c20969.charAt(i - this.f51904);
        }
        return editable.charAt(m38020(i));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3;
        int length;
        int i4 = this.f51904;
        Editable editable = this.f51903;
        if (i4 == -1) {
            return editable.subSequence(i, i2);
        }
        if (i2 <= i4) {
            return editable.subSequence(i, i2);
        }
        C20969 c20969 = this.f51907;
        if (i >= i4 + c20969.length()) {
            return editable.subSequence(m38020(i), m38020(i2));
        }
        StringBuilder sb = new StringBuilder(i2 - i);
        int i5 = this.f51904;
        if (i < i5) {
            sb.append(editable.subSequence(i, i5));
            i3 = 0;
        } else {
            i3 = i - i5;
        }
        if (i2 > this.f51904 + c20969.length()) {
            length = c20969.length();
        } else {
            length = i2 - this.f51904;
        }
        sb.append((CharSequence) c20969, i3, length);
        if (i2 > this.f51904 + c20969.length()) {
            sb.append(editable.subSequence(this.f51906, m38020(i2)));
        }
        return sb;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m38021() {
        return this.f51907.length();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38023() {
        if (this.f51904 != -1) {
            mo28691();
            int i = this.f51904;
            int i2 = this.f51906;
            C20969 c20969 = this.f51907;
            this.f51903.replace(i, i2, c20969.toString());
            c20969.clear();
            this.f51906 = -1;
            this.f51904 = -1;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m38019() {
        int i = this.f51905;
        if (i == -1 || this.f51907.length() < i) {
            return;
        }
        m38023();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        m38023();
        return this.f51903.toString();
    }
}
