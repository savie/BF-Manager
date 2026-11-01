package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۧۘ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes3.dex */
public final class C10745 extends AbstractC2982 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22116 f36641;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC2982 f36642;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10745(C22116 c22116, AbstractC2982 abstractC2982) {
        super(c22116, abstractC2982.f11189);
        this.f36641 = c22116;
        this.f36642 = abstractC2982;
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۖ */
    public final AbstractC2982 mo5374() {
        AbstractC2982 abstractC2982 = this.f36642;
        int i = this.f11189;
        abstractC2982.mo7180(i);
        abstractC2982.mo8879();
        return this.f36641.f71611[i];
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ܰ */
    public final void mo7179() {
        mo5374().mo7179();
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۙ */
    public final void mo7178() {
        this.f36642.mo8879();
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ܰ */
    public final void mo7180(int i) {
        C6171.m17170();
        throw null;
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ֨ */
    public final int mo7177() {
        return C10039.m25343(this.f11189) + this.f36642.mo7177();
    }

    public final String toString() {
        return "assign(lhs = " + this.f36642 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
