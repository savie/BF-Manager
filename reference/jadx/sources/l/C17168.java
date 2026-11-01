package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17168 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile String[] f54733 = new String[4];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean[] f54734;

    public C17168(int i) {
        m40085(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40085(int i) {
        boolean[] zArr = new boolean[4];
        for (int i2 = 0; i2 < 4; i2++) {
            zArr[i2] = (C23519.f76111[i2] & i) == 0;
        }
        this.f54734 = zArr;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m40088(int i) {
        return this.f54734[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m40089(int i) {
        return this.f54733[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m40087() {
        String[] strArr = this.f54733;
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (this.f54734[i2] && strArr[i2] == null) {
                i++;
            }
        }
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            if (this.f54734[i4] && strArr[i4] == null) {
                iArr[i3] = i4;
                i3++;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40086(ArrayList arrayList, int[] iArr) {
        if (iArr.length != arrayList.size()) {
            throw new IllegalArgumentException("Digest count does not match item count");
        }
        String[] strArr = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 >= 0 && i2 < 4) {
                String strM49424 = C22253.m49424(((InterfaceC20957) arrayList.get(i)).mo26268());
                if (strM49424.length() != C23519.f76112[i2]) {
                    throw new IllegalStateException("Unexpected digest length");
                }
                strArr[i] = strM49424;
            } else {
                throw new IllegalArgumentException("Unexpected checksum item index");
            }
        }
        String[] strArr2 = (String[]) this.f54733.clone();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            strArr2[iArr[i3]] = strArr[i3];
        }
        this.f54733 = strArr2;
    }
}
