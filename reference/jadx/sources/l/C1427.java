package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.֨᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: EB2A */
/* JADX INFO: loaded from: classes2.dex */
public final class C1427 implements CharSequence, GetChars {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char[] f5020;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f5021;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f5022;

    public C1427(char[] cArr, int i, int i2) {
        this.f5020 = cArr;
        this.f5021 = i;
        this.f5022 = i2 - i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f5022;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f5022;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C6934.m19217("index = ", i, i2, ", length = "));
        }
        return this.f5020[this.f5021 + i];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.f5022;
        if (i == 0 && i2 == i3) {
            return this;
        }
        int i4 = i2 - i;
        if (i4 < 0 || i < 0 || i2 > i3) {
            StringBuilder sbM5126 = C1402.m5126("start = ", i, ", end = ", ", length = ", i2);
            sbM5126.append(i3);
            throw new IndexOutOfBoundsException(sbM5126.toString());
        }
        if (i4 == 0) {
            return "";
        }
        int i5 = this.f5021;
        return new C1427(this.f5020, i + i5, i5 + i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f5020, this.f5021, this.f5022);
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        int i4 = this.f5022;
        if (i < 0 || i2 > i4 || i > i2) {
            StringBuilder sbM5126 = C1402.m5126("start = ", i, ", end = ", ", length = ", i2);
            sbM5126.append(i4);
            throw new IndexOutOfBoundsException(sbM5126.toString());
        }
        System.arraycopy(this.f5020, this.f5021 + i, cArr, i3, i2 - i);
    }
}
