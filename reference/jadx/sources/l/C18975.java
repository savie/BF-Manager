package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.ᩳۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18975 implements CharSequence, GetChars {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f61518;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10024 f61519;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f61520;

    public C18975(C10024 c10024, int i, int i2) {
        this.f61519 = c10024;
        this.f61520 = i;
        this.f61518 = i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        C10024.m25876(this.f61519);
        return this.f61518 - this.f61520;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException("Invalid diff text index");
        }
        return this.f61519.f32150.charAt(this.f61520 + i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        C10024.m25875(i, i2, length());
        int i3 = this.f61520;
        return new C18975(this.f61519, i + i3, i3 + i2);
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        C10024.m25875(i, i2, length());
        if (i3 < 0 || i3 > cArr.length - (i2 - i)) {
            throw new IndexOutOfBoundsException("Invalid diff text destination");
        }
        C10024 c10024 = this.f61519;
        CharSequence charSequence = c10024.f32150;
        boolean z = charSequence instanceof GetChars;
        int i4 = this.f61520;
        if (z) {
            ((GetChars) charSequence).getChars(i + i4, i4 + i2, cArr, i3);
            return;
        }
        while (i < i2) {
            cArr[i3] = c10024.f32150.charAt(i4 + i);
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
