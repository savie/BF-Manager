package l;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: l.᩹᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: AIU7 */
/* JADX INFO: loaded from: classes.dex */
public final class C23861 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f77247;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f77248;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f77250;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f77251;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f77253;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f77249 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final BitSet f77252 = new BitSet();

    public C23861(int[] iArr) {
        this.f77250 = (int[]) iArr.clone();
        this.f77248 = new int[iArr.length];
        this.f77253 = new int[iArr.length];
        this.f77247 = new int[iArr.length];
        this.f77251 = new int[iArr.length];
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 < -1 || i2 >= i) {
                throw new IllegalArgumentException("Invalid parent index");
            }
            int[] iArr3 = this.f77248;
            iArr3[i] = i2 < 0 ? 0 : iArr3[i2] + 1;
            int i3 = iArr[i];
            if (i3 >= 0) {
                iArr2[i3] = iArr2[i3] + 1;
                this.f77251[iArr[i]] = i;
            }
        }
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 >= 0) {
                int[] iArr4 = this.f77253;
                iArr4[i4] = Math.min(7, iArr4[i5] + (iArr2[i5] > 1 ? 1 : 0));
                int[] iArr5 = this.f77247;
                iArr5[i4] = iArr5[i5];
                int i6 = iArr[i5];
                if (i6 >= 0) {
                    int[] iArr6 = this.f77253;
                    if (iArr6[i5] > iArr6[i6] && !m53209(i5)) {
                        int[] iArr7 = this.f77247;
                        iArr7[i4] = (1 << this.f77253[i6]) | iArr7[i4];
                    }
                }
            }
        }
        m53206();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m53210(int i) {
        int i2 = i + 1;
        int[] iArr = this.f77250;
        if (i2 >= iArr.length || iArr[i2] != i) {
            return;
        }
        BitSet bitSet = this.f77252;
        if (bitSet.get(i)) {
            bitSet.clear(i);
        } else {
            bitSet.set(i);
            while (i2 < iArr.length) {
                int[] iArr2 = this.f77248;
                if (iArr2[i2] <= iArr2[i]) {
                    break;
                }
                int i3 = i2 + 1;
                if (i3 < iArr.length && iArr[i3] == i2) {
                    bitSet.set(i2);
                }
                i2 = i3;
            }
        }
        m53206();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m53209(int i) {
        int i2 = this.f77250[i];
        return i2 < 0 || this.f77251[i2] == i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53207(int i) {
        return this.f77252.get(i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m53208(int i) {
        int[] iArr = this.f77250;
        for (int i2 = iArr[i]; i2 >= 0; i2 = iArr[i2]) {
            this.f77252.clear(i2);
        }
        m53206();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m53206() {
        ArrayList arrayList = this.f77249;
        arrayList.clear();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < this.f77250.length; i2++) {
            int[] iArr = this.f77248;
            if (iArr[i2] <= i) {
                arrayList.add(Integer.valueOf(i2));
                i = this.f77252.get(i2) ? iArr[i2] : Integer.MAX_VALUE;
            }
        }
    }
}
