package l;

/* JADX INFO: renamed from: l.᩶᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes.dex */
public class C21531 extends C0407 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f68792;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f68793;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f68794;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0407 m48974(C0407 c0407) {
        int[] iArr;
        int length;
        if (!(c0407 instanceof C19624) || (length = (iArr = ((C19624) c0407).f19048).length) < 4) {
            return c0407;
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
        if (!(c0407 instanceof C1725)) {
            return new C21531(iArr, iArr2, iArr3, c0407.f1952);
        }
        C18547 c18547 = new C18547(iArr, iArr2, iArr3, c0407.f1952);
        for (int i5 : c18547.f68793) {
            c18547.f60266 = Character.charCount(i5) + c18547.f60266;
        }
        return c18547;
    }

    public C21531(int[] iArr, int[] iArr2, int[] iArr3, C0407 c0407) {
        this.f68793 = iArr;
        this.f68792 = iArr2;
        this.f68794 = iArr3;
        this.f1952 = c0407;
    }
}
