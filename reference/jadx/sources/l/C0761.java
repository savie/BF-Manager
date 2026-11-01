package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.֨֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1TX */
/* JADX INFO: loaded from: classes2.dex */
public final class C0761 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long f3077 = m3276(256, 257, 0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m3275(long j) {
        long j2 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j;
        long j3 = j >>> 16;
        return j2 == 0 ? (int) (j3 & 511) : (-16777216) | ((int) (j3 & 16777215));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m3276(int i, int i2, int i3) {
        long j = i;
        return ((i2 & (-16777216)) == -16777216 ? ((((long) i2) & 16777215) << 16) | ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS : (((long) i2) & 511) << 16) | ((long) (i3 & SecP521R1Field.P16)) | ((i & (-16777216)) == -16777216 ? ((j & 16777215) << 40) | 512 : (j & 511) << 40);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m3277(long j) {
        long j2 = 512 & j;
        long j3 = j >>> 40;
        return j2 == 0 ? (int) (j3 & 511) : (-16777216) | ((int) (j3 & 16777215));
    }
}
