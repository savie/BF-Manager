package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66CT */
/* JADX INFO: loaded from: classes5.dex */
public final class C19165 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7978[] f62010;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f62011;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f62012;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean[] f62013;

    public C19165(int[] iArr, String[] strArr, boolean[] zArr) {
        if (iArr.length != strArr.length || iArr.length != zArr.length) {
            throw new IllegalArgumentException("Mismatched node arrays");
        }
        this.f62011 = (int[]) iArr.clone();
        this.f62013 = (boolean[]) zArr.clone();
        this.f62012 = new int[iArr.length];
        this.f62010 = new C7978[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 < -1 || i2 >= i) {
                throw new IllegalArgumentException("Invalid parent index");
            }
            int[] iArr2 = this.f62012;
            iArr2[i] = i2 < 0 ? 0 : iArr2[i2] + 1;
            this.f62010[i] = C7978.m21763(strArr[i]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m44419(int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = i + 1;
        while (true) {
            int[] iArr = this.f62011;
            if (i2 >= iArr.length) {
                break;
            }
            int[] iArr2 = this.f62012;
            if (iArr2[i2] <= iArr2[i]) {
                break;
            }
            if (iArr[i2] == i) {
                arrayList.add(Integer.valueOf(i2));
            }
            i2++;
        }
        return arrayList;
    }
}
