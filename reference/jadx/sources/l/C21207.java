package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.᩷᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 56LP */
/* JADX INFO: loaded from: classes4.dex */
public final class C21207 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7802 m47667(long j, int i, int i2, int i3, long j2) {
        for (int i4 = 1; i4 <= 32768; i4 *= 2) {
            long jM39174 = (C16704.m39174(i, i2, i4) * ((long) i3)) + j;
            if (C16704.m39173(i, i4) <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX && C16704.m39173(i2, i4) <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX && jM39174 <= j2) {
                return new C7802(i4, jM39174);
            }
        }
        throw new C10354("Animation workspace exceeds allocation limit");
    }
}
