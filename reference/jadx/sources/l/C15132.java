package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.ܳۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AG9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15132 implements CharSequence {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f49367;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f49368;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char[] f49369 = new char[2048];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final GetChars f49370;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f49371;

    public C15132(C15508 c15508) {
        this.f49370 = c15508;
        this.f49371 = c15508.length();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f49371;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m36411(int i) {
        int i2;
        if (i < this.f49368 || i >= this.f49367) {
            if (i < 0 || i >= (i2 = this.f49371)) {
                throw new IndexOutOfBoundsException("Invalid character index");
            }
            char[] cArr = this.f49369;
            int iMin = Math.min(cArr.length, i2 - i) + i;
            this.f49367 = 0;
            this.f49368 = 0;
            this.f49370.getChars(i, iMin, cArr, 0);
            this.f49368 = i;
            this.f49367 = iMin;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < this.f49368 || i >= this.f49367) {
            m36411(i);
        }
        return this.f49369[i - this.f49368];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i2 < i || i2 > this.f49371) {
            throw new IndexOutOfBoundsException("Invalid character range");
        }
        int i3 = this.f49368;
        if (i >= i3 && i2 <= this.f49367) {
            return new String(this.f49369, i - i3, i2 - i);
        }
        return this.f49370.subSequence(i, i2);
    }
}
