package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ܿܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J9HP */
/* JADX INFO: loaded from: classes5.dex */
public final class C17415 extends C13888 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C6396 f55413;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC6746 f55414;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f55415;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f55416;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f55417;

    public C17415(EnumC20508 enumC20508, long j, long j2, long j3, C6396 c6396, AbstractC6746 abstractC6746, int i) {
        super(57, enumC20508, EnumC2162.SMB2_IOCTL, j, j2, Math.max(abstractC6746.mo11383(), i));
        this.f55417 = j3;
        this.f55413 = c6396;
        this.f55414 = abstractC6746;
        this.f55416 = true;
        this.f55415 = i;
    }

    @Override // l.C11771
    /* JADX INFO: renamed from: ۖ */
    public final void mo3384(C19240 c19240) {
        c19240.m27396(this.f39515);
        c19240.m44196();
        c19240.m27398(this.f55417);
        this.f55413.m17542(c19240);
        AbstractC6746 abstractC6746 = this.f55414;
        int iMo11383 = abstractC6746.mo11383();
        if (iMo11383 > 0) {
            c19240.m27398(UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
            c19240.m27398(iMo11383);
        } else {
            c19240.m27398(0L);
            c19240.m27398(0L);
        }
        c19240.m27398(0L);
        c19240.m27398(0L);
        c19240.m27398(0L);
        c19240.m27398(this.f55415);
        c19240.m27398(this.f55416 ? 1L : 0L);
        c19240.m44195();
        while (abstractC6746.mo11383() > 0) {
            abstractC6746.m18242(c19240);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m40580() {
        return this.f55417;
    }
}
