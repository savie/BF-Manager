package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֫ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes3.dex */
public final class C1633 extends AbstractC17294 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C21615 f5650;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C21615 f5651;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC8036 f5652;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6108 f5653;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f5654;

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1633 mo5782() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1633(C6108 c6108, int i, C21615 c21615, C21615 c21616) {
        super(c6108, 5);
        this.f5653 = c6108;
        this.f5654 = i;
        this.f5651 = c21615;
        this.f5650 = c21616;
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC17294 mo5785() {
        C21615 c21615M23866;
        C21615 c21615M5777 = m5777();
        boolean zM5779 = m5779();
        C6108 c6108 = this.f5653;
        if (zM5779) {
            c21615M23866 = null;
        } else {
            c6108.f20850.m23878(this.f5651);
            c6108.f20850.m23883(4);
            c21615M23866 = c6108.f20850.m23866(167);
        }
        if (c21615M5777 != null) {
            c6108.f20850.m23878(c21615M5777);
            c6108.f20850.m23883(3);
        }
        c6108.f20850.m23878(c21615M23866);
        return c6108.f20855[this.f56323];
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo5783() {
        mo5785().mo5783();
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5778() {
        mo5785().mo5778();
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo5784(int i) {
        C11972.m30019();
        throw null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21615 m5780() {
        AbstractC8036 abstractC8036 = this.f5652;
        int i = this.f5654;
        C21615 c21615 = this.f5651;
        C6108 c6108 = this.f5653;
        if (abstractC8036 == null) {
            return C8935.m23848(c21615, c6108.f20850.m23866(i));
        }
        int iM23892 = c6108.f20850.m23892();
        C21615 c21615M23848 = C8935.m23848(c21615, c6108.f20850.m23866(i));
        C8935 c8935 = c6108.f20850;
        c8935.f29159.m52917(this.f5652, 128, iM23892, c8935.m23892());
        return c21615M23848;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21615 m5777() {
        AbstractC8036 abstractC8036 = this.f5652;
        int i = this.f5654;
        C21615 c21615 = this.f5650;
        C6108 c6108 = this.f5653;
        if (abstractC8036 == null) {
            return C8935.m23848(c21615, c6108.f20850.m23866(C8935.m23853(i)));
        }
        int iM23892 = c6108.f20850.m23892();
        C21615 c21615M23848 = C8935.m23848(c21615, c6108.f20850.m23866(C8935.m23853(i)));
        C8935 c8935 = c6108.f20850;
        c8935.f29159.m52917(this.f5652, 256, iM23892, c8935.m23892());
        return c21615M23848;
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int mo5781() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m5779() {
        return this.f5651 == null && this.f5654 == 168;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("cond(");
        int i = C8935.f29131;
        return C8947.m23910(sb, C8190.f27010[this.f5654], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
