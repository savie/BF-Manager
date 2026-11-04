package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֡ۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C0233 implements InterfaceC12580 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f1481;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f1482;

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
        return C20785.m47569(this, interfaceC2885);
    }

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
        return C20785.m47570(this, interfaceC2885);
    }

    @Override // l.InterfaceC2885
    public final C0891 negate() {
        C0407 c0407 = C5233.f18438;
        return C0891.m3623(this);
    }

    public C0233(int[] iArr, int[] iArr2) {
        this.f1482 = iArr;
        this.f1481 = iArr2;
    }

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1303(int i) {
        int[] iArr = this.f1482;
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
        int[] iArr2 = this.f1481;
        if (iArr2.length > 16) {
            return Arrays.binarySearch(iArr2, i) >= 0;
        }
        for (int i7 : iArr2) {
            if (i7 != i) {
                if (i7 > i) {
                    break;
                }
            }
        }
    }
}
