package l;

/* JADX INFO: renamed from: l.᩶֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66T2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19809 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f63591;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f63592;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f63593;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45044(char[] cArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (this.f63591 * 31) + cArr[i2];
            this.f63591 = i3;
            int i4 = this.f63592 + 1;
            this.f63592 = i4;
            if (i4 == 14740) {
                this.f63593 = (this.f63593 * 31) + i3;
                this.f63592 = 0;
                this.f63591 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45043(int i) {
        return (i * 31) + (this.f63592 == 0 ? this.f63593 : (this.f63593 * 31) + this.f63591);
    }
}
