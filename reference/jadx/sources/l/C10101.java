package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6RB */
/* JADX INFO: loaded from: classes3.dex */
public final class C10101 implements InterfaceC9178 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f34488;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18567 f34489;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f34490;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19583 f34491;

    public C10101(C19583 c19583, C18567 c18567) {
        this.f34491 = c19583;
        this.f34489 = c18567;
    }

    @Override // l.InterfaceC9178
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC19761 mo9048(C3697 c3697, int i, String str, int i2, int i3, int i4, int i5, int i6) {
        Object obj = c3697.f13496;
        C19583 c19583 = this.f34491;
        C3034 c3034 = C3034.f11346;
        if (obj != c19583 || c3697.f13497 != this.f34489 || i3 < 0) {
            return c3034.mo9048(c3697, i, str, i2, i3, i4, i5, i6);
        }
        int i7 = this.f34488;
        this.f34488 = i7 + 1;
        if (str != null || i2 < 0 || i2 > 1 || i < -1 || i > 1073741823) {
            InterfaceC19761 interfaceC19761Mo9048 = c3034.mo9048(c3697, i, str, i2, i3, i4, i5, i6);
            ((C9386) interfaceC19761Mo9048).m24079(i7);
            return interfaceC19761Mo9048;
        }
        return new C8690(this, i3, i4, i7, (i << 1) | i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25705(C10101 c10101, int i) {
        C18567 c18567 = c10101.f34489;
        if (c10101.f34490 == null) {
            int i2 = 1;
            int i3 = 1;
            for (int i4 = 0; i4 < c18567.size(); i4++) {
                if ((i4 & 1023) == 0) {
                    C18567.m42975();
                }
                if (c18567.m42976(i4) == '\n') {
                    i3++;
                }
            }
            int[] iArr = new int[i3];
            for (int i5 = 0; i5 < c18567.size(); i5++) {
                if ((i5 & 1023) == 0) {
                    C18567.m42975();
                }
                if (c18567.m42976(i5) == '\n') {
                    iArr[i2] = i5 + 1;
                    i2++;
                }
            }
            c10101.f34490 = iArr;
        }
        int iBinarySearch = Arrays.binarySearch(c10101.f34490, i);
        return iBinarySearch >= 0 ? iBinarySearch : (-iBinarySearch) - 2;
    }
}
