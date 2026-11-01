package l;

import java.util.ArrayList;
import org.bouncycastle.pqc.crypto.newhope.Reduce;

/* JADX INFO: renamed from: l.֫ۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56JZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1803 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6954;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f6955;

    public /* synthetic */ C1803(int i) {
        this();
    }

    public C1803() {
        this.f6954 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5886(C14505 c14505) {
        ArrayList<C23677> arrayList = this.f6954;
        if (!arrayList.isEmpty()) {
            int[] iArr = this.f6955;
            int i = 0;
            if (iArr != null) {
                C23677[] c23677Arr = new C23677[iArr.length];
                int[] iArr2 = new int[iArr.length];
                int[] iArr3 = new int[iArr.length];
                for (C23677 c23677 : arrayList) {
                    for (int i2 = 0; i2 < c23677.f76606; i2++) {
                        int i3 = c23677.f76605[i2];
                        if (i3 < this.f6955.length) {
                            C23677 c23678 = c23677Arr[i3];
                            if (c23678 == null) {
                                c23677Arr[i3] = c23677;
                            } else {
                                iArr2[i3] = c23678.f76603.m37867(c23677.f76603) | iArr2[i3];
                                iArr3[i3] = iArr3[i3] | c23677Arr[i3].f76604.m37867(c23677.f76604);
                            }
                        }
                    }
                }
                while (true) {
                    int[] iArr4 = this.f6955;
                    if (i >= iArr4.length) {
                        break;
                    }
                    if (c23677Arr[i] != null) {
                        int i4 = iArr2[i];
                        int i5 = i4 & 1835008;
                        if (i5 != 0 && i5 == (iArr4[i] & 1835008)) {
                            c14505.f47520++;
                        }
                        int i6 = iArr4[i];
                        if (i5 != (1835008 & i6)) {
                            c14505.f47522++;
                        }
                        c14505.f47523 = Integer.bitCount((i6 ^ i4) & Reduce.RMask) + c14505.f47523;
                        c14505.f47521 = Integer.bitCount(262143 & (iArr3[i] ^ this.f6955[i])) + c14505.f47521;
                    }
                    i++;
                }
            }
            return false;
        }
        return true;
    }
}
