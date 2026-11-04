package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩵ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes5.dex */
public final class C20278 extends AbstractC17294 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6108 f65097;

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC17294 mo5785() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20278(C6108 c6108, int i) {
        super(c6108, i);
        this.f65097 = c6108;
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5783() {
        this.f65097.f20850.m23883(C8935.m23845(this.f56323) == 2 ? 92 : 89);
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ۙ */
    public final void mo5778() {
        this.f65097.f20850.m23883(C8935.m23845(this.f56323) == 2 ? 88 : 87);
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5784(int i) {
        this.f65097.f20850.m23883(((C8935.m23845(i) - 1) * 3) + (C8935.m23845(this.f56323) == 2 ? 91 : 90));
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ۫ */
    public final int mo5781() {
        return C8935.m23845(this.f56323);
    }

    public final String toString() {
        return C8947.m23910(new StringBuilder("stack("), InterfaceC25169.f81357[this.f56323], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
