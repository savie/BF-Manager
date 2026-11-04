package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۨۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes4.dex */
public class C12073 extends AbstractC17294 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC11781 f38880;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6108 f38881;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12073(C6108 c6108, AbstractC11781 abstractC11781) {
        super(c6108, C8935.m23847(abstractC11781.mo29576(c6108.f20853)));
        this.f38881 = c6108;
        this.f38880 = abstractC11781;
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩸ */
    public AbstractC17294 mo5785() {
        C6108 c6108 = this.f38881;
        C8935 c8935 = c6108.f20850;
        C20035 c20035 = c8935.f29132.f50605;
        AbstractC11781 abstractC11781 = this.f38880;
        c8935.m23870(178, C20035.m46076(c20035, abstractC11781), abstractC11781);
        return c6108.f20855[this.f56323];
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ܳ */
    public void mo28618() {
        C8935 c8935 = this.f38881.f20850;
        C20035 c20035 = c8935.f29132.f50605;
        AbstractC11781 abstractC11781 = this.f38880;
        c8935.m23870(179, C20035.m46076(c20035, abstractC11781), abstractC11781);
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ۤ */
    public AbstractC17294 mo28617() {
        C6108 c6108 = this.f38881;
        C24705 c24705 = c6108.f20853;
        AbstractC11781 abstractC11781 = this.f38880;
        C23191 c23191 = (C23191) abstractC11781.mo29576(c24705);
        int iM23847 = C8935.m23847(c23191.f75156);
        c6108.f20850.m23885(abstractC11781, c23191);
        return c6108.f20855[iM23847];
    }

    public String toString() {
        return "static(" + this.f38880 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
