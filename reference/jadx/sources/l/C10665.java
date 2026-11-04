package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6RB */
/* JADX INFO: loaded from: classes4.dex */
public final class C10665 implements InterfaceC7252 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7155 f33827;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f33828;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5115 f33829;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f33830;

    public C10665(C5115 c5115, C7155 c7155) {
        this.f33829 = c5115;
        this.f33827 = c7155;
    }

    @Override // l.InterfaceC7252
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC8743 mo19894(C18637 c18637, int i, String str, int i2, int i3, int i4, int i5, int i6) {
        Object obj = c18637.f60598;
        C5115 c5115 = this.f33829;
        C23661 c23661 = C23661.f76740;
        if (obj != c5115 || c18637.f60599 != this.f33827 || i3 < 0) {
            return c23661.mo19894(c18637, i, str, i2, i3, i4, i5, i6);
        }
        int i7 = this.f33830;
        this.f33830 = i7 + 1;
        if (str != null || i2 < 0 || i2 > 1 || i < -1 || i > 1073741823) {
            InterfaceC8743 interfaceC8743Mo19894 = c23661.mo19894(c18637, i, str, i2, i3, i4, i5, i6);
            ((C16201) interfaceC8743Mo19894).m38430(i7);
            return interfaceC8743Mo19894;
        }
        return new C21854(this, i3, i4, i7, (i << 1) | i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m27172(C10665 c10665, int i) {
        C7155 c7155 = c10665.f33827;
        if (c10665.f33828 == null) {
            int i2 = 1;
            int i3 = 1;
            for (int i4 = 0; i4 < c7155.size(); i4++) {
                if ((i4 & 1023) == 0) {
                    C7155.m19727();
                }
                if (c7155.m19729(i4) == '\n') {
                    i3++;
                }
            }
            int[] iArr = new int[i3];
            for (int i5 = 0; i5 < c7155.size(); i5++) {
                if ((i5 & 1023) == 0) {
                    C7155.m19727();
                }
                if (c7155.m19729(i5) == '\n') {
                    iArr[i2] = i5 + 1;
                    i2++;
                }
            }
            c10665.f33828 = iArr;
        }
        int iBinarySearch = Arrays.binarySearch(c10665.f33828, i);
        return iBinarySearch >= 0 ? iBinarySearch : (-iBinarySearch) - 2;
    }
}
