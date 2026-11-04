package l;

import android.text.Editable;

/* JADX INFO: renamed from: l.ۢ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S9AL */
/* JADX INFO: loaded from: classes3.dex */
public class C10375 implements CharSequence {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f33001;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f33002;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f33003;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Editable f33004;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19326 f33005;

    /* JADX INFO: renamed from: ۙ */
    public void mo5600() {
    }

    public C10375(Editable editable) {
        this(editable, 10000);
    }

    public C10375(Editable editable, int i) {
        this.f33005 = new C19326();
        this.f33002 = -1;
        this.f33001 = -1;
        this.f33004 = editable;
        this.f33003 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m26681(int i) {
        return ((i - this.f33002) - this.f33005.length()) + this.f33001;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26682(int i, int i2, int i3, CharSequence charSequence) {
        if (i2 == i3) {
            return;
        }
        if (i2 > i3 || i2 < 0 || i3 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i < 0 || i > length()) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = this.f33002;
        C19326 c19326 = this.f33005;
        if (i4 == -1) {
            this.f33001 = i;
            this.f33002 = i;
            c19326.m44704(c19326.length(), i2, i3, charSequence);
            return;
        }
        Editable editable = this.f33004;
        if (i < i4) {
            c19326.m44704(0, i2, i3, charSequence);
            c19326.m44704(i3 - i2, i, this.f33002, editable);
            this.f33002 = i;
            m26680();
            return;
        }
        if (i < i4 + c19326.length()) {
            c19326.m44704(i - this.f33002, i2, i3, charSequence);
            m26680();
            return;
        }
        int iM26681 = m26681(i);
        c19326.m44704(c19326.length(), this.f33001, iM26681, editable);
        c19326.m44704(c19326.length(), i2, i3, charSequence);
        this.f33001 = iM26681;
        m26680();
    }

    public final void delete(int i, int i2) {
        int length;
        if (i == i2) {
            return;
        }
        if (i > i2 || i < 0 || i2 > length()) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = this.f33002;
        if (i3 == -1) {
            this.f33002 = i;
            this.f33001 = i2;
            return;
        }
        Editable editable = this.f33004;
        C19326 c19326 = this.f33005;
        if (i2 <= i3) {
            c19326.m44704(0, i2, i3, editable);
            this.f33002 = i;
            m26680();
            return;
        }
        if (i >= i3 + c19326.length()) {
            int iM26681 = m26681(i);
            int iM26682 = m26681(i2);
            c19326.m44704(c19326.length(), this.f33001, iM26681, editable);
            this.f33001 = iM26682;
            m26680();
            return;
        }
        int i4 = this.f33002;
        int i5 = i > i4 ? i - i4 : 0;
        if (i2 >= i4 + c19326.length()) {
            length = c19326.length();
            this.f33001 = m26681(i2);
        } else {
            length = i2 - this.f33002;
        }
        if (i <= this.f33002) {
            this.f33002 = i;
        }
        c19326.delete(i5, length);
        if (c19326.length() == 0 && this.f33002 == this.f33001) {
            this.f33001 = -1;
            this.f33002 = -1;
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return (this.f33004.length() - this.f33001) + this.f33002 + this.f33005.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f33002;
        Editable editable = this.f33004;
        if (i < i2) {
            return editable.charAt(i);
        }
        C19326 c19326 = this.f33005;
        if (i < i2 + c19326.length()) {
            return c19326.charAt(i - this.f33002);
        }
        return editable.charAt(m26681(i));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3;
        int length;
        int i4 = this.f33002;
        Editable editable = this.f33004;
        if (i4 == -1) {
            return editable.subSequence(i, i2);
        }
        if (i2 <= i4) {
            return editable.subSequence(i, i2);
        }
        C19326 c19326 = this.f33005;
        if (i >= i4 + c19326.length()) {
            return editable.subSequence(m26681(i), m26681(i2));
        }
        StringBuilder sb = new StringBuilder(i2 - i);
        int i5 = this.f33002;
        if (i < i5) {
            sb.append(editable.subSequence(i, i5));
            i3 = 0;
        } else {
            i3 = i - i5;
        }
        if (i2 > this.f33002 + c19326.length()) {
            length = c19326.length();
        } else {
            length = i2 - this.f33002;
        }
        sb.append((CharSequence) c19326, i3, length);
        if (i2 > this.f33002 + c19326.length()) {
            sb.append(editable.subSequence(this.f33001, m26681(i2)));
        }
        return sb;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m26684() {
        int i = this.f33002;
        if (i < 0) {
            return 0L;
        }
        return (((long) this.f33001) - ((long) i)) + ((long) this.f33005.length());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m26683() {
        if (this.f33002 != -1) {
            mo5600();
            int i = this.f33002;
            int i2 = this.f33001;
            C19326 c19326 = this.f33005;
            this.f33004.replace(i, i2, c19326.toString());
            c19326.clear();
            this.f33001 = -1;
            this.f33002 = -1;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m26680() {
        int i = this.f33003;
        if (i == -1 || this.f33005.length() < i) {
            return;
        }
        m26683();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        m26683();
        return this.f33004.toString();
    }
}
