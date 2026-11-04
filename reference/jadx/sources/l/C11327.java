package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۧۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes4.dex */
public final class C11327 extends C12073 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6108 f35681;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11327(C6108 c6108, AbstractC11781 abstractC11781) {
        super(c6108, abstractC11781);
        this.f35681 = c6108;
    }

    @Override // l.C12073, l.AbstractC17294
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC17294 mo5785() {
        AbstractC11781 abstractC11781 = this.f38880;
        C11972.m30026(abstractC11781.f38066 == EnumC13603.f43205);
        C6108 c6108 = this.f35681;
        int iM23847 = C8935.m23847(abstractC11781.mo29576(c6108.f20853));
        c6108.f20850.m23875((InterfaceC8344) abstractC11781);
        return c6108.f20855[iM23847];
    }

    @Override // l.C12073, l.AbstractC17294
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo28618() {
        C11972.m30024("this method shouldn't be invoked");
        throw null;
    }

    @Override // l.C12073, l.AbstractC17294
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC17294 mo28617() {
        AbstractC11781 abstractC11781 = this.f38880;
        C11972.m30026(abstractC11781.f38066 == EnumC13603.f43218);
        C6108 c6108 = this.f35681;
        C23191 c23191 = (C23191) abstractC11781.mo29576(c6108.f20853);
        int iM23847 = C8935.m23847(c23191.f75156);
        c6108.f20850.m23877((C18582) abstractC11781, c23191);
        return c6108.f20855[iM23847];
    }

    @Override // l.C12073
    public final String toString() {
        return "dynamic(" + this.f38880 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
