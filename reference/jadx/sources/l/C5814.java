package l;

/* JADX INFO: renamed from: l.ۚܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6TX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5814 extends C8796 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f19989;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f19990;

    public C5814(C21697 c21697, int i, int i2) {
        super(c21697);
        this.f19989 = i;
        this.f19990 = i2;
    }

    @Override // l.C8796
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo16944() {
        return this.f19989;
    }

    @Override // l.C8796, java.lang.CharSequence
    public final int length() {
        m23622();
        return this.f19990 - this.f19989;
    }

    @Override // l.C8796, java.lang.CharSequence
    public final char charAt(int i) {
        C21697 c21697M23622 = m23622();
        if (i >= 0) {
            int i2 = this.f19990;
            int i3 = this.f19989;
            if (i < i2 - i3) {
                return c21697M23622.m49251(i3 + i);
            }
        }
        throw new IndexOutOfBoundsException("Invalid character index");
    }

    @Override // l.C8796, java.lang.CharSequence
    public final C8796 subSequence(int i, int i2) {
        C21697 c21697M23622 = m23622();
        int i3 = this.f19990;
        int i4 = this.f19989;
        C21697.m49248(i, i2, i3 - i4);
        return new C5814(c21697M23622, i + i4, i4 + i2);
    }

    @Override // l.C8796
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        C21697 c21697M23622 = m23622();
        int i4 = this.f19990;
        int i5 = this.f19989;
        C21697.m49248(i, i2, i4 - i5);
        int i6 = i2 - i;
        C8796.m23619(cArr, i3, i6);
        C23714 c23714 = new C23714(c21697M23622, i5, i4, i);
        try {
            c23714.m52963(cArr, i3, i6);
            c23714.close();
        } catch (Throwable th) {
            try {
                c23714.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.C8796
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23714 mo16945(int i) {
        return new C23714(m23622(), this.f19989, this.f19990, i);
    }

    @Override // l.C8796, java.lang.CharSequence
    public final String toString() {
        int length = length();
        char[] cArr = new char[length];
        getChars(0, length, cArr, 0);
        return new String(cArr);
    }
}
