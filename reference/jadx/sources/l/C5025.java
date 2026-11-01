package l;

/* JADX INFO: renamed from: l.ۚ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1LQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5025 implements CharSequence {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f17521;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient int f17522;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f17523;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharSequence f17524;

    public C5025(int i, int i2, CharSequence charSequence) {
        if (i < 0 || i2 > charSequence.length() || i > i2) {
            throw new IndexOutOfBoundsException("chars sequence.length:" + charSequence.length() + ", start:" + i + ", end:" + i2);
        }
        this.f17524 = charSequence;
        this.f17523 = i;
        this.f17521 = i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f17521 - this.f17523;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f17524.charAt(i + this.f17523);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.f17523;
        return (i == i3 && i2 == this.f17521) ? this : new C5025(i + i3, i3 + i2, this.f17524);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        CharSequence charSequence = this.f17524;
        boolean z = charSequence instanceof String;
        int i = this.f17521;
        int i2 = this.f17523;
        if (z) {
            return ((String) charSequence).substring(i2, i);
        }
        int i3 = i - i2;
        char[] cArr = new char[i3];
        C10336.m26219(charSequence, cArr, i2, i3);
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13968(char[] cArr, int i, int i2) {
        C10336.m26219(this.f17524, cArr, this.f17523 + i, i2 - i);
    }

    public final int hashCode() {
        int i = this.f17522;
        if (i != 0) {
            return i;
        }
        int iM33169 = C13571.m33169(0, length(), this);
        this.f17522 = iM33169;
        return iM33169;
    }
}
