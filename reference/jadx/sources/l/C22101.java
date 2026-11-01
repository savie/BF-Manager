package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩹ۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes.dex */
public final class C22101 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f71574;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f71575;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49039(int i) {
        int[] iArr = this.f71574;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f71574 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f71574 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.f71574;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49038() {
        int[] iArr = this.f71574;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f71575 = null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49041(int i, int i2) {
        int[] iArr = this.f71574;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m49039(i3);
        int[] iArr2 = this.f71574;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = this.f71574;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = this.f71575;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C5167 c5167 = (C5167) this.f71575.get(size);
            int i4 = c5167.f17935;
            if (i4 >= i) {
                if (i4 < i3) {
                    this.f71575.remove(size);
                } else {
                    c5167.f17935 = i4 - i2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49040(int i, int i2) {
        int[] iArr = this.f71574;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m49039(i3);
        int[] iArr2 = this.f71574;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill(this.f71574, i, i3, -1);
        ArrayList arrayList = this.f71575;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C5167 c5167 = (C5167) this.f71575.get(size);
            int i4 = c5167.f17935;
            if (i4 >= i) {
                c5167.f17935 = i4 + i2;
            }
        }
    }
}
