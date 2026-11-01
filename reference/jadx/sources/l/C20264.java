package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.᩶ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB2A */
/* JADX INFO: loaded from: classes4.dex */
public final class C20264 implements CharSequence, GetChars {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f65711;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final char[] f65712;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f65713;

    public C20264(char[] cArr, int i, int i2) {
        this.f65712 = cArr;
        this.f65711 = i;
        this.f65713 = i2 - i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f65713;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f65713;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C2271.m6967("index = ", i, i2, ", length = "));
        }
        return this.f65712[this.f65711 + i];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.f65713;
        if (i == 0 && i2 == i3) {
            return this;
        }
        int i4 = i2 - i;
        if (i4 < 0 || i < 0 || i2 > i3) {
            StringBuilder sbM2791 = C0589.m2791("start = ", i, ", end = ", ", length = ", i2);
            sbM2791.append(i3);
            throw new IndexOutOfBoundsException(sbM2791.toString());
        }
        if (i4 == 0) {
            return "";
        }
        int i5 = this.f65711;
        return new C20264(this.f65712, i + i5, i5 + i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f65712, this.f65711, this.f65713);
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        int i4 = this.f65713;
        if (i < 0 || i2 > i4 || i > i2) {
            StringBuilder sbM2791 = C0589.m2791("start = ", i, ", end = ", ", length = ", i2);
            sbM2791.append(i4);
            throw new IndexOutOfBoundsException(sbM2791.toString());
        }
        System.arraycopy(this.f65712, this.f65711 + i, cArr, i3, i2 - i);
    }
}
