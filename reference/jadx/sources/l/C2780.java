package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۖܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09F6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2780 extends C6752 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C25398 f9164;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C0653 f9165;

    public C2780(EnumC15700 enumC15700, C25398 c25398, long j, long j2, C0653 c0653, int i) {
        super(49, enumC15700, EnumC23906.SMB2_WRITE, j, j2, Math.min(i, c0653.mo2855()));
        this.f9164 = c25398;
        this.f9165 = c0653;
    }

    @Override // l.C24652
    /* JADX INFO: renamed from: ᩸ */
    public final void mo7006(C7453 c7453) {
        c7453.m56023(this.f79801);
        c7453.m56023(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        c7453.m56025(m18853());
        C0653 c0653 = this.f9165;
        c7453.m56014(c0653.m21991());
        this.f9164.m56760(c7453);
        c7453.m56025(0L);
        c7453.m56025(Math.max(0, c0653.mo2855() - m18853()));
        c7453.m56023(0);
        c7453.m56023(0);
        c7453.m56025(0L);
        c0653.m21990(c7453, ((C18684) mo3632()).m43470());
    }

    @Override // l.AbstractC4625
    /* JADX INFO: renamed from: ۤ */
    public final int mo3628() {
        return m18853() + UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }
}
