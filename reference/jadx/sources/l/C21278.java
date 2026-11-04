package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.᩶ۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G8K7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21278 extends AbstractC0221 {
    public C21278(C23232 c23232, int i, long j, long j2) {
        long j3;
        long j4;
        C17359.requireNonNull(c23232);
        int i2 = c23232.f75251;
        C17277 c17277 = new C17277(c23232);
        C14564 c14564 = new C14564(c23232, i);
        long jM52211 = c23232.m52211();
        long j5 = c23232.f75256;
        int i3 = c23232.f75257;
        if (i3 > 0) {
            j3 = (((long) i3) + ((long) i2)) / 2;
            j4 = 1;
        } else {
            int i4 = c23232.f75254;
            j3 = ((((i4 != c23232.f75259 || i4 <= 0) ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF : i4) * ((long) c23232.f75252)) * ((long) c23232.f75250)) / 8;
            j4 = 64;
        }
        super(c17277, c14564, jM52211, j5, j, j2, j3 + j4, Math.max(6, i2));
    }
}
