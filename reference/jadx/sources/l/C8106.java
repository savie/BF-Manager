package l;

/* JADX INFO: renamed from: l.۟᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C8106 extends C0407 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C0407[] f26768;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f26769 = 2;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f26770;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C0407 f26771;

    public C8106(C0407 c0407, C0407 c0408, C0407 c0409) {
        this.f26768 = new C0407[]{c0407, c0408};
        this.f26771 = c0409;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21987() {
        this.f26770 = null;
        int i = -1;
        for (int i2 = 0; i2 < this.f26769; i2++) {
            int iM21985 = m21985(this.f26768[i2]);
            if (iM21985 >= 0) {
                if (i >= 0 && i != iM21985) {
                    int[] iArr = new int[this.f26769];
                    for (int i3 = 0; i3 < this.f26769; i3++) {
                        iArr[i3] = m21985(this.f26768[i3]);
                    }
                    this.f26770 = iArr;
                    return;
                }
                i = iM21985;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m21985(C0407 c0407) {
        int i;
        for (int i2 = 0; i2 < 64 && ((c0407 instanceof C17560) || (c0407 instanceof C19293)); i2++) {
            c0407 = c0407.f1952;
        }
        if (!(c0407 instanceof C19624)) {
            return -1;
        }
        int[] iArr = ((C19624) c0407).f19048;
        if (iArr.length <= 0 || (i = iArr[0]) < 0 || i >= 128) {
            return -1;
        }
        return i;
    }
}
