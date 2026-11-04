package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡ۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0366 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile String[] f1885 = new String[4];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean[] f1886;

    public C0366(int i) {
        m2138(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2138(int i) {
        boolean[] zArr = new boolean[4];
        for (int i2 = 0; i2 < 4; i2++) {
            zArr[i2] = (C10060.f32250[i2] & i) == 0;
        }
        this.f1886 = zArr;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m2141(int i) {
        return this.f1886[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m2142(int i) {
        return this.f1885[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m2140() {
        String[] strArr = this.f1885;
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (this.f1886[i2] && strArr[i2] == null) {
                i++;
            }
        }
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            if (this.f1886[i4] && strArr[i4] == null) {
                iArr[i3] = i4;
                i3++;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2139(ArrayList arrayList, int[] iArr) {
        if (iArr.length != arrayList.size()) {
            throw new IllegalArgumentException("Digest count does not match item count");
        }
        String[] strArr = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 >= 0 && i2 < 4) {
                String strM36182 = C15022.m36182(((InterfaceC16199) arrayList.get(i)).mo38425());
                if (strM36182.length() != C10060.f32249[i2]) {
                    throw new IllegalStateException("Unexpected digest length");
                }
                strArr[i] = strM36182;
            } else {
                throw new IllegalArgumentException("Unexpected checksum item index");
            }
        }
        String[] strArr2 = (String[]) this.f1885.clone();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            strArr2[iArr[i3]] = strArr[i3];
        }
        this.f1885 = strArr2;
    }
}
