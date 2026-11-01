package l;

/* JADX INFO: renamed from: l.ܳ᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C14732 extends C23595 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23595 f48159;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f48160 = 2;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C23595[] f48161;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f48162;

    public C14732(C23595 c23595, C23595 c23596, C23595 c23597) {
        this.f48161 = new C23595[]{c23595, c23596};
        this.f48159 = c23597;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35295() {
        this.f48162 = null;
        int i = -1;
        for (int i2 = 0; i2 < this.f48160; i2++) {
            int iM35293 = m35293(this.f48161[i2]);
            if (iM35293 >= 0) {
                if (i >= 0 && i != iM35293) {
                    int[] iArr = new int[this.f48160];
                    for (int i3 = 0; i3 < this.f48160; i3++) {
                        iArr[i3] = m35293(this.f48161[i3]);
                    }
                    this.f48162 = iArr;
                    return;
                }
                i = iM35293;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m35293(C23595 c23595) {
        int i;
        for (int i2 = 0; i2 < 64 && ((c23595 instanceof C8778) || (c23595 instanceof C2030)); i2++) {
            c23595 = c23595.f76439;
        }
        if (!(c23595 instanceof C6701)) {
            return -1;
        }
        int[] iArr = ((C6701) c23595).f69912;
        if (iArr.length <= 0 || (i = iArr[0]) < 0 || i >= 128) {
            return -1;
        }
        return i;
    }
}
