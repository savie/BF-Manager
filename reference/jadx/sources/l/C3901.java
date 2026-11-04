package l;

/* JADX INFO: renamed from: l.ۘۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1LQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3901 implements CharSequence {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f13294;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient int f13295;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f13296;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharSequence f13297;

    public C3901(int i, int i2, CharSequence charSequence) {
        if (i < 0 || i2 > charSequence.length() || i > i2) {
            throw new IndexOutOfBoundsException("chars sequence.length:" + charSequence.length() + ", start:" + i + ", end:" + i2);
        }
        this.f13297 = charSequence;
        this.f13294 = i;
        this.f13296 = i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f13296 - this.f13294;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f13297.charAt(i + this.f13294);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.f13294;
        return (i == i3 && i2 == this.f13296) ? this : new C3901(i + i3, i3 + i2, this.f13297);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        CharSequence charSequence = this.f13297;
        boolean z = charSequence instanceof String;
        int i = this.f13296;
        int i2 = this.f13294;
        if (z) {
            return ((String) charSequence).substring(i2, i);
        }
        int i3 = i - i2;
        char[] cArr = new char[i3];
        C1867.m6414(charSequence, cArr, i2, i3);
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12542(char[] cArr, int i, int i2) {
        C1867.m6414(this.f13297, cArr, this.f13294 + i, i2 - i);
    }

    public final int hashCode() {
        int i = this.f13295;
        if (i != 0) {
            return i;
        }
        int iM20679 = C7569.m20679(0, length(), this);
        this.f13295 = iM20679;
        return iM20679;
    }
}
