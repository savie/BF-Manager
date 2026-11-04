package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ۢۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 56LP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9899 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18850 m25718(long j, int i, int i2, int i3, long j2) {
        for (int i4 = 1; i4 <= 32768; i4 *= 2) {
            long jM33204 = (C13519.m33204(i, i2, i4) * ((long) i3)) + j;
            if (C13519.m33203(i, i4) <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX && C13519.m33203(i2, i4) <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX && jM33204 <= j2) {
                return new C18850(i4, jM33204);
            }
        }
        throw new C18740("Animation workspace exceeds allocation limit");
    }
}
