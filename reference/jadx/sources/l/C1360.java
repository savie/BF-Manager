package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.pqc.crypto.newhope.Params;

/* JADX INFO: renamed from: l.֨ᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V5QL */
/* JADX INFO: loaded from: classes2.dex */
public final class C1360 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f4845;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f4846;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f4847;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f4848;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f4849;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5008() {
        int i;
        int i2;
        int i3;
        int i4 = this.f4845;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.f4846;
            int i7 = this.f4847;
            if (i6 > i7) {
                i3 = 1;
            } else {
                i3 = i6 == i7 ? 2 : 4;
            }
            if ((i3 & i4) == 0) {
                return false;
            }
        }
        if ((i4 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) != 0) {
            int i8 = this.f4846;
            int i9 = this.f4849;
            if (i8 > i9) {
                i2 = 1;
            } else {
                i2 = i8 == i9 ? 2 : 4;
            }
            if (((i2 << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & Params.POLY_BYTES) != 0) {
            int i10 = this.f4848;
            int i11 = this.f4847;
            if (i10 > i11) {
                i = 1;
            } else {
                i = i10 == i11 ? 2 : 4;
            }
            if (((i << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & UMModuleRegister.SHARE_EVENT_VALUE_HIGH) != 0) {
            int i12 = this.f4848;
            int i13 = this.f4849;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if ((i4 & (i5 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
