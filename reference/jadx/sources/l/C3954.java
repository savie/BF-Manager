package l;

/* JADX INFO: renamed from: l.ۘۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F6QC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3954 implements CharSequence {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f13499;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharSequence[] f13500;

    public C3954(CharSequence... charSequenceArr) {
        this.f13500 = charSequenceArr;
        int i = 0;
        for (CharSequence charSequence : charSequenceArr) {
            long length = ((long) i) + ((long) charSequence.length());
            i = (int) length;
            if (length != i) {
                throw new ArithmeticException();
            }
        }
        this.f13499 = i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f13499;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= this.f13499) {
            throw new IndexOutOfBoundsException();
        }
        for (CharSequence charSequence : this.f13500) {
            if (i < charSequence.length()) {
                return charSequence.charAt(i);
            }
            i -= charSequence.length();
        }
        throw new AssertionError();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C18334(i, i2, this);
    }
}
