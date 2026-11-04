package l;

import java.util.ArrayList;
import org.bouncycastle.pqc.crypto.newhope.Reduce;

/* JADX INFO: renamed from: l.ᩳۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56JZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19008 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f61572;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f61573;

    public /* synthetic */ C19008(int i) {
        this();
    }

    public C19008() {
        this.f61572 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44097(C7821 c7821) {
        ArrayList<C0363> arrayList = this.f61572;
        if (!arrayList.isEmpty()) {
            int[] iArr = this.f61573;
            int i = 0;
            if (iArr != null) {
                C0363[] c0363Arr = new C0363[iArr.length];
                int[] iArr2 = new int[iArr.length];
                int[] iArr3 = new int[iArr.length];
                for (C0363 c0363 : arrayList) {
                    for (int i2 = 0; i2 < c0363.f1876; i2++) {
                        int i3 = c0363.f1875[i2];
                        if (i3 < this.f61573.length) {
                            C0363 c0364 = c0363Arr[i3];
                            if (c0364 == null) {
                                c0363Arr[i3] = c0363;
                            } else {
                                iArr2[i3] = c0364.f1877.m47026(c0363.f1877) | iArr2[i3];
                                iArr3[i3] = iArr3[i3] | c0363Arr[i3].f1874.m47026(c0363.f1874);
                            }
                        }
                    }
                }
                while (true) {
                    int[] iArr4 = this.f61573;
                    if (i >= iArr4.length) {
                        break;
                    }
                    if (c0363Arr[i] != null) {
                        int i4 = iArr2[i];
                        int i5 = i4 & 1835008;
                        if (i5 != 0 && i5 == (iArr4[i] & 1835008)) {
                            c7821.f26046++;
                        }
                        int i6 = iArr4[i];
                        if (i5 != (1835008 & i6)) {
                            c7821.f26044++;
                        }
                        c7821.f26045 = Integer.bitCount((i6 ^ i4) & Reduce.RMask) + c7821.f26045;
                        c7821.f26043 = Integer.bitCount(262143 & (iArr3[i] ^ this.f61573[i])) + c7821.f26043;
                    }
                    i++;
                }
            }
            return false;
        }
        return true;
    }
}
