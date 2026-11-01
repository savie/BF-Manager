package l;

import android.text.Spanned;

/* JADX INFO: renamed from: l.֡ܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Y91P */
/* JADX INFO: loaded from: classes2.dex */
public final class C0565 implements CharSequence, Spanned {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f2343;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f2344;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Spanned f2345;

    public C0565(Spanned spanned, int i, int i2) {
        this.f2345 = spanned;
        this.f2343 = i;
        this.f2344 = i2 - i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f2344;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= this.f2344) {
            throw new IndexOutOfBoundsException();
        }
        char cCharAt = this.f2345.charAt(this.f2343 + i);
        return Character.isLowerCase(cCharAt) ? Character.toUpperCase(cCharAt) : cCharAt;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i2 < 0 || i2 > this.f2344 || i > i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = this.f2343;
        return new C0565(this.f2345, i + i3, i3 + i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.f2344;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = charAt(i2);
        }
        return new String(cArr);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        int i3 = this.f2343;
        return this.f2345.getSpans(i + i3, i3 + i2, cls);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f2345.getSpanStart(obj) - this.f2343;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f2345.getSpanEnd(obj) - this.f2343;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f2345.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        int i3 = this.f2343;
        return this.f2345.nextSpanTransition(i + i3, i2 + i3, cls) - i3;
    }
}
