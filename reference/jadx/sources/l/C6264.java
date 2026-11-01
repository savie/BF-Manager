package l;

/* JADX INFO: renamed from: l.ۛ᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes3.dex */
public class C6264 extends C23595 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int[] f21229;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f21230;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f21231;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23595 m17333(C23595 c23595) {
        int[] iArr;
        int length;
        if (!(c23595 instanceof C6701) || (length = (iArr = ((C6701) c23595).f69912).length) < 4) {
            return c23595;
        }
        int[] iArr2 = new int[128];
        int[] iArr3 = new int[length];
        int i = 0;
        while (i < length) {
            int i2 = iArr[i] & 127;
            i++;
            iArr2[i2] = i;
        }
        for (int i3 = length; i3 > 0; i3--) {
            int i4 = length - 1;
            while (true) {
                if (i4 < i3) {
                    while (i4 > 0) {
                        i4--;
                        iArr3[i4] = i3;
                    }
                    break;
                }
                if (iArr[i4] != iArr[i4 - i3]) {
                    break;
                }
                iArr3[i4 - 1] = i3;
                i4--;
            }
        }
        iArr3[length - 1] = 1;
        if (!(c23595 instanceof C17990)) {
            return new C6264(iArr, iArr2, iArr3, c23595.f76439);
        }
        C11204 c11204 = new C11204(iArr, iArr2, iArr3, c23595.f76439);
        for (int i5 : c11204.f21231) {
            c11204.f37919 = Character.charCount(i5) + c11204.f37919;
        }
        return c11204;
    }

    public C6264(int[] iArr, int[] iArr2, int[] iArr3, C23595 c23595) {
        this.f21231 = iArr;
        this.f21230 = iArr2;
        this.f21229 = iArr3;
        this.f76439 = c23595;
    }
}
