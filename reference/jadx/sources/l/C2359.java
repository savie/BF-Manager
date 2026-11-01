package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۖۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes2.dex */
public final class C2359 extends AbstractC2982 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22116 f8326;

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۖ */
    public final AbstractC2982 mo5374() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2359(C22116 c22116, int i) {
        super(c22116, i);
        this.f8326 = c22116;
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo7179() {
        this.f8326.f71608.m25378(C10039.m25343(this.f11189) == 2 ? 92 : 89);
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7178() {
        this.f8326.f71608.m25378(C10039.m25343(this.f11189) == 2 ? 88 : 87);
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo7180(int i) {
        this.f8326.f71608.m25378(((C10039.m25343(i) - 1) * 3) + (C10039.m25343(this.f11189) == 2 ? 91 : 90));
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo7177() {
        return C10039.m25343(this.f11189);
    }

    public final String toString() {
        return C22697.m50267(new StringBuilder("stack("), InterfaceC2110.f7764[this.f11189], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
