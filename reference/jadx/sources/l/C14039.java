package l;

/* JADX INFO: renamed from: l.ܰ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6TX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14039 extends C17565 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f46156;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f46157;

    public C14039(C14744 c14744, int i, int i2) {
        super(c14744);
        this.f46156 = i;
        this.f46157 = i2;
    }

    @Override // l.C17565
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo33950() {
        return this.f46156;
    }

    @Override // l.C17565, java.lang.CharSequence
    public final int length() {
        m40840();
        return this.f46157 - this.f46156;
    }

    @Override // l.C17565, java.lang.CharSequence
    public final char charAt(int i) {
        C14744 c14744M40840 = m40840();
        if (i >= 0) {
            int i2 = this.f46157;
            int i3 = this.f46156;
            if (i < i2 - i3) {
                return c14744M40840.m35331(i3 + i);
            }
        }
        throw new IndexOutOfBoundsException("Invalid character index");
    }

    @Override // l.C17565, java.lang.CharSequence
    public final C17565 subSequence(int i, int i2) {
        C14744 c14744M40840 = m40840();
        int i3 = this.f46157;
        int i4 = this.f46156;
        C14744.m35328(i, i2, i3 - i4);
        return new C14039(c14744M40840, i + i4, i4 + i2);
    }

    @Override // l.C17565
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        C14744 c14744M40840 = m40840();
        int i4 = this.f46157;
        int i5 = this.f46156;
        C14744.m35328(i, i2, i4 - i5);
        int i6 = i2 - i;
        C17565.m40836(cArr, i3, i6);
        C4159 c4159 = new C4159(c14744M40840, i5, i4, i);
        try {
            c4159.m11800(cArr, i3, i6);
            c4159.close();
        } catch (Throwable th) {
            try {
                c4159.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.C17565
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4159 mo33951(int i) {
        return new C4159(m40840(), this.f46156, this.f46157, i);
    }

    @Override // l.C17565, java.lang.CharSequence
    public final String toString() {
        int length = length();
        char[] cArr = new char[length];
        getChars(0, length, cArr, 0);
        return new String(cArr);
    }
}
