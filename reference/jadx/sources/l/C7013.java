package l;

/* JADX INFO: renamed from: l.ۜ᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7013 implements InterfaceC12741 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15481 f23578;

    public C7013(ActivityC15481 activityC15481) {
        this.f23578 = activityC15481;
    }

    @Override // l.InterfaceC12741
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18821(int i) {
        ActivityC15481 activityC15481 = this.f23578;
        activityC15481.f50435.f75409 = activityC15481.m37029(i).getPath();
        activityC15481.f50435.f75408 = null;
        activityC15481.m37026();
    }

    @Override // l.InterfaceC12741
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo18822(int i) {
        ActivityC15481.m37052(this.f23578, i);
    }

    @Override // l.InterfaceC12741
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18819() {
        ActivityC15481 activityC15481 = this.f23578;
        AbstractC17679 abstractC17679 = activityC15481.f50442;
        abstractC17679.getClass();
        if ((abstractC17679 instanceof C9214) || C13012.m32190(activityC15481.m37050()) || activityC15481.f50444 == null || !activityC15481.f50444.m1132(activityC15481.f50442.mo19708())) {
            activityC15481.m37054(!activityC15481.f50435.f75412);
        } else {
            activityC15481.f50444.m1120();
        }
    }

    @Override // l.InterfaceC12741
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18820(float f) {
        ActivityC15481 activityC15481 = this.f23578;
        float f2 = 1.0f - f;
        activityC15481.f41645.setAlpha(f2);
        activityC15481.f50438.setAlpha(f2);
        boolean z = activityC15481.f50457 > 0.0f;
        activityC15481.f50457 = f;
        if (z != (f > 0.0f)) {
            if (!activityC15481.f50450 && !activityC15481.isFinishing() && !activityC15481.isDestroyed()) {
                if (f > 0.0f && activityC15481.f50455) {
                    activityC15481.m37030(true);
                } else if (f == 0.0f && activityC15481.f50449) {
                    activityC15481.m37030(false);
                }
            }
            activityC15481.m37069();
        }
    }

    @Override // l.InterfaceC12741
    public final void onDismiss() {
        this.f23578.m37044(true);
    }
}
