package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C9927 implements InterfaceC2885 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f31858;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f31859;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f31860;

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
        return C9596.m25073(this, interfaceC2885);
    }

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
        return C9596.m25074(this, interfaceC2885);
    }

    @Override // l.InterfaceC2885
    public final C0891 negate() {
        C0407 c0407 = C5233.f18438;
        return C0891.m3623(this);
    }

    public C9927(int[] iArr, int[] iArr2, int[] iArr3) {
        this.f31859 = iArr;
        this.f31858 = iArr2;
        this.f31860 = iArr3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2885 m25760(ArrayList arrayList, boolean z) {
        int[] iArr;
        int iMax = 0;
        if (arrayList.size() == 1) {
            int[] iArr2 = (int[]) arrayList.get(0);
            iArr = new int[]{iArr2[0], iArr2[1]};
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList);
            C12884.sort(arrayList2, new C18878());
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
        int[] iArrM25763 = m25763(C5233.f18436, iArr);
        int[] iArrM25764 = iMax >= 65536 ? m25763(C3962.f13544, iArr) : null;
        if (iMax < 65536 && !z && !C24100.f77914) {
            return new C0233(iArr, iArrM25763);
        }
        return new C9927(iArr, iArrM25763, iArrM25764);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m25763(int[] iArr, int[] iArr2) {
        int[] iArrCopyOf = new int[64];
        int i = 0;
        for (int i2 : iArr) {
            if (!m25761(i2, iArr2)) {
                int upperCase = Character.toUpperCase(i2);
                if (m25761(upperCase, iArr2) || m25761(Character.toLowerCase(upperCase), iArr2)) {
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
    public static boolean m25761(int i, int[] iArr) {
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

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1303(int i) {
        int[] iArr = this.f31859;
        if (m25761(i, iArr)) {
            return true;
        }
        if (i < 65536) {
            return m25762(this.f31858, i);
        }
        int[] iArr2 = this.f31860;
        if (iArr2 != null) {
            return m25762(iArr2, i);
        }
        int upperCase = Character.toUpperCase(i);
        return m25761(upperCase, iArr) || m25761(Character.toLowerCase(upperCase), iArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m25762(int[] iArr, int i) {
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
