package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20891 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f66874 = new int[128];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f66875 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47737(int i, int i2) {
        int i3 = this.f66875;
        if (i3 != 0) {
            if (i - (i3 == 0 ? 0 : this.f66874[i3 - 2]) == i2 - (i3 != 0 ? this.f66874[i3 - 1] : 0)) {
                return;
            }
        }
        int i4 = i3 + 2;
        int length = this.f66874.length;
        while (i4 > length) {
            length <<= 1;
        }
        int[] iArr = this.f66874;
        if (length < iArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (length != iArr.length) {
            this.f66874 = Arrays.copyOf(iArr, length);
        }
        int[] iArr2 = this.f66874;
        int i5 = this.f66875;
        iArr2[i5] = i;
        iArr2[i5 + 1] = i2;
        this.f66875 = i5 + 2;
    }
}
