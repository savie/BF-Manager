package l;

/* JADX INFO: renamed from: l.ۧ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4YZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11963 extends AbstractC25390 implements InterfaceC5252 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC11217 f38514;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17184 f38515;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11963(AbstractC17184 abstractC17184, InterfaceC11217 interfaceC11217, InterfaceC16438 interfaceC16438) {
        super(abstractC17184, interfaceC16438);
        this.f38515 = abstractC17184;
        this.f38514 = interfaceC11217;
    }

    @Override // l.AbstractC25390
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo7700() {
        return this.f38514.getLifecycle().mo23076().m8762(EnumC2619.STARTED);
    }

    @Override // l.InterfaceC5252
    /* JADX INFO: renamed from: ۙ */
    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        InterfaceC11217 interfaceC11218 = this.f38514;
        EnumC2619 enumC2619Mo23076 = interfaceC11218.getLifecycle().mo23076();
        if (enumC2619Mo23076 == EnumC2619.DESTROYED) {
            this.f38515.m40354(this.f81966);
            return;
        }
        EnumC2619 enumC2619 = null;
        while (enumC2619 != enumC2619Mo23076) {
            m56748(mo7700());
            enumC2619 = enumC2619Mo23076;
            enumC2619Mo23076 = interfaceC11218.getLifecycle().mo23076();
        }
    }

    @Override // l.AbstractC25390
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean mo29940(InterfaceC11217 interfaceC11217) {
        return this.f38514 == interfaceC11217;
    }

    @Override // l.AbstractC25390
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo29939() {
        this.f38514.getLifecycle().mo23078(this);
    }
}
