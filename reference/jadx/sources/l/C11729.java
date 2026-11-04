package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۧܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9HP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11729 extends C6752 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8111 f37950;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f37951;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f37952;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C25398 f37953;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f37954;

    public C11729(EnumC15700 enumC15700, long j, long j2, long j3, C25398 c25398, AbstractC8111 abstractC8111, int i) {
        super(57, enumC15700, EnumC23906.SMB2_IOCTL, j, j2, Math.max(abstractC8111.mo2855(), i));
        this.f37954 = j3;
        this.f37953 = c25398;
        this.f37950 = abstractC8111;
        this.f37951 = true;
        this.f37952 = i;
    }

    @Override // l.C24652
    /* JADX INFO: renamed from: ᩸ */
    public final void mo7006(C7453 c7453) {
        c7453.m56023(this.f79801);
        c7453.m20461();
        c7453.m56025(this.f37954);
        this.f37953.m56760(c7453);
        AbstractC8111 abstractC8111 = this.f37950;
        int iMo2855 = abstractC8111.mo2855();
        if (iMo2855 > 0) {
            c7453.m56025(UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
            c7453.m56025(iMo2855);
        } else {
            c7453.m56025(0L);
            c7453.m56025(0L);
        }
        c7453.m56025(0L);
        c7453.m56025(0L);
        c7453.m56025(0L);
        c7453.m56025(this.f37952);
        c7453.m56025(this.f37951 ? 1L : 0L);
        c7453.m20460();
        while (abstractC8111.mo2855() > 0) {
            abstractC8111.m21989(c7453);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m29450() {
        return this.f37954;
    }
}
