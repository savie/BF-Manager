package l;

/* JADX INFO: renamed from: l.ۙۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4595 implements InterfaceC21063 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7109 f16263;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f16264;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f16265;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f16266;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f16267;

    public C4595(boolean[] zArr, ActivityC7109 activityC7109, AbstractActivityC12483 abstractActivityC12483, DialogInterfaceC19356 dialogInterfaceC19356, C12562 c12562) {
        this.f16265 = zArr;
        this.f16263 = activityC7109;
        this.f16264 = abstractActivityC12483;
        this.f16267 = dialogInterfaceC19356;
        this.f16266 = c12562;
    }

    @Override // l.InterfaceC21063
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo12741() {
        boolean[] zArr = this.f16265;
        zArr[0] = true;
        ActivityC7109 activityC7109 = this.f16263;
        if (activityC7109 != null) {
            activityC7109.m18999(true);
        }
        ActivityC7109 activityC71010 = this.f16263;
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f16267;
        AbstractActivityC12483 abstractActivityC12483 = this.f16264;
        abstractActivityC12483.m30998(new RunnableC3039(zArr, activityC71010, dialogInterfaceC19356, abstractActivityC12483, this.f16266, 0));
    }

    @Override // l.InterfaceC21063
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12740() {
        boolean[] zArr = this.f16265;
        if (zArr[0]) {
            zArr[0] = false;
            this.f16264.m30998((Runnable) null);
            ActivityC7109 activityC7109 = this.f16263;
            if (activityC7109 != null) {
                activityC7109.m18999(false);
            }
        }
    }
}
