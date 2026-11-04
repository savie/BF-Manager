package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18513 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f60204;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f60205;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43100(int i) {
        int[] iArr = this.f60204;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f60204 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f60204 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.f60204;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43099() {
        int[] iArr = this.f60204;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f60205 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43102(int i, int i2) {
        int[] iArr = this.f60204;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m43100(i3);
        int[] iArr2 = this.f60204;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = this.f60204;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = this.f60205;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C21497 c21497 = (C21497) this.f60205.get(size);
            int i4 = c21497.f68717;
            if (i4 >= i) {
                if (i4 < i3) {
                    this.f60205.remove(size);
                } else {
                    c21497.f68717 = i4 - i2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43101(int i, int i2) {
        int[] iArr = this.f60204;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m43100(i3);
        int[] iArr2 = this.f60204;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill(this.f60204, i, i3, -1);
        ArrayList arrayList = this.f60205;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C21497 c21497 = (C21497) this.f60205.get(size);
            int i4 = c21497.f68717;
            if (i4 >= i) {
                c21497.f68717 = i4 + i2;
            }
        }
    }
}
