package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ۨ᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12017 extends AbstractC0871 {
    public C12017(C23451 c23451, int i, long j, long j2) {
        long j3;
        long j4;
        C13638.requireNonNull(c23451);
        int i2 = c23451.f75955;
        C3145 c3145 = new C3145(1, c23451);
        C14134 c14134 = new C14134(c23451, i);
        long jM51685 = c23451.m51685();
        long j5 = c23451.f75957;
        int i3 = c23451.f75952;
        if (i3 > 0) {
            j3 = (((long) i3) + ((long) i2)) / 2;
            j4 = 1;
        } else {
            int i4 = c23451.f75948;
            j3 = ((((i4 != c23451.f75949 || i4 <= 0) ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF : i4) * ((long) c23451.f75954)) * ((long) c23451.f75951)) / 8;
            j4 = 64;
        }
        super(c3145, c14134, jM51685, j5, j, j2, j3 + j4, Math.max(6, i2));
    }
}
