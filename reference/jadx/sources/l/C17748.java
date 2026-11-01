package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ᩳ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 09F6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17748 extends C13888 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C6396 f56309;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3923 f56310;

    public C17748(EnumC20508 enumC20508, C6396 c6396, long j, long j2, C3923 c3923, int i) {
        super(49, enumC20508, EnumC2162.SMB2_WRITE, j, j2, Math.min(i, c3923.mo11383()));
        this.f56309 = c6396;
        this.f56310 = c3923;
    }

    @Override // l.C11771
    /* JADX INFO: renamed from: ۖ */
    public final void mo3384(C19240 c19240) {
        c19240.m27396(this.f39515);
        c19240.m27396(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        c19240.m27398(m33724());
        C3923 c3923 = this.f56310;
        c19240.m27392(c3923.m18241());
        this.f56309.m17542(c19240);
        c19240.m27398(0L);
        c19240.m27398(Math.max(0, c3923.mo11383() - m33724()));
        c19240.m27396(0);
        c19240.m27396(0);
        c19240.m27398(0L);
        c3923.m18243(c19240, ((C1186) mo25478()).m4326());
    }

    @Override // l.AbstractC10068
    /* JADX INFO: renamed from: ۨ */
    public final int mo25477() {
        return m33724() + UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }
}
