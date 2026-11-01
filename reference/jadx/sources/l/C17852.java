package l;

/* JADX INFO: renamed from: l.ᩳۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes4.dex */
public final class C17852 implements CharSequence {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f56542;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public char[] f56543;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41441(char[] cArr) {
        this.f56543 = cArr;
        this.f56542 = null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f56543.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f56543[i];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.f56543, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f56542 == null) {
            this.f56542 = new String(this.f56543);
        }
        return this.f56542;
    }
}
