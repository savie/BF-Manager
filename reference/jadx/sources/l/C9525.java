package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C9525 implements InterfaceC13717 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f32211;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f32212;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f32213;

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
        return C4543.m12682(this, interfaceC13717);
    }

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
        return C4543.m12683(this, interfaceC13717);
    }

    @Override // l.InterfaceC13717
    public final C3111 negate() {
        C23595 c23595 = C22141.f71668;
        return C3111.m9336(this);
    }

    public C9525(int[] iArr, int[] iArr2, int[] iArr3) {
        this.f32212 = iArr;
        this.f32211 = iArr2;
        this.f32213 = iArr3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13717 m24369(ArrayList arrayList, boolean z) {
        int[] iArr;
        int iMax = 0;
        if (arrayList.size() == 1) {
            int[] iArr2 = (int[]) arrayList.get(0);
            iArr = new int[]{iArr2[0], iArr2[1]};
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList);
            C23846.sort(arrayList2, new C1762());
            ArrayList arrayList3 = new ArrayList();
            int[] iArr3 = (int[]) ((int[]) arrayList2.get(0)).clone();
            for (int i = 1; i < arrayList2.size(); i++) {
                int[] iArr4 = (int[]) arrayList2.get(i);
                int i2 = iArr4[0];
                int i3 = iArr3[1];
                if (i2 <= i3 + 1) {
                    iArr3[1] = Math.max(i3, iArr4[1]);
                } else {
                    arrayList3.add(iArr3);
                    iArr3 = (int[]) iArr4.clone();
                }
            }
            arrayList3.add(iArr3);
            int[] iArr5 = new int[arrayList3.size() * 2];
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                int i5 = i4 * 2;
                iArr5[i5] = ((int[]) arrayList3.get(i4))[0];
                iArr5[i5 + 1] = ((int[]) arrayList3.get(i4))[1];
            }
            iArr = iArr5;
        }
        for (int i6 = 1; i6 < iArr.length; i6 += 2) {
            iMax = Math.max(iMax, iArr[i6]);
        }
        int[] iArrM24372 = m24372(C22141.f71666, iArr);
        int[] iArrM24373 = iMax >= 65536 ? m24372(C12347.f41255, iArr) : null;
        if (iMax < 65536 && !z && !C16580.f53223) {
            return new C23636(iArr, iArrM24372);
        }
        return new C9525(iArr, iArrM24372, iArrM24373);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m24372(int[] iArr, int[] iArr2) {
        int[] iArrCopyOf = new int[64];
        int i = 0;
        for (int i2 : iArr) {
            if (!m24370(i2, iArr2)) {
                int upperCase = Character.toUpperCase(i2);
                if (m24370(upperCase, iArr2) || m24370(Character.toLowerCase(upperCase), iArr2)) {
                    if (i == iArrCopyOf.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
                    }
                    iArrCopyOf[i] = i2;
                    i++;
                }
            }
        }
        return Arrays.copyOf(iArrCopyOf, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m24370(int i, int[] iArr) {
        int length = (iArr.length / 2) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = i3 * 2;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            if (i < i5) {
                length = i3 - 1;
            } else {
                if (i <= i6) {
                    return true;
                }
                i2 = i3 + 1;
            }
        }
        return false;
    }

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1813(int i) {
        int[] iArr = this.f32212;
        if (m24370(i, iArr)) {
            return true;
        }
        if (i < 65536) {
            return m24371(this.f32211, i);
        }
        int[] iArr2 = this.f32213;
        if (iArr2 != null) {
            return m24371(iArr2, i);
        }
        int upperCase = Character.toUpperCase(i);
        return m24370(upperCase, iArr) || m24370(Character.toLowerCase(upperCase), iArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m24371(int[] iArr, int i) {
        if (iArr.length > 16) {
            return Arrays.binarySearch(iArr, i) >= 0;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
            if (i2 > i) {
                return false;
            }
        }
        return false;
    }
}
