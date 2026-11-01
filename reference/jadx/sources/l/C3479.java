package l;

/* JADX INFO: renamed from: l.ۗ᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: O3Z6 */
/* JADX INFO: loaded from: classes2.dex */
public class C3479 implements InterfaceC9831 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f12773;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f12774 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f12772 = 1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo10210(int i) {
    }

    @Override // l.InterfaceC9831
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo10209(int i) {
        if (i == this.f12774) {
            return this.f12772;
        }
        this.f12774 = i;
        int length = this.f12773.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >> 1;
            int i4 = this.f12773[i3];
            if (i4 < i) {
                i2 = i3 + 1;
            } else {
                if (i4 <= i) {
                    int i5 = i3 + 1;
                    this.f12772 = i5;
                    return i5;
                }
                length = i3 - 1;
            }
        }
        this.f12772 = i2;
        return i2;
    }

    @Override // l.InterfaceC9831
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int mo10211(int i) {
        return (i - this.f12773[mo10209(i) - 1]) + 1;
    }
}
