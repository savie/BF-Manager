package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻ۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes.dex */
public final class C23636 implements InterfaceC20376 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f76558;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f76559;

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
        return C16143.m38214(this, interfaceC13717);
    }

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
        return C16143.m38215(this, interfaceC13717);
    }

    @Override // l.InterfaceC13717
    public final C3111 negate() {
        C23595 c23595 = C22141.f71668;
        return C3111.m9336(this);
    }

    public C23636(int[] iArr, int[] iArr2) {
        this.f76559 = iArr;
        this.f76558 = iArr2;
    }

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1813(int i) {
        int[] iArr = this.f76559;
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
        int[] iArr2 = this.f76558;
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
