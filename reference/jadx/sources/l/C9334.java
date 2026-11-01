package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۢۘ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes3.dex */
public final class C9334 extends AbstractC2982 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22116 f31684;

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ֨ */
    public final int mo7177() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9334(C22116 c22116, AbstractC16579 abstractC16579) {
        super(c22116, C10039.m25336(abstractC16579));
        this.f31684 = c22116;
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۖ */
    public final AbstractC2982 mo5374() {
        C22116 c22116 = this.f31684;
        C10039 c10039 = c22116.f71608;
        int i = this.f11189;
        c10039.m25378(i + 46);
        return c22116.f71611[i];
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ᩹ */
    public final void mo8879() {
        this.f31684.f71608.m25378(this.f11189 + 79);
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ܰ */
    public final void mo7179() {
        this.f31684.f71608.m25378(92);
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۙ */
    public final void mo7178() {
        this.f31684.f71608.m25378(88);
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ܰ */
    public final void mo7180(int i) {
        this.f31684.f71608.m25378(((C10039.m25343(i) - 1) * 3) + 91);
    }

    public final String toString() {
        return C22697.m50267(new StringBuilder("indexed("), InterfaceC2110.f7764[this.f11189], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
