package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.ۘۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AG9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3762 implements CharSequence {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final GetChars f13617;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f13618;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final char[] f13619 = new char[2048];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f13620;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f13621;

    public C3762(C3329 c3329) {
        this.f13617 = c3329;
        this.f13621 = c3329.length();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f13621;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m11004(int i) {
        int i2;
        if (i < this.f13618 || i >= this.f13620) {
            if (i < 0 || i >= (i2 = this.f13621)) {
                throw new IndexOutOfBoundsException("Invalid character index");
            }
            char[] cArr = this.f13619;
            int iMin = Math.min(cArr.length, i2 - i) + i;
            this.f13620 = 0;
            this.f13618 = 0;
            this.f13617.getChars(i, iMin, cArr, 0);
            this.f13618 = i;
            this.f13620 = iMin;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < this.f13618 || i >= this.f13620) {
            m11004(i);
        }
        return this.f13619[i - this.f13618];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i2 < i || i2 > this.f13621) {
            throw new IndexOutOfBoundsException("Invalid character range");
        }
        int i3 = this.f13618;
        if (i >= i3 && i2 <= this.f13620) {
            return new String(this.f13619, i - i3, i2 - i);
        }
        return this.f13617.subSequence(i, i2);
    }
}
