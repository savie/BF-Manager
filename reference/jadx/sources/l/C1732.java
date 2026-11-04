package l;

/* JADX INFO: renamed from: l.֫ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes2.dex */
public final class C1732 implements CharSequence {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f5918;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public char[] f5919;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6137(char[] cArr) {
        this.f5919 = cArr;
        this.f5918 = null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f5919.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f5919[i];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.f5919, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f5918 == null) {
            this.f5918 = new String(this.f5919);
        }
        return this.f5918;
    }
}
