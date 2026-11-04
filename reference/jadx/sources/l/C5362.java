package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۚۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes3.dex */
public final class C5362 extends AbstractC17294 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC17294 f18806;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6108 f18807;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5362(C6108 c6108, AbstractC17294 abstractC17294) {
        super(c6108, abstractC17294.f56323);
        this.f18807 = c6108;
        this.f18806 = abstractC17294;
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC17294 mo5785() {
        AbstractC17294 abstractC17294 = this.f18806;
        int i = this.f56323;
        abstractC17294.mo5784(i);
        abstractC17294.mo28618();
        return this.f18807.f20855[i];
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5783() {
        mo5785().mo5783();
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ۙ */
    public final void mo5778() {
        this.f18806.mo28618();
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5784(int i) {
        C11972.m30019();
        throw null;
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ۫ */
    public final int mo5781() {
        return C8935.m23845(this.f56323) + this.f18806.mo5781();
    }

    public final String toString() {
        return "assign(lhs = " + this.f18806 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
