package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩹ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes.dex */
public final class C23262 extends AbstractC17294 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC11781 f75374;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6108 f75375;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f75376;

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ۫ */
    public final int mo5781() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23262(C6108 c6108, AbstractC11781 abstractC11781, boolean z) {
        super(c6108, C8935.m23847(abstractC11781.mo29576(c6108.f20853)));
        this.f75375 = c6108;
        this.f75374 = abstractC11781;
        this.f75376 = z;
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC17294 mo5785() {
        C6108 c6108 = this.f75375;
        C8935 c8935 = c6108.f20850;
        C20035 c20035 = c8935.f29132.f50605;
        AbstractC11781 abstractC11781 = this.f75374;
        c8935.m23870(180, C20035.m46076(c20035, abstractC11781), abstractC11781);
        return c6108.f20855[this.f56323];
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ܳ */
    public final void mo28618() {
        C8935 c8935 = this.f75375.f20850;
        C20035 c20035 = c8935.f29132.f50605;
        AbstractC11781 abstractC11781 = this.f75374;
        c8935.m23870(181, C20035.m46076(c20035, abstractC11781), abstractC11781);
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC17294 mo28617() {
        C6108 c6108 = this.f75375;
        C24705 c24705 = c6108.f20853;
        C8935 c8935 = c6108.f20850;
        AbstractC11781 abstractC11781 = this.f75374;
        C23191 c23191 = (C23191) abstractC11781.m29598(c24705);
        int iM23847 = C8935.m23847(c23191.f75156);
        long jMo29591 = abstractC11781.f38069.mo29591() & 512;
        boolean z = this.f75376;
        if (jMo29591 != 0 && !z) {
            c8935.m23876(abstractC11781, c23191);
        } else if (z) {
            c8935.m23896(abstractC11781, c23191);
        } else {
            c8935.m23898(abstractC11781, c23191);
        }
        return c6108.f20855[iM23847];
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5783() {
        this.f75375.f20855[4].mo5783();
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ۙ */
    public final void mo5778() {
        this.f75375.f20855[4].mo5778();
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5784(int i) {
        this.f75375.f20855[4].mo5784(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("member(");
        sb.append(this.f75374);
        sb.append(this.f75376 ? " nonvirtual)" : MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
