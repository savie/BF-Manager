package l;

/* JADX INFO: renamed from: l.ۧۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3Z6 */
/* JADX INFO: loaded from: classes4.dex */
public class C11523 implements InterfaceC1829 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f36268;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f36269 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f36267 = 1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo29015(int i) {
    }

    @Override // l.InterfaceC1829
    /* JADX INFO: renamed from: ۙ */
    public int mo6321(int i) {
        if (i == this.f36269) {
            return this.f36267;
        }
        this.f36269 = i;
        int length = this.f36268.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >> 1;
            int i4 = this.f36268[i3];
            if (i4 < i) {
                i2 = i3 + 1;
            } else {
                if (i4 <= i) {
                    int i5 = i3 + 1;
                    this.f36267 = i5;
                    return i5;
                }
                length = i3 - 1;
            }
        }
        this.f36267 = i2;
        return i2;
    }

    @Override // l.InterfaceC1829
    /* JADX INFO: renamed from: ᩷ */
    public int mo6322(int i) {
        return (i - this.f36268[mo6321(i) - 1]) + 1;
    }
}
