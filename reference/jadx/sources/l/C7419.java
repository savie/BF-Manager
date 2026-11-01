package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.۟ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7419 implements CharSequence, GetChars {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20825 f24700;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f24701;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f24702;

    public C7419(C20825 c20825, int i, int i2) {
        this.f24700 = c20825;
        this.f24702 = i;
        this.f24701 = i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        C20825.m46855(this.f24700);
        return this.f24701 - this.f24702;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException("Invalid diff text index");
        }
        return this.f24700.f67679.charAt(this.f24702 + i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        C20825.m46854(i, i2, length());
        int i3 = this.f24702;
        return new C7419(this.f24700, i + i3, i3 + i2);
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        C20825.m46854(i, i2, length());
        if (i3 < 0 || i3 > cArr.length - (i2 - i)) {
            throw new IndexOutOfBoundsException("Invalid diff text destination");
        }
        C20825 c20825 = this.f24700;
        CharSequence charSequence = c20825.f67679;
        boolean z = charSequence instanceof GetChars;
        int i4 = this.f24702;
        if (z) {
            ((GetChars) charSequence).getChars(i + i4, i4 + i2, cArr, i3);
            return;
        }
        while (i < i2) {
            cArr[i3] = c20825.f67679.charAt(i4 + i);
            i++;
            i3++;
        }
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int length = length();
        char[] cArr = new char[length];
        getChars(0, length, cArr, 0);
        return new String(cArr);
    }
}
