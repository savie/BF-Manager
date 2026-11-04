package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܺۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes5.dex */
public final class C16548 extends AbstractC17294 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6108 f53562;

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ۫ */
    public final int mo5781() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16548(C6108 c6108, AbstractC22664 abstractC22664) {
        super(c6108, C8935.m23847(abstractC22664));
        this.f53562 = c6108;
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC17294 mo5785() {
        C6108 c6108 = this.f53562;
        C8935 c8935 = c6108.f20850;
        int i = this.f56323;
        c8935.m23883(i + 46);
        return c6108.f20855[i];
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ܳ */
    public final void mo28618() {
        this.f53562.f20850.m23883(this.f56323 + 79);
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5783() {
        this.f53562.f20850.m23883(92);
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ۙ */
    public final void mo5778() {
        this.f53562.f20850.m23883(88);
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5784(int i) {
        this.f53562.f20850.m23883(((C8935.m23845(i) - 1) * 3) + 91);
    }

    public final String toString() {
        return C8947.m23910(new StringBuilder("indexed("), InterfaceC25169.f81357[this.f56323], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
